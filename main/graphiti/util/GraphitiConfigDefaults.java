/**
 * 
 */
package graphiti.util;

/**
 * Global configuration constants with reasonable default values. 
 *
 * @author Julie Sampson
 *
 */
public final class GraphitiConfigDefaults {
	
	/**
	 * Graph properties
	 */
	public static final String DIRECTED_GRAPH_NAME = "DiGraph";
	public static final String DEFAULT_INPUT_DATA_FILE = "G1.json";
	public static final int GRAPH_CAPACITY_INTERNAL = 16;
	public static final double GRAPH_FILL_RATIO_INTERNAL = .75;
	
	/**
	 * Vertex properties
	 */
	public static final String 	DEFAULT_VERTEX_NAME = "DefaultVertexName";
	public static final int 	DEFAULT_VERTEX_DEGREE = 0;
	public static final int 	DEFAULT_VERTEX_DEGREE_IN = 0;
	public static final int 	DEFAULT_VERTEX_DEGREE_OUT = 0;
	
	/**
	 * Edge properties
	 */
	
	/**
	 * Don't instantiate me - "respect my immutability!"
	 */
	private GraphitiConfigDefaults() {
		
	}

}
