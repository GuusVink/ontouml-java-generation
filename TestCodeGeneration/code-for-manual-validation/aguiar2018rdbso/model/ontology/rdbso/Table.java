/*******************************************************************************
 * File generated from the ontology::aguiar2018rdbso::model::ontology::rdbso::Table uml Class
 * Generated by the Acceleo 3 <i>UML to Java</i> generator.
 * Date: 19 October 2024 20:22:43 CEST
 *******************************************************************************/
package aguiar2018rdbso.model.ontology.rdbso;

import aguiar2018rdbso.model.ontology.dbso.DBMSItem;
import aguiar2018rdbso.model.ontology.dbso.DatabaseSystem;
import aguiar2018rdbso.model.ontology.dbso.LoadedDBMSCopy;
import aguiar2018rdbso.model.ontology.spo.Artifact;
import aguiar2018rdbso.model.ontology.spo.SoftwareItem;
import java.util.ArrayList;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Table.
 * 
 * @author 
 */
public class Table implements RDBMSItem {
	/**
	 * Description of the property lineType.
	 */
	public LineType lineType = null;
	
	/**
	 * Description of the property dataFile.
	 */
	public DataFile dataFile = null;
	
	// Start of user code (user defined attributes for Table)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public Table() {
		// Start of user code constructor for Table)
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for Table)
	
	// End of user code
	/**
	 * Returns databaseSystem.
	 * Originates from implemented interface.
	 * @return databaseSystem 
	 */
	@Override
	public DatabaseSystem getDatabaseSystem() {
		// Start of user code for method getDatabaseSystem
		// TODO implement
		return null;
		// End of user code
	}
	
	/**
	 * Sets a value to attribute databaseSystem. 
	 * Originates from implemented interface.
	 * @param newDatabaseSystem 
	 */
	@Override
	public void setDatabaseSystem(DatabaseSystem newDatabaseSystem) {
		// Start of user code for method setDatabaseSystem
		// TODO implement
		// End of user code
	}
	/**
	 * Returns language.
	 * Originates from implemented interface.
	 * @return language 
	 */
	@Override
	public ArrayList<Language> getLanguage() {
		// Start of user code for method getLanguage
		// TODO implement
		return new ArrayList<Language>();
		// End of user code
	}
	
	/**
	 * Sets a value to attribute language. 
	 * Originates from implemented interface.
	 * @param newLanguage 
	 */
	@Override
	public void setLanguage(ArrayList<Language> newLanguage) {
		// Start of user code for method setLanguage
		// TODO implement
		// End of user code
	}
	/**
	 * Returns loadedRDBMSCopy.
	 * Originates from implemented interface.
	 * @return loadedRDBMSCopy 
	 */
	@Override
	public LoadedRDBMSCopy getLoadedRDBMSCopy() {
		// Start of user code for method getLoadedRDBMSCopy
		// TODO implement
		return null;
		// End of user code
	}
	
	/**
	 * Sets a value to attribute loadedRDBMSCopy. 
	 * Originates from implemented interface.
	 * @param newLoadedRDBMSCopy 
	 */
	@Override
	public void setLoadedRDBMSCopy(LoadedRDBMSCopy newLoadedRDBMSCopy) {
		// Start of user code for method setLoadedRDBMSCopy
		// TODO implement
		// End of user code
	}
	/**
	 * Returns loadedDBMSCopy.
	 * Originates from implemented interface.
	 * @return loadedDBMSCopy 
	 */
	@Override
	public ArrayList<LoadedDBMSCopy> getLoadedDBMSCopy() {
		// Start of user code for method getLoadedDBMSCopy
		// TODO implement
		return new ArrayList<LoadedDBMSCopy>();
		// End of user code
	}
	
	/**
	 * Sets a value to attribute loadedDBMSCopy. 
	 * Originates from implemented interface.
	 * @param newLoadedDBMSCopy 
	 */
	@Override
	public void setLoadedDBMSCopy(ArrayList<LoadedDBMSCopy> newLoadedDBMSCopy) {
		// Start of user code for method setLoadedDBMSCopy
		// TODO implement
		// End of user code
	}
	/**
	 * Returns relationalDatabaseSystem.
	 * Originates from implemented interface.
	 * @return relationalDatabaseSystem 
	 */
	@Override
	public RelationalDatabaseSystem getRelationalDatabaseSystem() {
		// Start of user code for method getRelationalDatabaseSystem
		// TODO implement
		return null;
		// End of user code
	}
	
	/**
	 * Sets a value to attribute relationalDatabaseSystem. 
	 * Originates from implemented interface.
	 * @param newRelationalDatabaseSystem 
	 */
	@Override
	public void setRelationalDatabaseSystem(RelationalDatabaseSystem newRelationalDatabaseSystem) {
		// Start of user code for method setRelationalDatabaseSystem
		// TODO implement
		// End of user code
	}
	
	
	/**
	 * Returns lineType.
	 * @return lineType 
	 */
	public LineType getLineType() {
		return this.lineType;
	}
	
	/**
	 * Sets a value to attribute lineType. 
	 * @param newLineType 
	 */
	public void setLineType(LineType newLineType) {
		this.lineType = newLineType;
	}

	/**
	 * Returns dataFile.
	 * @return dataFile 
	 */
	public DataFile getDataFile() {
		return this.dataFile;
	}
	
	/**
	 * Sets a value to attribute dataFile. 
	 * @param newDataFile 
	 */
	public void setDataFile(DataFile newDataFile) {
		this.dataFile = newDataFile;
	}



}
