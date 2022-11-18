package aed.recursion;

import java.util.Iterator;

import es.upm.aedlib.Pair;
import es.upm.aedlib.positionlist.*;


public class Explorador {
  
  public static Pair<Object,PositionList<Lugar>> explora(Lugar inicialLugar) {
	//Inicializamos atributos
	  //El camino que recorremos para llegar al tesoro
	PositionList<Lugar> explorado=new NodePositionList<>();
	  //Los pasos que damos para avanzar
	Iterator<Lugar> it=inicialLugar.caminos().iterator();
	  //El tesoro, una vez que estamos en su posicion
	Object tesoro=recorridosRec(inicialLugar,it,explorado);
	
	if(tesoro!=null) {//Se encontro el tesoro
		explorado.addFirst(inicialLugar);//Agregamos el primer paso
		//Devolvemos el metodo recursivo
		return new Pair<Object,PositionList<Lugar>>(tesoro,explorado);
		}
	else {
		//Si no hay tesoro, devuelve null
		return null;
	}
  }
  public static Object recorridosRec(Lugar inicial, Iterator<Lugar> caminos, PositionList<Lugar> explorado){
  Object tesoro=null;//Inicializamos tesoro
 //Si la posicion en la que estamos tiene el tesoro, lo devolvemos y terminamos
  if(inicial.tieneTesoro()) { 
	  return inicial.getTesoro();
  }
  //Si no, entonces empezamos marcando el primer paso
  inicial.marcaSueloConTiza();
  if(!caminos.hasNext()) {
	  //Si no se puede avanzar, devolvemos null
	  return null;
  }
  //Mientras podamos avanzar:
  while(caminos.hasNext()) {
	  //Cogemos el siguiente paso
	  Lugar actual=caminos.next();
	  //Si no lo habiamos recorrido
	  if(!actual.sueloMarcadoConTiza()) {
		  //tesoro podra estar en esa direccion
		  tesoro=recorridosRec(actual,actual.caminos().iterator(),explorado);
		  //Si esta, entonces agregamos al camino todos los pasos
		  if(tesoro!=null) {
			  explorado.addFirst(actual);
			  //Y devolvemos el tesoro
			  return tesoro;
		  }
	  }
	  //Si ya recorrimos ese paso(actual) cogemos otro paso desde actual
  }
  //En otro caso, devolvemos null(no hay tesoro o un posible camino)
  return null; 
  }
}
