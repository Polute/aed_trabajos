package aed.polinomios;

import es.upm.aedlib.Pair;

/**
 * Monomios de una variable con coeficientes enteros.
 */
public class Monomio extends Pair<Integer,Integer> {

  /**
   * Construye un monomio sobre un variable definido por un coeficiente y un exponente.
   * @param coeficiente el coeficiente
   * @param exponente el exponente (o grado)
   */
  public Monomio(int coeficiente, int exponente) {
    super(coeficiente, exponente);
  }

  
  /**
   * Devuelve el coeficiente del monomio
   * @return el coeficiente
   */
  public int getCoeficiente() { return getLeft(); }
  /**
   * Devuelve el exponente (grado) del monomio
   * @return el exponente
   */
  public int getExponente() { return getRight(); }

  @Override
  public String toString() {
    StringBuffer buf = new StringBuffer();
    buf.append(getCoeficiente());
    buf.append("x");
    buf.append("^");
    buf.append(new Integer(getExponente()).toString());
    return buf.toString();
  }
}


