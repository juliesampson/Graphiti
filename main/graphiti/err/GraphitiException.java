/**
 * 
 */
package graphiti.err;

/**
 * @author Julie Sampson
 *
 */
public class GraphitiException extends Exception {

	/**
	 * @param message
	 */
	public GraphitiException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param t
	 */
	public GraphitiException(Throwable t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param t
	 */
	public GraphitiException(String message, Throwable t) {
		super(message, t);
		// TODO Auto-generated constructor stub
	}

}
