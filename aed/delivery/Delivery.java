package aed.delivery;

import es.upm.aedlib.positionlist.PositionList;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.graph.DirectedGraph;
import es.upm.aedlib.Position;
import es.upm.aedlib.graph.DirectedAdjacencyListGraph;
import es.upm.aedlib.graph.Vertex;
import es.upm.aedlib.graph.Edge;
import es.upm.aedlib.set.HashTableMapSet;
import es.upm.aedlib.set.Set;
import java.util.Iterator;

public class Delivery<V> {
	private DirectedGraph<V,Integer> grafo;

  // Construct a graph out of a series of vertices and an adjacency matrix.
  // There are 'len' vertices. A negative number means no connection. A non-negative
  // number represents distance between nodes.
  public Delivery(V[] places, Integer[][] gmat) {
	   // Crea un nuevo grafo de tipo DirectedAdjacencyListGraph
	    this.grafo = new DirectedAdjacencyListGraph<>();
	    // Inserta un vertice en el grafo para cada lugar de entrega en el arreglo places
	    for (int i = 0; i < places.length; i++) {
	        grafo.insertVertex(places[i]);
	    }
	    // Recorre la matriz gmat y, para cada par de indices i y j,
	    // si el valor de gmat[i][j] no es nulo, inserta un borde en el grafo que conecta
	    // los vertices asociados a los lugares de entrega i y j con la distancia gmat[i][j]
	    for (int i = 0; i < places.length; i++) {
	        for (int j = 0; j < places.length; j++) {
	            if (gmat[i][j] != null) {
	                // Busca los vertices asociados a los lugares de entrega i y j
	                Vertex<V> start = null;
	                Vertex<V> end = null;
	                Iterator<Vertex<V>> vertices = grafo.vertices().iterator();
	                while (vertices.hasNext()) {
	                    Vertex<V> verticesElement = vertices.next();
	                    if (verticesElement.element() == places[i]) {
	                        start = verticesElement;
	                    }
	                    if (verticesElement.element() == places[j]) {
	                        end = verticesElement;
	                    }
	                    if (start != null && end != null) {
	                        break;
	                    }
	                }
	                // Inserta un borde en el grafo que conecta los vertices start y end con la distancia gmat[i][j]
	                grafo.insertDirectedEdge(start, end, gmat[i][j]);
	            }
	        }
	    }
	}
  
  // Just return the graph that was constructed
  public DirectedGraph<V, Integer> getGraph() {
    return this.grafo;
  }

  // Return a Hamiltonian path for the stored graph, or null if there is none.
  // The list containts a series of vertices, with no repetitions (even if the path
  // can be expanded to a cycle).
  public PositionList<Vertex<V>> tour() {
	  	Set<Vertex<V>> visitados = new HashTableMapSet<>();
	    // Recorre todos los vertices del grafo
	    for (Vertex<V> v : grafo.vertices()) {
	        // Intenta obtener un camino Hamiltoniano a partir del vertice actual
	        PositionList<Vertex<V>> path = obtainHamiltonianPath(v, new NodePositionList<>(), visitados);
	        // Si se encontro un camino, se devuelve
	        if (path != null) {
	            return path;
	        }
	    }
	    // Si no se encontro ningun camino, se devuelve nulo
	    return null;
	}

	private PositionList<Vertex<V>> obtainHamiltonianPath(Vertex<V> verticeInicial,
			PositionList<Vertex<V>> verticesList, Set<Vertex<V>> visitados) {
	    // Agrega el vertice actual a la lista de vertices visitados
	    verticesList.addLast(verticeInicial);
	    visitados.add(verticeInicial);
	    // Si la lista tiene el tamanio correcto, se devuelve
	    if (verticesList.size() == grafo.numVertices()) {
	        return verticesList;
	    }
	    // Recorre todos los bordes salientes del vertice actual
	    for (Edge<Integer> e : grafo.outgoingEdges(verticeInicial)) {
	        // Obtiene el vertice final del borde
	        Vertex<V> vAux = grafo.endVertex(e);
	        // Si el vertice final no esta en la lista de vertices visitados, se llama recursivamente a la funcion
	        if (!visitados.contains(vAux)) {
	            PositionList<Vertex<V>> path = obtainHamiltonianPath(vAux, verticesList, visitados);
	            // Si se encontro un camino, se devuelve
	            if (path != null) {
	                return path;
	            }
	        }
	    }
	    // Si no se encontro un camino, se elimina el vertice actual de la lista y se devuelve nulo
	    verticesList.remove(verticesList.last());
	    visitados.remove(verticeInicial);
	    return null;
	}

  public int length(PositionList<Vertex<V>> path) {
	// Si la lista es nula o esta vacia, se devuelve cero
	    if (path == null || path.isEmpty()) {
	        return 0;
	    }

	    // Inicializa el resultado en cero
	    int res = 0;
	    // Obtiene la primera posicion de la lista
	    Position<Vertex<V>> cursor = path.first();
	    // Mientras la posicion no sea nula, se itera sobre la lista
	    while (cursor != null) {
	        // Obtiene el vertice actual
	        Vertex<V> current = cursor.element();
	        // Obtiene la posicion del siguiente vertice
	        Position<Vertex<V>> nextPos = path.next(cursor);
	        // Si la posicion del siguiente vertice es nula, significa que es 
	        // el ultimo vertice de la lista y se devuelve el resultado
	        if (nextPos == null) {
	            return res;
	        }
	        // Obtiene el siguiente vertice
	        Vertex<V> next = nextPos.element();
	        // Obtiene todos los bordes salientes del vertice actual
	        Iterable<Edge<Integer>> edges = grafo.outgoingEdges(current);
	        // Inicializa el borde que conecta al vertice actual con el siguiente en nulo
	        Edge<Integer> edge = null;
	        // Itera sobre los bordes salientes del vertice actual
	        for (Edge<Integer> e : edges) {
	            // Si el vertice final del borde es el siguiente vertice, se guarda el borde
	            if (grafo.endVertex(e).equals(next)) {
	                edge = e;
	                break;
	            }
	        }
	        // Si se encuentra el borde, se suma su peso al resultado total
	        res += edge.element();
	        // Avanza al siguiente vertice
	        cursor = nextPos;
	    }
	    // Devuelve el resultado
	    return res;
	}
  public String toString() {
    return "Delivery";
  }
}
