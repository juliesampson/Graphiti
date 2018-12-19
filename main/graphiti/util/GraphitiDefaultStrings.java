
package graphiti.util;

/** 
 * Common shared strings used across the application for consistent messaging both
 * on UI components, in logfiles or for composing other message: SMS, SNMP alerts, etc.
 * 
 * <p>
 * Relies on a message formatting service to populate strings {@link java.text.MessageFormat MessageFormat}
 * <p>
 * 
 * @see <a href="http://www.eclipse.org/articles/Article-Internationalization/how2I18n.html">DIY - Eclipse Plugin i18n</a> 
 * @author Julie Sampson
 * 
 */
public final class GraphitiDefaultStrings {

	/**
	 * Error messages
	 */
	
	public static String VERTEX_NULL_MSG = "The vertex cannot be null\n";
	public static String VERTEX_INVALID_ATTR_VALUE = "Invalid value of {0} for the vertex {1}";
	
	/**
	 * UI Components
	 */

	public static String APP_NAME = "Graph Builder";
	public static String BUILDER_PANEL_HEADER_LABEL = "Graph Component Editor: \"{0}\"";
	
	/**
	 * Don't instantiate me - "respect my immutability!"
	 */
	private GraphitiDefaultStrings() {
		
	}

}
