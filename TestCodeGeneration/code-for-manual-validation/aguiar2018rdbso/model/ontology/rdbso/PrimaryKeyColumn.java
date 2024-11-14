/*******************************************************************************
 * File generated from the ontology::aguiar2018rdbso::model::ontology::rdbso::PrimaryKeyColumn uml Class
 * Generated by the Acceleo 3 <i>UML to Java</i> generator.
 * Date: 19 October 2024 20:22:43 CEST
 *******************************************************************************/
package aguiar2018rdbso.model.ontology.rdbso;

import java.util.ArrayList;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of PrimaryKeyColumn.
 * 
 * @author 
 */
public class PrimaryKeyColumn {
	/**
	 * Description of the property column.
	 */
	public final Column column = null;
	
	/**
	 * Description of the property foreignKeyConstraint.
	 */
	public ArrayList<ForeignKeyConstraint> foreignKeyConstraint = new ArrayList<ForeignKeyConstraint>();
	
	// Start of user code (user defined attributes for PrimaryKeyColumn)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public PrimaryKeyColumn() {
		// Start of user code constructor for PrimaryKeyColumn)
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for PrimaryKeyColumn)
	
	// End of user code
	
	
	/**
	 * Returns column.
	 * @return column 
	 */
	public Column getColumn() {
		return this.column;
	}

	/**
	 * Returns foreignKeyConstraint.
	 * @return foreignKeyConstraint 
	 */
	public ArrayList<ForeignKeyConstraint> getForeignKeyConstraint() {
		return this.foreignKeyConstraint;
	}
	
	/**
	 * Sets a value to attribute foreignKeyConstraint. 
	 * @param newForeignKeyConstraint 
	 */
	public void setForeignKeyConstraint(ArrayList<ForeignKeyConstraint> newForeignKeyConstraint) {
	    this.foreignKeyConstraint = newForeignKeyConstraint;
	}
	
	/**
	 * Adds one attribute (if foreignKeyConstraint had a multiple cardinality)
	 * @param foreignKeyConstraintToAdd in foreignKeyConstraint
	 */
	public void addForeignKeyConstraintToForeignKeyConstraint(ForeignKeyConstraint foreignKeyConstraintToAdd) {
		this.foreignKeyConstraint.add(foreignKeyConstraintToAdd);
	}
	
	/**
	 * Removes an attribute (if foreignKeyConstraint had a multiple cardinality)
	 * @param foreignKeyConstraintToRemove in foreignKeyConstraint
	 */
	public void removeForeignKeyConstraintToForeignKeyConstraint(ForeignKeyConstraint foreignKeyConstraintToRemove) {
		this.foreignKeyConstraint.remove(foreignKeyConstraintToRemove);
	}
	
	/**
	 * Adds all the attribute (if foreignKeyConstraint had a multiple cardinality)
	 * @param foreignKeyConstraintsToAdd in foreignKeyConstraint
	 */
	public void addAllForeignKeyConstraintToForeignKeyConstraint(ArrayList<ForeignKeyConstraint> foreignKeyConstraintsToAdd) {
		this.foreignKeyConstraint.addAll(foreignKeyConstraintsToAdd);
	}
	
	/**
	 * Removes all the attribute (if foreignKeyConstraint had a multiple cardinality)
	 * @param foreignKeyConstraintsToRemove in foreignKeyConstraint
	 */
	public void removeAllForeignKeyConstraintToForeignKeyConstraint(ArrayList<ForeignKeyConstraint> foreignKeyConstraintsToRemove) {
		this.foreignKeyConstraint.removeAll(foreignKeyConstraintsToRemove);
	}



}