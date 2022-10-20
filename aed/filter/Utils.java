package aed.filter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;



public class Utils {

  public static <E> Iterable<E> filter(Iterable<E> d, Predicate<E> pred) {
	  //Creo una coleccion de objetos y un iterator para recorrer el iterable
	  Collection<E> collection = new ArrayList<>();
	  Iterator<E> resAux=d.iterator();
	  	  
	  while(resAux.hasNext()) {
		E elem1=resAux.next();
		//Si la coleccion a filtrar no tiene elementos null y cumple la funcion, se agrega al resultado
		if(elem1!=null && pred.test(elem1)) {
			 collection.add(elem1);
		}
	}    
	return collection;
  }
}