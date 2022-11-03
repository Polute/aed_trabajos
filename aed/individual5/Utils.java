package aed.individual5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.map.*;

public class Utils {
  
  public static <E> PositionList<E> deleteRepeated(PositionList<E> l) {
	Position<E> pos=l.first(); //Inicializamos dos punteros
	Position<E> posAux=l.first();
	PositionList<E> res=new NodePositionList<>(); //Inicializamos lista resultado
	Collection<E> coleccion=new ArrayList<>(); //Inicializamos lista para comprobaciones
	if(l.size()==0) {//Como la lista l esta vacia, devolvemos una lista vacia
		return res;
	}
	else {
		res.addLast(l.first().element()); //Agregamos el primer elemento de l a res
		coleccion.add(l.first().element()); //Y lo restringimos para que no vuelva a agregarse
		while(l.next(pos)!=null) { //Recorremos la lista y si se comparan con los anteriores
			while(l.next(posAux)!=null) {//Y no son iguales, se agregan
				posAux=l.next(posAux);
				if(pos.element()!=posAux.element() && !coleccion.contains(posAux.element())) {
					res.addLast(posAux.element());//Lo agregamos a res
					coleccion.add(posAux.element());//Y lo restringimos
				}
			}
			pos=l.next(pos);
			posAux=l.next(pos);
		}
		return res;
	}
	
  }
  
  public static <E> PositionList<E> compactar (Iterable<E> lista) {
	  PositionList<E> res=new NodePositionList<>();
	  //Si la lista esta vacia, da error
	  if(lista==null) {
		  throw new IllegalArgumentException();
	  }
	  else {
		  Iterator<E> resAux=lista.iterator();
		  //Si no tiene elementos pero hay espacio
		  if(!resAux.hasNext()) {
			  //Se devuelve lo mismo
			  return res;
		  }  
		  //Se agrega el primer elemento
		  E elemPrim=resAux.next();
		  res.addLast(elemPrim);
		  while(resAux.hasNext()) {
			  E elem1=resAux.next();
			  //Si al comparar un elemento con su siguiente y son distintos, se agrega ese siguiente
			  //Diferenciamos elementos nulos y no nulos
			  if(elemPrim==null && elemPrim!=elem1) {
				  res.addLast(elem1);
			  }
			  else if(elemPrim!=null && !elemPrim.equals(elem1)) {
				  res.addLast(elem1);
			  }
			  //Avanzamos cursor y asi comparamos a pares adyacentes de elementos
			  elemPrim=elem1;
		  } 
		  return res;
	  }
  }
  
  public static Map<String,Integer> maxTemperatures(TempData[] tempData) {
	  Map<String,Integer> res=new HashTableMap<>();
	  String key;
	  int value;
	  for(int i=0;i<tempData.length;i++){
		  key=tempData[i].getLocation();
		  value=tempData[i].getTemperature();
		  for(int j=0;j<tempData.length;j++) {
			  //Mientras el key sea de la misma ciudad
			  if(key.equals(tempData[j].getLocation())){
				  if(value<tempData[j].getTemperature()) {
					  //Solo se agrega la temperatura mas grande
					  value=tempData[j].getTemperature();	  
				  }
			  }
		  }
		  res.put(key, value); 
	  }
    return res;
  }
  
}


