package graphiti;

import graphiti.comp.Edge;
import graphiti.comp.Vertex;

/**
 * @author Julie Sampson
 *
 */
public interface IGraph {

	public void addVertex(Vertex v);
	public void addEdge(Edge e);
	public void updateVertex(Vertex v);
	public void updateEdge(Edge e);
	public void deleteVertex(Vertex v);
	public void deleteEdge(Edge e);
}
