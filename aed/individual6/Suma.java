package aed.individual6;

import es.upm.aedlib.graph.Edge;
import es.upm.aedlib.graph.Vertex;

import java.util.Iterator;

import es.upm.aedlib.graph.DirectedGraph;
import es.upm.aedlib.map.Map;
import es.upm.aedlib.set.HashTableMapSet;
import es.upm.aedlib.set.Set;
import es.upm.aedlib.map.HashTableMap;


public class Suma {
	public static <E> Map<Vertex<Integer>,Integer> sumVertices(DirectedGraph<Integer,E> g) {
		//Creo un map que guarde la informacion de cada vertice y arista
		Map<Vertex<Integer>,Integer> res = new HashTableMap<Vertex<Integer>,Integer>();
		//Recorremos todos los vertices de g
		Iterator<Vertex<Integer>> it = g.vertices().iterator();
		while(it.hasNext()) {
			//Map que contiene todos los ya visitados
			Set<Vertex<Integer>> visitados = new HashTableMapSet<Vertex<Integer>>();
			//Avanzamos con el iterator
			Vertex<Integer> pos=it.next();
			//Agregamos a cada vertice la suma de todos los vertices que llegan a el
			res.put(pos,sumConexiones(g,pos,visitados, 0));
			
		}
		return res;
	}

	private static <E> int sumConexiones(DirectedGraph<Integer,E> g, Vertex<Integer> pos, 
			Set<Vertex<Integer>> visitados, int total) {
		//Agregamos al map de visitados este vertice
		visitados.add(pos);
		//Sumamos primero al total el valor que posee este
		total += pos.element();
		//Con un iterator, recorremos todos los vertices y aristas que llegan a el
		Iterator<Edge<E>> contactos=g.outgoingEdges(pos).iterator();
		while(contactos.hasNext()) {
			//Una vez llegamos al vertice contacto
			Vertex<Integer> endVertex = g.endVertex(contactos.next());
			//Si no ha sido un visitado, se agrega su valor al total 
			//Y ese valor sera la suma del contacto y de si mismo
			//Asi hasta recorrer todos
			if (!visitados.contains(endVertex)) {
				total += sumConexiones(g, endVertex, visitados, 0);
			}
		}
		return total;
	}
}
