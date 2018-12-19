package graphiti.util;

import java.util.ArrayList;

import graphiti.IGraph;

/**
 * @author Julie Sampson
 * TODO: placeholder for traversal service
 * implementers could be BFS, DFS, Dijkstras, possible new parallel search...
 * need an overview of using generics with interfaces 
 * 
 */
public interface ITraversalService<E> {

	public ArrayList<E> getPath(IGraph graph);
	public ArrayList<E> getBestPath(IGraph graph); 
	
}
