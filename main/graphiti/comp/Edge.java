
package graphiti.comp;

/**
 * @author Julie Sampson
 *
 */
public class Edge {
	
	private String label;
	private Vertex origin;
	private Vertex destination;
	/**
	 * @param label
	 * @param origin
	 * @param destination
	 */
	public Edge(String label, Vertex origin, Vertex destination) {
		super();
		this.label = label;
		this.origin = origin;
		this.destination = destination;
	}
	/**
	 * @return label
	 */
	public String getLabel() {
		return label;
	}
	/**
	 * @param String label - label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}
	/**
	 * @return origin
	 */
	public Vertex getOrigin() {
		return origin;
	}
	/**
	 * @param Vertex origin - origin to set
	 */
	public void setOrigin(Vertex origin) {
		this.origin = origin;
	}
	/**
	 * @return destination
	 */
	public Vertex getDestination() {
		return destination;
	}
	/**
	 * @param Vertex destination - destination to set
	 */
	public void setDestination(Vertex destination) {
		this.destination = destination;
	}
	
	
}
