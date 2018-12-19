package graphiti.comp;

/**
 * @author Julie Sampson
 *
 */
public class WeightedEdge extends Edge {

	private int weight;
	/**
	 * @param label
	 * @param origin
	 * @param destination
	 * @param weight
	 */
	public WeightedEdge(String label, Vertex origin, Vertex destination, int weight) {
		super(label, origin, destination);

	}
	/**
	 * @return weight
	 */
	public int getWeight() {
		return weight;
	}
	/**
	 * @param int weight - weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

}
