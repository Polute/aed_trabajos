package aed.tries;

import java.util.Iterator;
import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.tree.GeneralTree;
import es.upm.aedlib.tree.LinkedGeneralTree;
import es.upm.aedlib.positionlist.PositionList;
import es.upm.aedlib.positionlist.NodePositionList;


public class DictImpl implements Dictionary {
  // A boolean because we need to know if a word ends in a node or not
  GeneralTree<Pair<Character,Boolean>> tree;

  public DictImpl() {
    tree = new LinkedGeneralTree<>();
    tree.addRoot(new Pair<Character,Boolean>(null,false));
  }

  public void add(String word) {
	  if (word == null || word.length() == 0) {
			throw new IllegalArgumentException();
	}
	// Vemos si la palabra no esta metida
			if (!isIncluded(word)) {
				Position<Pair<Character, Boolean>> nodo = tree.root();
				//Recorriendo cada letra de la palabra
				for (int i = 0; i < word.length(); i++) {
					char letra = word.charAt(i);
					//Si ya estaba en el arbol la letra
					if (search(letra, nodo) != null) {
						//Si es la ultima letra y no forma palabra
						//Formamos la palabra poniendo como true su estado
						if (i == word.length() - 1 && !findPos(word).element().getRight()) {
							Position<Pair<Character, Boolean>> pos = findPos(word);
							pos.element().setRight(true);
						} else {
							//Guardamos la posicion de la letra en el arbol
							nodo = search(letra, nodo);
						}
					}
					else {
						// Annadimos un hijo al nodo con la letra correspondiente y hacemos que el hijo
						// annadido sea nuestro nodo de referencia en la siguiente iteracion
						if (i < word.length() - 1) {
							addAlphabetic(new Pair<>(letra, false), nodo);
							nodo = search(letra, nodo);
						} else {
							addAlphabetic(new Pair<>(letra, true), nodo);
						}
					}
				}
			}
	}

  public void delete(String word) {
	  if (word == null || word.length() == 0) {
			throw new IllegalArgumentException();
	  }
	  //Eliminamos la palabra simplemente cambiando
	  //el estado de la ultima letra a false
	  Position<Pair<Character, Boolean>> pos = findPos(word);

		if (pos != null && pos.element().getRight()) {
			pos.element().setRight(false);
		}
	  
  }
  public boolean isIncluded(String word) {
	  if (word == null || word.length() == 0) {
			throw new IllegalArgumentException();
	  }
	  if(tree.isEmpty()) {
		  return false;
	  }
	  //Dada la posicion de la ultima letra que forma la palabra
	  Position<Pair<Character, Boolean>> pos = findPos(word);
	  //Si no esta esa letra, entonces no esta la palabra
	  if (pos == null) {
		  return false;
	  }
	  //Si esta la letra, devuelve su estado que informa su forma palabra o no
	  return pos.element().getRight(); 
	  }
  //Usando metodos recursivos, agregamos a una lista todas las palabras
  //formadas en el arbol
  public PositionList<String> wordsBeginningWithPrefix(String prefix) {
	  String preAdd = "";
	  PositionList<String> res = new NodePositionList<>();
	  Position<Pair<Character, Boolean>> nodo = findPos(prefix);
		if (nodo == null) {
			return res;
		}
		//Solo se anniaden aquellas que no son ni de primera ni de segunda generacion
		if (nodo != tree.root() && nodo!=tree.children(tree.root())) {
			Position<Pair<Character, Boolean>> hijo = nodo;
			while (tree.parent(hijo) != tree.root()) {
				hijo = tree.parent(hijo);
				preAdd = hijo.element().getLeft() + preAdd;
			}

		}
		//Agregamos el resto
		return wordsBeginningWithPrefix(res, nodo, preAdd);

	}

private PositionList<String> wordsBeginningWithPrefix(PositionList<String> res, 
			Position<Pair<Character, Boolean>> nodo, String add) {
	Pair<Character,Boolean> pair=nodo.element();
	//Si hay letra en ese nodo, formamos la palabra hasta que...
	if (pair.getLeft() != null) {
		add += nodo.element().getLeft();
	}
	//la ultima letra se localiza y luego se anniade a la lista
	if (pair.getRight()) {
		res.addLast(add);
	}
	//Recorremos todas las posibilidades
	for (Position<Pair<Character, Boolean>> nodoAux : tree.children(nodo)) {
		wordsBeginningWithPrefix(res, nodoAux, add);
	}
	return res;

	}
//Devuelve el nodo cuyo camino desde la raiz contiene
// la palabra prefix. Si no existe el metodo devuelve null
Position<Pair<Character,Boolean>> findPos(String prefix) {
	  Position<Pair<Character, Boolean>> nodo = tree.root();
	  Iterator<Position<Pair<Character, Boolean>>> it = tree.children(nodo).iterator();
	  if(prefix.isBlank()) {
		  return tree.root();
	  }
	  int i=0;
	  Position<Pair<Character, Boolean>> pos=tree.root();
	  while(it.hasNext()) {
		  pos = it.next();
		  char letra=prefix.charAt(i);
		  if(pos.element().getLeft().equals(letra)) {
			  if(prefix.length()!=i+1) {
				  	it=tree.children(pos).iterator();
			  		i++;
			  }
			  else {
				  	return pos;
			  }
		  }
	  }
	  
	return null;
	  
}
//Metodo que introduce un nodo hijo ordenado alfabeticamnete al nodo dado
public void addAlphabetic( Pair<Character,Boolean> pair, Position<Pair<Character,Boolean>> cursor) {
		Character letra = pair.getLeft();
		boolean metido = false;
		
		for(Position<Pair<Character,Boolean>>child : tree.children(cursor) ) {  
			if(letra.compareTo(child.element().getLeft())<0 && !metido) {
				tree.insertSiblingBefore(child, pair); 
				metido = true;	  
			}
		}
		if(!metido) {
			tree.addChildLast(cursor, pair);
		}  
	}
	
// Metodo que devuelve el hijo del nodo en el que nos encontramos que contiene
// la letra introducida, sino exixte devuelve null
public  Position<Pair<Character,Boolean>> search (char letra, Position<Pair<Character,Boolean>> cursor ){  
		Position<Pair<Character,Boolean>> res = null;
		if(!tree.isExternal(cursor)) {
			for (Position<Pair<Character,Boolean>> child : tree.children(cursor)) {
				if(child.element().getLeft().compareTo(letra)==0) {
					res=child;
				}
			} 
		}
		return res;

	}
}
