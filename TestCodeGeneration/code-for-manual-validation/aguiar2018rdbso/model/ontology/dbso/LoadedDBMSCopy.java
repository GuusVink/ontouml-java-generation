/*******************************************************************************
 * File generated from the ontology::aguiar2018rdbso::model::ontology::dbso::LoadedDBMSCopy uml Class
 * Generated by the Acceleo 3 <i>UML to Java</i> generator.
 * Date: 19 October 2024 20:22:43 CEST
 *******************************************************************************/
package aguiar2018rdbso.model.ontology.dbso;

import java.util.ArrayList;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of LoadedDBMSCopy.
 * 
 * @author 
 */
public class LoadedDBMSCopy {
	/**
	 * Description of the property dBMSItem.
	 */
	public ArrayList<DBMSItem> dBMSItem = new ArrayList<DBMSItem>();
	
	/**
	 * Description of the property dBMS.
	 */
	public DBMS dBMS = null;
	
	/**
	 * Description of the property databaseSystem.
	 */
	public DatabaseSystem databaseSystem = null;
	
	// Start of user code (user defined attributes for LoadedDBMSCopy)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public LoadedDBMSCopy() {
		// Start of user code constructor for LoadedDBMSCopy)
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for LoadedDBMSCopy)
	
	// End of user code
	
	
	/**
	 * Returns dBMSItem.
	 * @return dBMSItem 
	 */
	public ArrayList<DBMSItem> getDBMSItem() {
		return this.dBMSItem;
	}
	
	/**
	 * Sets a value to attribute dBMSItem. 
	 * @param newDBMSItem 
	 */
	public void setDBMSItem(ArrayList<DBMSItem> newDBMSItem) {
	    this.dBMSItem = newDBMSItem;
	}
	
	/**
	 * Adds one attribute (if dBMSItem had a multiple cardinality)
	 * @param dBMSItemToAdd in dBMSItem
	 */
	public void addDBMSItemToDBMSItem(DBMSItem dBMSItemToAdd) {
		this.dBMSItem.add(dBMSItemToAdd);
	}
	
	/**
	 * Removes an attribute (if dBMSItem had a multiple cardinality)
	 * @param dBMSItemToRemove in dBMSItem
	 */
	public void removeDBMSItemToDBMSItem(DBMSItem dBMSItemToRemove) {
		this.dBMSItem.remove(dBMSItemToRemove);
	}
	
	/**
	 * Adds all the attribute (if dBMSItem had a multiple cardinality)
	 * @param dBMSItemsToAdd in dBMSItem
	 */
	public void addAllDBMSItemToDBMSItem(ArrayList<DBMSItem> dBMSItemsToAdd) {
		this.dBMSItem.addAll(dBMSItemsToAdd);
	}
	
	/**
	 * Removes all the attribute (if dBMSItem had a multiple cardinality)
	 * @param dBMSItemsToRemove in dBMSItem
	 */
	public void removeAllDBMSItemToDBMSItem(ArrayList<DBMSItem> dBMSItemsToRemove) {
		this.dBMSItem.removeAll(dBMSItemsToRemove);
	}

	/**
	 * Returns dBMS.
	 * @return dBMS 
	 */
	public DBMS getDBMS() {
		return this.dBMS;
	}
	
	/**
	 * Sets a value to attribute dBMS. 
	 * @param newDBMS 
	 */
	public void setDBMS(DBMS newDBMS) {
		this.dBMS = newDBMS;
	}

	/**
	 * Returns databaseSystem.
	 * @return databaseSystem 
	 */
	public DatabaseSystem getDatabaseSystem() {
		return this.databaseSystem;
	}
	
	/**
	 * Sets a value to attribute databaseSystem. 
	 * @param newDatabaseSystem 
	 */
	public void setDatabaseSystem(DatabaseSystem newDatabaseSystem) {
		this.databaseSystem = newDatabaseSystem;
	}



}
