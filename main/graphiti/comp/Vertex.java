package graphiti.comp;

import graphiti.err.GraphitiException;
import graphiti.util.GraphitiDefaultStrings;
import graphiti.util.GraphitiConfigDefaults;
import java.text.MessageFormat;

/**
 * @author Julie Sampson
 * 
 *
 */
public class Vertex {
	
	private String name;
	private int inDegree;
	private int outDegree;
	
	/**
	 * Construct an isolated Vertex (degree in/out set to 0)
	 * @param name - the non-null vertex name
	 */
	public Vertex(String name)  {
		
		this(name, GraphitiConfigDefaults.DEFAULT_VERTEX_DEGREE_IN, GraphitiConfigDefaults.DEFAULT_VERTEX_DEGREE_OUT);
	}

	/**
	 * Construct a Vertex with a name and degrees in and out. 
	 * Invalid values (null for name and negative for degree) are set to reasonable defaults 
	 * which are specified in GraphitiConfigDefaults.java
	 * 
	 * 
	 * @see GraphitiConfigDefaults
	 * 
	 * @param name - the non-null vertex name 
	 * @param inDegree - number of incoming edges; if negative, then a safe default is used
	 * @param outDegree - number of outgoing edges; if negative, then a safe default is used
	 * 		
	 */
	public Vertex(String name, int inDegree, int outDegree) {
		
		if (name == null) {
			setName(GraphitiConfigDefaults.DEFAULT_VERTEX_NAME);
			
		} else {
			setName(name);
		}

		if ( inDegree < 0 || outDegree < 0) {					
			this.inDegree = GraphitiConfigDefaults.DEFAULT_VERTEX_DEGREE_IN;
			this.outDegree = GraphitiConfigDefaults.DEFAULT_VERTEX_DEGREE_OUT;	
			
		} else  {
			this.inDegree = inDegree;
			this.outDegree = outDegree;
		}
	}
	/**
	 * @return the name of the vertex
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param the vertex name
	 */
	public void setName(String name) {
		this.name = name;
	}	
	/**
	 * @return inDegree - the number of incoming edges
	 */
	public int getInDegree() {
		return inDegree;
	}

	/**
	 * TODO: should access to this setter be restricted and instead the functionality is 
	 * exposed through increment and decrement methods
	 * ?
	 * @param inDegree - the number of incoming edges
	 */
	public void setInDegree(int inDegree) {
		this.inDegree = inDegree;
	}

	/**
	 * @return the number of outgoing edges
	 */
	public int getOutDegree() {
		return outDegree;
	}

	/**
	 * @param outDegree - the number of outgoing edges
	 */
	public void setOutDegree(int outDegree) {
		this.outDegree = outDegree;
	}

	/**
	 * 
	 * @return total number of connected edges
	 */
	public int getDegree() {
		return this.inDegree + this.outDegree;
	}
	

}
