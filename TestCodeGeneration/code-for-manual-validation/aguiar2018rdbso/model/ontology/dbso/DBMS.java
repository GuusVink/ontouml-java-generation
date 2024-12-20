/*******************************************************************************
 * File generated from the ontology::aguiar2018rdbso::model::ontology::dbso::DBMS uml Class
 * Generated by the Acceleo 3 <i>UML to Java</i> generator.
 * Date: 19 October 2024 20:22:43 CEST
 *******************************************************************************/
package aguiar2018rdbso.model.ontology.dbso;

import aguiar2018rdbso.model.ontology.swo.SoftwareSystem;
import java.util.ArrayList;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of DBMS.
 * 
 * @author 
 */
public class DBMS extends SoftwareSystem {
	/**
	 * Description of the property dataLanguage.
	 */
	public DataLanguage dataLanguage = null;
	
	/**
	 * Description of the property loadedDBMSCopy.
	 */
	public ArrayList<LoadedDBMSCopy> loadedDBMSCopy = new ArrayList<LoadedDBMSCopy>();
	
	// Start of user code (user defined attributes for DBMS)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public DBMS() {
		// Start of user code constructor for DBMS)
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for DBMS)
	
	// End of user code
	
	
	/**
	 * Returns dataLanguage.
	 * @return dataLanguage 
	 */
	public DataLanguage getDataLanguage() {
		return this.dataLanguage;
	}
	
	/**
	 * Sets a value to attribute dataLanguage. 
	 * @param newDataLanguage 
	 */
	public void setDataLanguage(DataLanguage newDataLanguage) {
		this.dataLanguage = newDataLanguage;
	}

	/**
	 * Returns loadedDBMSCopy.
	 * @return loadedDBMSCopy 
	 */
	public ArrayList<LoadedDBMSCopy> getLoadedDBMSCopy() {
		return this.loadedDBMSCopy;
	}
	
	/**
	 * Sets a value to attribute loadedDBMSCopy. 
	 * @param newLoadedDBMSCopy 
	 */
	public void setLoadedDBMSCopy(ArrayList<LoadedDBMSCopy> newLoadedDBMSCopy) {
	    this.loadedDBMSCopy = newLoadedDBMSCopy;
	}
	
	/**
	 * Adds one attribute (if loadedDBMSCopy had a multiple cardinality)
	 * @param loadedDBMSCopyToAdd in loadedDBMSCopy
	 */
	public void addLoadedDBMSCopyToLoadedDBMSCopy(LoadedDBMSCopy loadedDBMSCopyToAdd) {
		this.loadedDBMSCopy.add(loadedDBMSCopyToAdd);
	}
	
	/**
	 * Removes an attribute (if loadedDBMSCopy had a multiple cardinality)
	 * @param loadedDBMSCopyToRemove in loadedDBMSCopy
	 */
	public void removeLoadedDBMSCopyToLoadedDBMSCopy(LoadedDBMSCopy loadedDBMSCopyToRemove) {
		this.loadedDBMSCopy.remove(loadedDBMSCopyToRemove);
	}
	
	/**
	 * Adds all the attribute (if loadedDBMSCopy had a multiple cardinality)
	 * @param loadedDBMSCopysToAdd in loadedDBMSCopy
	 */
	public void addAllLoadedDBMSCopyToLoadedDBMSCopy(ArrayList<LoadedDBMSCopy> loadedDBMSCopysToAdd) {
		this.loadedDBMSCopy.addAll(loadedDBMSCopysToAdd);
	}
	
	/**
	 * Removes all the attribute (if loadedDBMSCopy had a multiple cardinality)
	 * @param loadedDBMSCopysToRemove in loadedDBMSCopy
	 */
	public void removeAllLoadedDBMSCopyToLoadedDBMSCopy(ArrayList<LoadedDBMSCopy> loadedDBMSCopysToRemove) {
		this.loadedDBMSCopy.removeAll(loadedDBMSCopysToRemove);
	}



}
