/*******************************************************************************
 * File generated from the ontology::aguiar2018rdbso::model::ontology::rdbso::RDBMSItem uml Interface
 * Generated by the Acceleo 3 <i>UML to Java</i> generator.
 * Date: 19 October 2024 20:22:42 CEST
 *******************************************************************************/
package aguiar2018rdbso.model.ontology.rdbso;

import aguiar2018rdbso.model.ontology.dbso.DBMSItem;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of RDBMSItem.
 * 
 * @author 
 */
public interface RDBMSItem  extends DBMSItem{


	/**
	 * Returns loadedRDBMSCopy.
	 * @return loadedRDBMSCopy 
	 */
	LoadedRDBMSCopy getLoadedRDBMSCopy();
	
	
	/**
	 * Sets a value to attribute loadedRDBMSCopy. 
	 * @param newLoadedRDBMSCopy 
	 */
	void setLoadedRDBMSCopy(LoadedRDBMSCopy newLoadedRDBMSCopy);

	/**
	 * Returns relationalDatabaseSystem.
	 * @return relationalDatabaseSystem 
	 */
	RelationalDatabaseSystem getRelationalDatabaseSystem();
	
	
	/**
	 * Sets a value to attribute relationalDatabaseSystem. 
	 * @param newRelationalDatabaseSystem 
	 */
	void setRelationalDatabaseSystem(RelationalDatabaseSystem newRelationalDatabaseSystem);


	// Start of user code (user defined methods for RDBMSItem)
	
	// End of user code


}
