package graphiti;

import java.util.Observable;

/**
 * @author Julie Sampson
 *
 */
public abstract class AGraph extends Observable implements IGraph {
	
	public String name;
	public String type;
	
	public abstract void structureChanged();
	

	/**
	 * Concrete classes need to call this when a part of the graph 
	 * is changed  
	 */
	protected synchronized void updated() {
		super.setChanged();
		super.notifyObservers();
	}
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param String name - name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param String type - type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
}
