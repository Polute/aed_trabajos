package aed.recursion;

import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.indexedlist.*;
import es.upm.aedlib.positionlist.*;


public class Utils {
	//Metodo de multiplicacion por cierto algoritmo
 public static int multiply(int a, int b) {
	 //Si a<0, multiplicamos por -1, si no, se queda como esta
	 return (a<0) ? -1*multiplyOp(a,b):multiplyOp(a,b);
 }
 //Metodo auxiliar que aplicando la recursividad aplica un algoritmo de multiplicacion
 private static int multiplyOp(int a,int b) {
	 int sum=0;
	 //Si a es par, se agrega al resultado b
	 if(a%2!=0) {
		sum=sum+b;
	}
	//Una vez que a es 0, se termina el algoritmo, si no, se continua
 return (a==0) ?sum:(sum+multiplyOp(a/2,b*2));
 }

 
 public static <E extends Comparable<E>> int findBottom(IndexedList<E> l) {
	 return findBottomRec(l,0,l.size()-1);
 }
 //Metodo auxiliar que recorre una lista desde los extremos hasta el centro
 public static <E extends Comparable<E>> int findBottomRec(IndexedList<E> l,int i,int f) {
	 //Si la lista solo posee un elemento, el hoyo esta en la posicion 0
	 if(l.size()==1) {
		 return 0;
	 }
	 //Al principio comprueba los extremos y si cumplen, devuelve la posicion del hoyo
	 //Pero si no lo hacen, vamos avanzando y al no cumplirlo, ya sabemos que:
	 //i-1 es mayor(al no cumplirse al principio) y f+1 es mayor(por lo mismo)
	 //Luego solo hace falta comprobar hacia la direccion a la que avanzan:
	 //i hacia la derecha y j hacia la izquierda
	 //[O=>......<=O]      
	 if(l.get(i).compareTo(l.get(i+1))<=0) {
		 return i;
	 }
	 if(l.get(f).compareTo(l.get(f-1))<=0) {
		 return f;
	 }
	 //Avanzamos hacia el centro de la lista
	 return findBottomRec(l,i+1,f-1);
	 
 }
	
  public static <E extends Comparable<E>> NodePositionList<Pair<E,Integer>>
    joinMultiSets(NodePositionList<Pair<E,Integer>> l1,
		  NodePositionList<Pair<E,Integer>> l2) {
	//Inicializamos NodePositionList<Pair<E,Integer>> resultado
	NodePositionList<Pair<E,Integer>> res=new NodePositionList<Pair<E,Integer>>();
	
    return joinMultiSetsAux(l1,l2,l1.first(),l2.first(),res);
  }
  //Metodo auxiliar que recorre las dos listas y aplica un algoritmo
  public static <E extends Comparable<E>> NodePositionList<Pair<E,Integer>>
  joinMultiSetsAux(NodePositionList<Pair<E,Integer>> l1,
		  NodePositionList<Pair<E,Integer>> l2, Position<Pair<E,Integer>> pos1,
		  Position<Pair<E,Integer>> pos2,NodePositionList<Pair<E,Integer>> res) {
	//Inicializamos un pair tal que si cumple cierta condicion se sobreescribe
	Pair<E,Integer> suma=new Pair<>(null,null);
	//Si las posiciones estan en alguna de las dos listas
	if (pos1 != null || pos2 != null){
		//Si la lista 1 ya termino, agregamos el par de la lista dos
		if (pos1==null){
			res.addLast(pos2.element());
			//Avanzamos en la lista 2
			return joinMultiSetsAux (l1,l2,pos1, l2.next(pos2), res);	
		}
		//Si la lista 2 ya termino o en la posicion de la lista 1, su elemento es menor
		//que la de la lista 2, se agrega el elemento 1
		else if (pos2==null || pos1.element().getLeft().compareTo(pos2.element().getLeft())<0){
			res.addLast(pos1.element());
			//Avanzamos en la lista 1
			return joinMultiSetsAux (l1,l2,l1.next(pos1), pos2, res);	
		}	
		//Si coinciden los elementos del par
		else if(pos1.element().getLeft().compareTo(pos2.element().getLeft())==0){
			//El elemento en suma es el mismo
			suma.setLeft(pos1.element().getLeft());
			//El valor en suma es la suma de los valores de ambas posiciones
			suma.setRight(pos1.element().getRight()+pos2.element().getRight());
			res.addLast(suma);
			//Avanzamos en ambas listas
			return joinMultiSetsAux (l1,l2,l1.next(pos1), l2.next(pos2), res);	
		}
		else{ 
			//Si el elemento de pos2 es menor que el de pos1, se agrega el pair de la pos2
			res.addLast(pos2.element());
			return joinMultiSetsAux (l1,l2,pos1, l2.next(pos2), res);
		}		   
	} 
	//Se devuelve el resultado
	//Se podia haber hecho un unico return pero me ha quedado mas claro de esta forma
	return res;
}
}
