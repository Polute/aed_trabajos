package aed.hashtable;

import java.util.NoSuchElementException;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import es.upm.aedlib.Entry;
import es.upm.aedlib.EntryImpl;
import es.upm.aedlib.map.Map;
import es.upm.aedlib.InvalidKeyException;


/**
 * A hash table implementing using open addressing to handle key collisions.
 */
public class HashTable<K,V> implements Map<K,V> {
  Entry<K,V>[] buckets;
  int size;

  public HashTable(int initialSize) {
    this.buckets = createArray(initialSize);
    this.size = 0;
  }

  /**
   * Add here the method necessary to implement the Map api, and
   * any auxilliary methods you deem convient.
   */

  // Examples of auxilliary methods: IT IS NOT REQUIRED TO IMPLEMENT THEM
  
  @SuppressWarnings("unchecked") 
  private Entry<K,V>[] createArray(int size) {
   Entry<K,V>[] buckets = (Entry<K,V>[]) new Entry[size];
   return buckets;
  }

  // Returns the bucket index of an object
  private int index(Object obj) {  
    return -1;
  }

  // Returns the index where an entry with the key is located,
  // or if no such entry exists, the "next" bucket with no entry,
  // or if all buckets stores an entry, -1 is returned.
  private int search(Object obj) {
	  int pos=mod(obj.hashCode(),buckets.length);
	  int posAux=pos;
	  while(buckets[posAux]!=null && !buckets[posAux].getKey().equals(obj)) {
		  posAux=mod(posAux+1,buckets.length);
		  if(posAux==pos) {
			  return -1;
		  }
	  }
	  return posAux;
  }

  // Doubles the size of the bucket array, and inserts all entries present
  // in the old bucket array into the new bucket array, in their correct
  // places. Remember that the index of an entry will likely change in
  // the new array, as the size of the array changes.
  private void rehash() {
    Entry[] newBuckets = createArray(buckets.length*2);
    Entry[] oldBuckets = buckets;
    buckets = newBuckets;
    this.size=0;
    for(int i=0;i<oldBuckets.length;i++) {
    	put((K) oldBuckets[i].getKey(),(V) oldBuckets[i].getValue());
    }
  }
//Metodo para calcular el resultado del modulo de un numero en base (int capacidad)
private int mod(int key,int capacidad) {
	return key%capacidad;
}
@Override
public Iterator<Entry<K, V>> iterator() {
	// TODO Auto-generated method stub
	return null;
}

@Override
//Metodo que te indica dada una key si la coleccion contiene algun objeto con esa llave
public boolean containsKey(Object arg0) throws InvalidKeyException {
	boolean encontrado=false;
	for(int i=0;i<buckets.length && !encontrado;i++) {
		if(buckets[i]!=null && buckets[i].getKey().equals(arg0)) {
			encontrado=true;
		}
	}
	return encontrado;
}

@Override
//Metodo que recorre la coleccion y te devuelve un array de keys y valores
public Iterable<Entry<K, V>> entries() {
	Collection<Entry<K, V>> collection = new ArrayList<>();
	for(int i=0;i<buckets.length;i++) {
		if(buckets[i]!=null) {
			collection.add(buckets[i]);
		}
	}
	return collection;
}

@Override
//Metodo que dada una key, te devuelve el valor asociado a esa key
public V get(K arg0) throws InvalidKeyException {
	int i=0;
	boolean encontrado=false;
	while(i<buckets.length && !encontrado) {
		if(buckets[i]!=null && buckets[i].getKey().equals(arg0)) {
			encontrado=true;
			return buckets[i].getValue();	
		}
		i++;
	}
	return null;
}

@Override
//Metodo que te dice si la coleccion esta vacia
public boolean isEmpty() {
	return size==0;
}

@Override
//Metodo que recorre la coleccion y te devuelve un array de keys
public Iterable<K> keys() {
	Collection<K> collection = new ArrayList<>();
	for(int i=0;i<buckets.length;i++) {
		if(buckets[i]!=null) {
			collection.add(buckets[i].getKey());
		}
	}
	return collection;
}

@Override
//Metodo que introduce una pareja de key-valor en una coleccion
public V put(K arg0, V arg1) throws InvalidKeyException {
	//Te devuelve la posicion idonea donde colocarlo
	int pos=search(arg0);
	if(pos==-1) { //Si no hay posicion disponible, hace rehash y recalcula la posicion idonea
		rehash();
		pos=search(arg0);
	}
	//Si la posicion idonea esta disponible, introduce el objeto en ella y aumenta el numero de objetos en uno
	if(pos!=-1 && buckets[pos]==null) {
		buckets[pos]=new EntryImpl<K,V>(arg0, arg1);
		this.size++;
	}
	//Si la posicion idonea posee ya un valor y la key es la misma
	else if(pos!=-1 && buckets[pos]!=null) {
			if(buckets[pos].getKey().equals(arg0)){
				V valorAnterior=buckets[pos].getValue();//Guarda el valor anterior y lo devuelve
				buckets[pos]=new EntryImpl<K,V>(arg0, arg1);//Coloca el nuevo valor en esa posicion
				return valorAnterior;
			}
		
	}
	//Devuelve null en los dos primeros casos
	return null;
}

@Override
//Metodo que quita el valor dada una key asociada a el
public V remove(K arg0) throws InvalidKeyException {
	//Si hay algun valor con esa key
	if(containsKey(arg0)) {
		int indexh=search(arg0);//Empleamos el algoritmo de busqueda para eliminarlo y recolocamos los valores
		int start=indexh;
		int i=mod(indexh+1,buckets.length);
		V valor = buckets[indexh].getValue();
		buckets[indexh]=null;
		while(i!=start && buckets[i]!=null) {
			int indexpref=mod(buckets[i].getKey().hashCode(),buckets.length);
			if((i>=indexpref && (indexpref <= indexh && indexh < i)) || (indexpref>i && (indexh>=indexpref || indexh<i))) {
				buckets[indexh]=buckets[i];
				buckets[i]=null;
				indexh=i;
			}
		i=mod(i+1,buckets.length);
		}
	this.size--;
	return valor;//Devuelve el valor que retiramos
	}
return null;//No devuelve nada si no esta la key dada
}

@Override
//Metodo para calcula el numero de valores que hay en la coleccion
public int size() {
	int i=0;
	int res=0;
	while(i<buckets.length) {
		if(buckets[i]!=null) {
			res++;
		}
		i++;
	}
	return res;
} 
}

