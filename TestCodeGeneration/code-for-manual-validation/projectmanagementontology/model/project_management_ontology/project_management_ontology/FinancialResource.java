/*******************************************************************************
 * File generated from the Project Management Ontology::projectmanagementontology::model::project_management_ontology::project_management_ontology::FinancialResource uml Class
 * Generated by the Acceleo 3 <i>UML to Java</i> generator.
 * Date: 31 October 2024 16:51:36 CET
 *******************************************************************************/
package projectmanagementontology.model.project_management_ontology.project_management_ontology;

import java.util.ArrayList;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of FinancialResource.
 * 
 * @author 
 */
public class FinancialResource implements Resource {
	/**
	 * Description of the property money.
	 */
	public final Money money = null;
	
	// Start of user code (user defined attributes for FinancialResource)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public FinancialResource() {
		// Start of user code constructor for FinancialResource)
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for FinancialResource)
	
	// End of user code
	/**
	 * Returns resourceAllocation.
	 * Originates from implemented interface.
	 * @return resourceAllocation 
	 */
	@Override
	public ArrayList<ResourceAllocation> getResourceAllocation() {
		// Start of user code for method getResourceAllocation
		// TODO implement
		return new ArrayList<ResourceAllocation>();
		// End of user code
	}
	
	/**
	 * Sets a value to attribute resourceAllocation. 
	 * Originates from implemented interface.
	 * @param newResourceAllocation 
	 */
	@Override
	public void setResourceAllocation(ArrayList<ResourceAllocation> newResourceAllocation) {
		// Start of user code for method setResourceAllocation
		// TODO implement
		// End of user code
	}
	
	
	/**
	 * Returns money.
	 * @return money 
	 */
	public Money getMoney() {
		return this.money;
	}



}
