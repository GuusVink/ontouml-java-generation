/*******************************************************************************
 * File generated from the ontology::aguiar2018rdbso::model::ontology::dbso::DataLanguage uml Class
 * Generated by the Acceleo 3 <i>UML to Java</i> generator.
 * Date: 19 October 2024 20:22:43 CEST
 *******************************************************************************/
package aguiar2018rdbso.model.ontology.dbso;

import aguiar2018rdbso.model.ontology.rdbso.Language;
import java.util.ArrayList;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of DataLanguage.
 * 
 * @author 
 */
public class DataLanguage extends Language {
	/**
	 * Description of the property dBMS.
	 */
	public ArrayList<DBMS> dBMS = new ArrayList<DBMS>();
	
	// Start of user code (user defined attributes for DataLanguage)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public DataLanguage() {
		// Start of user code constructor for DataLanguage)
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for DataLanguage)
	
	// End of user code
	
	
	/**
	 * Returns dBMS.
	 * @return dBMS 
	 */
	public ArrayList<DBMS> getDBMS() {
		return this.dBMS;
	}
	
	/**
	 * Sets a value to attribute dBMS. 
	 * @param newDBMS 
	 */
	public void setDBMS(ArrayList<DBMS> newDBMS) {
	    this.dBMS = newDBMS;
	}
	
	/**
	 * Adds one attribute (if dBMS had a multiple cardinality)
	 * @param dBMSToAdd in dBMS
	 */
	public void addDBMSToDBMS(DBMS dBMSToAdd) {
		this.dBMS.add(dBMSToAdd);
	}
	
	/**
	 * Removes an attribute (if dBMS had a multiple cardinality)
	 * @param dBMSToRemove in dBMS
	 */
	public void removeDBMSToDBMS(DBMS dBMSToRemove) {
		this.dBMS.remove(dBMSToRemove);
	}
	
	/**
	 * Adds all the attribute (if dBMS had a multiple cardinality)
	 * @param dBMSsToAdd in dBMS
	 */
	public void addAllDBMSToDBMS(ArrayList<DBMS> dBMSsToAdd) {
		this.dBMS.addAll(dBMSsToAdd);
	}
	
	/**
	 * Removes all the attribute (if dBMS had a multiple cardinality)
	 * @param dBMSsToRemove in dBMS
	 */
	public void removeAllDBMSToDBMS(ArrayList<DBMS> dBMSsToRemove) {
		this.dBMS.removeAll(dBMSsToRemove);
	}



}