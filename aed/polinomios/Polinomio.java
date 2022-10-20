package aed.polinomios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiFunction;

import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.indexedlist.IndexedList;
import es.upm.aedlib.positionlist.*;


/**
 * Operaciones sobre polinomios de una variable con coeficientes enteros.
 */
public class Polinomio {

  // Una lista de monomios
  PositionList<Monomio> terms;

  /**
   * Crea el polinomio "0".
   */
  public Polinomio() {
    terms = new NodePositionList<>();
  }

  /**
   * Crea un polinomio definado por una lista con monomios.
   * @param terms una lista de monomios
   */
  public Polinomio(PositionList<Monomio> terms) {
    this.terms = terms;
  }

  /**
   * Crea un polinomio definado por un String.
   * La representación del polinomio es una secuencia de monomios separados
   * por '+' (y posiblemente con caracteres blancos).
   * Un monomio esta compuesto por tres partes,
   * el coefficiente (un entero), el caracter 'x' (el variable), y el exponente
   * compuesto por un un caracter '^' seguido por un entero.
   * Se puede omitir multiples partes de un monomio, 
   * ejemplos:
   * <pre>
   * {@code
   * new Polinomio("2x^3 + 9");
   * new Polinomio("2x^3 + -9");
   * new Polinomio("x");   // == 1x^1
   * new Polinomio("5");   // == 5x^0
   * new Polinomio("8x");  // == 8x^1
   * new Polinomio("0");   // == 0x^0
   * }
   * </pre>
   * @throws IllegalArgumentException si el argumento es malformado
   * @param polinomio - una secuencia de monomios separados por '+'
   */
  public Polinomio(String polinomio) {
		this.terms = new NodePositionList<>();
		String[] pol = polinomio.trim().split("\\+");
		if (!polinomio.trim().equals("0")) {
			for (int i = 0; i < pol.length; i++) {
				int index = pol[i].trim().indexOf('x');
				if (index != -1) {
					if (index == 0) {
						if (pol[i].trim().indexOf('^') != -1) {
							String exponente = pol[i].trim().substring(pol[i].trim().indexOf('^') + 1,
									pol[i].trim().length());
							terms.addLast(new Monomio(1, Integer.parseInt(exponente)));
						} else
							terms.addLast(new Monomio(1, 1));
					} else {
						if (pol[i].trim().indexOf('x') != (pol[i].trim().length() - 1)
								&& pol[i].trim().contains("x+")) {
							String coeficiente = pol[i].trim().substring(0, index);
							String exponente = pol[i].trim().concat("1").substring(pol[i].trim().indexOf("^") + 1,
									pol[i].trim().length());
							terms.addLast(new Monomio(Integer.parseInt(coeficiente), Integer.parseInt(exponente)));
						} else if (pol[i].trim().indexOf('x') != (pol[i].trim().length() - 1)) {
							String coeficiente = pol[i].trim().substring(0, index);
							String exponente = pol[i].trim().substring(pol[i].trim().indexOf('^') + 1,
									pol[i].trim().length());
							terms.addLast(new Monomio(Integer.parseInt(coeficiente), Integer.parseInt(exponente)));
						} else {
							String coeficiente = pol[i].trim().substring(0, index);
							terms.addLast(new Monomio(Integer.parseInt(coeficiente), 1));
						}
					}
				} else {
					String coeficiente = pol[i].trim().substring(0, pol[i].trim().length());
					terms.addLast(new Monomio(Integer.parseInt(coeficiente), 0));
				}
			}
		}
	}
	
