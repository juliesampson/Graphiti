package graphiti;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;

import graphiti.comp.Edge;
import graphiti.comp.Vertex;
import graphiti.util.GraphitiConfigDefaults;

/**
 * @author Julie Sampson
 *
 */
public class DirectedGraph extends AGraph {
	
	private static String type = GraphitiConfigDefaults.DIRECTED_GRAPH_NAME;
	/**
	 * TODO: Thinking to hash on vertex as the key and then have the standard
	 * adjacency list represented as edges. Nothing too clever about this data structure,
	 * but these concurrent types new (to me) need to be researched and learned, etc.
	 * That said, this class is the model  
	 */
	private ConcurrentHashMap<Vertex, ConcurrentSkipListSet<Edge>> neighbors;

	/**
	 * Construct an empty graph
	 */
	public DirectedGraph(String name) {
		setName(name);
		setType(type);
		neighbors = new ConcurrentHashMap<Vertex, ConcurrentSkipListSet<Edge>>();
		
	}

	/**
	 * TODO: whenever a graph is updated notify the observers. the model doesn't care 
	 * what they do. This has been broken up into methods based on map component type
	 * (Vertex or Edge, but that may not make sense once these methods are implemented
	 */
	@Override
	public void addVertex(Vertex v) {
		structureChanged();
		
	}


	@Override
	public void addEdge(Edge e) {
		structureChanged();		
	}


	@Override
	public void updateVertex(Vertex v) {
		structureChanged();		
	}


	@Override
	public void updateEdge(Edge e) {
		structureChanged();
		
	}


	@Override
	public void deleteVertex(Vertex v) {
		structureChanged();
		
	}


	@Override
	public void deleteEdge(Edge e) {
		structureChanged();
		
	}

	@Override
	public void structureChanged() {
		updated();
		
	}

	
}
