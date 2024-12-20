/*******************************************************************************
 * File generated from the ontology::aguiar2018rdbso::model::ontology::rdbso::RelationalDatabase uml Class
 * Generated by the Acceleo 3 <i>UML to Java</i> generator.
 * Date: 19 October 2024 20:22:43 CEST
 *******************************************************************************/
package aguiar2018rdbso.model.ontology.rdbso;

import aguiar2018rdbso.model.ontology.dbso.DBMSItem;
import aguiar2018rdbso.model.ontology.dbso.Database;
import aguiar2018rdbso.model.ontology.dbso.DatabaseSystem;
import aguiar2018rdbso.model.ontology.dbso.LoadedDBMSCopy;
import aguiar2018rdbso.model.ontology.spo.Artifact;
import aguiar2018rdbso.model.ontology.spo.SoftwareItem;
import java.util.ArrayList;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of RelationalDatabase.
 * 
 * @author 
 */
public class RelationalDatabase extends Database implements RDBMSItem {
	/**
	 * Description of the property relationalSchema.
	 */
	public ArrayList<RelationalSchema> relationalSchema = new ArrayList<RelationalSchema>();
	
	// Start of user code (user defined attributes for RelationalDatabase)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public RelationalDatabase() {
		// Start of user code constructor for RelationalDatabase)
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for RelationalDatabase)
	
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
	 * Returns relationalSchema.
	 * @return relationalSchema 
	 */
	public ArrayList<RelationalSchema> getRelationalSchema() {
		return this.relationalSchema;
	}
	
	/**
	 * Sets a value to attribute relationalSchema. 
	 * @param newRelationalSchema 
	 */
	public void setRelationalSchema(ArrayList<RelationalSchema> newRelationalSchema) {
	    this.relationalSchema = newRelationalSchema;
	}
	
	/**
	 * Adds one attribute (if relationalSchema had a multiple cardinality)
	 * @param relationalSchemaToAdd in relationalSchema
	 */
	public void addRelationalSchemaToRelationalSchema(RelationalSchema relationalSchemaToAdd) {
		this.relationalSchema.add(relationalSchemaToAdd);
	}
	
	/**
	 * Removes an attribute (if relationalSchema had a multiple cardinality)
	 * @param relationalSchemaToRemove in relationalSchema
	 */
	public void removeRelationalSchemaToRelationalSchema(RelationalSchema relationalSchemaToRemove) {
		this.relationalSchema.remove(relationalSchemaToRemove);
	}
	
	/**
	 * Adds all the attribute (if relationalSchema had a multiple cardinality)
	 * @param relationalSchemasToAdd in relationalSchema
	 */
	public void addAllRelationalSchemaToRelationalSchema(ArrayList<RelationalSchema> relationalSchemasToAdd) {
		this.relationalSchema.addAll(relationalSchemasToAdd);
	}
	
	/**
	 * Removes all the attribute (if relationalSchema had a multiple cardinality)
	 * @param relationalSchemasToRemove in relationalSchema
	 */
	public void removeAllRelationalSchemaToRelationalSchema(ArrayList<RelationalSchema> relationalSchemasToRemove) {
		this.relationalSchema.removeAll(relationalSchemasToRemove);
	}



}