	@Override
	/**
	 * metodo que nos dice si dos polinomios son iguales
	 */
	public boolean equals(Object obj) {
		boolean igual = true;
		if (this == obj)
			return true;
		if (obj instanceof Polinomio) {
			Polinomio otherPolinomio = (Polinomio) obj;
			Position<Monomio> cursor1 = this.terms.first();
			Position<Monomio> cursor2 = otherPolinomio.terms.first();
			if (cursor1 == null || cursor2 == null) {
				if (cursor1 != cursor2) {
					igual = false;
				} else {
					return igual;
				}
			} else {
				while (cursor1 != null && cursor2 != null && igual) {
					if (!iguales(cursor1.element(), cursor2.element())) {
						igual = false;
					}
					cursor1 = this.terms.next(cursor1);
					cursor2 = otherPolinomio.terms.next(cursor2);
				}
			}
			return igual;
		} else
			return false;
	}

/**
 * Suma dos polinomios.
 * @param p1 primer polinomio.
 * @param p2 segundo polinomio.
 * @return la suma de los polinomios.
 */
	public static Polinomio suma(Polinomio p1, Polinomio p2) {
		Polinomio resSuma = new Polinomio();
		if (p1.terms.isEmpty()) {
			resSuma = p2;
		} else if (p2.terms.isEmpty()) {
			resSuma = p1;
		} else {
			Position<Monomio> prev1 = p1.terms.first();
			Position<Monomio> prev2 = p2.terms.first();
			cortoLargo(p1, p2);
			// vamos aniadiendo ordenadamente los terminos y desplazandonos a los siguientes terminos a sumar en los polinomios
			while (prev2 != null || prev1 != null) {
				if (prev1 == null
						|| (prev2 != null && prev1.element().getExponente() < prev2.element().getExponente())) {
					resSuma.terms.addLast(prev2.element());
					prev2 = p2.terms.next(prev2);
				} else if (prev2 == null
						|| (prev1 != null && prev1.element().getExponente() > prev2.element().getExponente())) {
					resSuma.terms.addLast(prev1.element());
					prev1 = p1.terms.next(prev1);
				} else {
					resSuma.terms
							.addLast(new Monomio(prev1.element().getCoeficiente() + prev2.element().getCoeficiente(),
									prev1.element().getExponente()));
					prev1 = p1.terms.next(prev1);
					prev2 = p2.terms.next(prev2);
				}
			}
		}
		return resSuma;
	}

