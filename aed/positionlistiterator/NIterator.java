package aed.positionlistiterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.PositionList;


public class NIterator<E> implements Iterator<E> {
  // Esta permitido anadir atributos nuevos
	PositionList<E> lista;
	Position<E> posicion;
	int n;

  public NIterator(PositionList<E> list, int n) {
    // Modifica
	  //Inicializo los atributos
	  this.n=n;
	  lista=list;
	  posicion=lista.first();
	  //Damos como condiciones que:
	  //No sea null la posicion, y que el elemento en esa posicion sea null
	  //Si cumple, usamos next(que contiene los saltos de kN en (k+1)N) y avanzamos
	  while(posicion != null && posicion.element() == null) {
          posicion=lista.next(posicion);
	  }
  }
//Metodo que te dice si hay un siguiente elemento en la lista
  @Override
  public boolean hasNext() {
    // Modifica
    return posicion!=null;
  }
//Metodo que te devuelve el proximo elemento en saltos de N unidades y elementos no null
  @Override
  public E next() {
	  if(posicion==null) {
		  throw new NoSuchElementException();
	  }
	  E elem=posicion.element();
	  posicion=saltoN(lista,posicion,n);
	  return elem;
  }
  
  private Position<E> saltoN(PositionList<E> lista, Position<E> posicion, int n) {
	  //Salto de kN en (k+1)N mientras haya lista 
	  int i=0;
      while(i<n && posicion!=null) {
    	  posicion=lista.next(posicion);
    	  i++;
      }
      //Si el elemento es null, busca el elemento mas cercano que no sea null
      while(posicion!=null && posicion.element()==null) { 
          posicion=lista.next(posicion);
      }
    return posicion;
  }

}
