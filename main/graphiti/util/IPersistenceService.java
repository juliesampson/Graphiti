package graphiti.util;

import graphiti.IGraph;

/**
 * @author Julie Sampson
 * TODO: placeholder for interface to read graphs into memory and write them out to storage
 * For example, FileServiceImpl.java, DataStoreImpl.java, SocketServiceImpl.java etc..
 */
public interface IPersistenceService {

	public boolean saveState (IGraph graph);
	public IGraph loadState();
}
