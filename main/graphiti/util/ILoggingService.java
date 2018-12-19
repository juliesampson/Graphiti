package graphiti.util;

/**
 * @author Julie Sampson
 *
 * TODO: placeholder for service to handle all application logging
 * one approach is to have a centralized "App Manager" that would supply
 * the appropriate log service at run time based on the request context, or the calling subsystem, etc.. 
 */
public interface ILoggingService {
	
	public void logMessage(String msg, int LOG_LEVEL);
	public void logError(String msg, int SEVERITY);

}