	/**
	 * metodo que nos asegura que el primer parametro sea mas corto o igual en numero de terminos que el segundo
	 */
	public static void cortoLargo(Polinomio p1, Polinomio p2) {
		if (p1.terms.size() > p2.terms.size()) {
			Polinomio aux = p1;
			p1 = p2;
			p2 = aux;
		}
	}
  
/**
 * Substraccion de dos polinomios.
 * @param p1 primer polinomio.
 * @param p2 segundo polinomio.
 * @return la resta de los polinomios.
 */
	public static Polinomio resta(Polinomio p1, Polinomio p2) {
		Polinomio resResta = new Polinomio();
		Polinomio resRestaAux = new Polinomio();
		// cambiamos de signo el sustraendo
		Polinomio p2Negativo = multiplica(new Monomio(-1, 0), p2);
		resRestaAux = suma(p1, p2Negativo);
		// quitamos los 0's que se pudiesen haber generado en la resta
		while (resRestaAux.terms.size() != 0) {
			if (resRestaAux.terms.first().element().getLeft() != 0) {
				resResta.terms.addLast(resRestaAux.terms.first().element());
				resRestaAux.terms.remove(resRestaAux.terms.first());
			} else {
				resRestaAux.terms.remove(resRestaAux.terms.first());
			}
		}
		return resResta;
	}

/**
 * Calcula el producto de un monomio y un polinomio.
 * @param m el monomio
 * @param p el polinomio
 * @return el producto del monomio y el polinomio
 */
	public static Polinomio multiplica(Polinomio p1, Polinomio p2) {
		Position<Monomio> cursor = p1.terms.first();
		Polinomio resPolxPol = new Polinomio();
		// llamamos a esta funcion para que el cursor recorra el polinomio mas corto
		cortoLargo(p1, p2);
		if (!p1.terms.isEmpty() && !p2.terms.isEmpty()) {
			while (cursor != null) {
				resPolxPol = suma(multiplica(cursor.element(), p2), resPolxPol);
				cursor = p1.terms.next(cursor);
			}
		}
		return resPolxPol;
	}

/**
 * Calcula el producto de dos polinomios.
 * @param p1 primer polinomio.
 * @param p2 segundo polinomio.
 * @return el producto de los polinomios.
 */
	public static Polinomio multiplica(Monomio t, Polinomio p) {
		Polinomio resMonxPol = new Polinomio();
		if (t != null && p != null) {
			Position<Monomio> prev = p.terms.first();
			Position<Monomio> cursor = p.terms.next(prev);
			while (cursor != null) {
				resMonxPol.terms.addLast(new Monomio(t.getCoeficiente() * prev.element().getCoeficiente(),
						t.getExponente() + prev.element().getExponente()));
				prev = cursor;
				cursor = p.terms.next(prev);
			}
			resMonxPol.terms.addLast(new Monomio(t.getCoeficiente() * prev.element().getCoeficiente(),
					t.getExponente() + prev.element().getExponente()));
		}
		return resMonxPol;
	}
  
/**
 * Devuelve el valor del polinomio cuando su variable es sustiuida por un valor concreto.
 * Si el polinomio es vacio (la representacion del polinomio "0") entonces
 * el valor devuelto debe ser -1.
 * @param valor el valor asignado a la variable del polinomio
 * @return el valor del polinomio para ese valor de la variable.
 */
	public long evaluar(int valor) {
		int resEvaluar = 0;
		int sumatorio = 0;
		if (terms.size() == 0) {
			resEvaluar = 0;
		} else if (grado() == 0) {
			resEvaluar = terms.first().element().getLeft();
		} else if (terms.size() == 1) {
			Position<Monomio> prev = terms.first();
			resEvaluar = (prev.element().getLeft() * ((int) Math.pow(valor, prev.element().getRight())));
		} else {
			Position<Monomio> prev = terms.first();
			Position<Monomio> cursor = terms.next(prev);
			// vamos hayando los resultados de cada monomio que conforma el polinomio y los vamos sumando
			while (cursor != null) {
				sumatorio = (prev.element().getLeft() * ((int) Math.pow(valor, prev.element().getRight())));
				resEvaluar += sumatorio;
				prev = cursor;
				cursor = terms.next(prev);
			}
			sumatorio = (prev.element().getLeft() * ((int) Math.pow(valor, prev.element().getRight())));
			resEvaluar += sumatorio;
		}
		return resEvaluar;
	}

/**
 * Devuelve el exponente (grado) del monomio con el mayor grado
 * dentro del polinomio
 * @return el grado del polinomio
 */
	public int grado() {
		if (terms.first() == null) {
			return -1;
		} else {
			return terms.first().element().getExponente();
		}
	}
	
	@Override
	public String toString() {
		if (terms.isEmpty())
			return "0";
		else {
			StringBuffer buf = new StringBuffer();
			Position<Monomio> cursor = terms.first();
			while (cursor != null) {
				Monomio p = cursor.element();
				int coef = p.getCoeficiente();
				int exp = p.getExponente();
				buf.append(new Integer(coef).toString());
				if (exp > 0) {
					buf.append("x");
					buf.append("^");
					buf.append(new Integer(exp)).toString();
				}
				cursor = terms.next(cursor);
				if (cursor != null)
					buf.append(" + ");
			}
			return buf.toString();
		}
	}
	
	/**
	 * metodo que nos dice si dos pares de enteros dados son iguales
	 */
	public static boolean iguales(Pair<Integer, Integer> par1, Pair<Integer, Integer> par2) {
		return par1.getRight().equals(par2.getRight()) && par1.getLeft().equals(par2.getLeft());
	}
	
	/**
	 * metodo que nos dice si la primera componente de dos pares de enteros dados es igual
	 */
	public static boolean operar(Pair<Integer, Integer> par1, Pair<Integer, Integer> par2) {
		return par1.getRight().equals(par2.getRight());
	}

	static class comparadorGrados implements Comparator<Integer> {
		@Override
		public int compare(Integer o1, Integer o2) {
			return o1 - o2;
		}
	}

}



