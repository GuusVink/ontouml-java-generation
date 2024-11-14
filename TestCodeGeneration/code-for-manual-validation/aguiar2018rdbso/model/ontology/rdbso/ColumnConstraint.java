/*******************************************************************************
 * File generated from the ontology::aguiar2018rdbso::model::ontology::rdbso::ColumnConstraint uml Class
 * Generated by the Acceleo 3 <i>UML to Java</i> generator.
 * Date: 19 October 2024 20:22:43 CEST
 *******************************************************************************/
package aguiar2018rdbso.model.ontology.rdbso;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of ColumnConstraint.
 * 
 * @author 
 */
public class ColumnConstraint extends Constraint {
	/**
	 * Description of the property column.
	 */
	public Column column = null;
	
	// Start of user code (user defined attributes for ColumnConstraint)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public ColumnConstraint() {
		// Start of user code constructor for ColumnConstraint)
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for ColumnConstraint)
	
	// End of user code
	
	
	/**
	 * Returns column.
	 * @return column 
	 */
	public Column getColumn() {
		return this.column;
	}
	
	/**
	 * Sets a value to attribute column. 
	 * @param newColumn 
	 */
	public void setColumn(Column newColumn) {
		this.column = newColumn;
	}



}