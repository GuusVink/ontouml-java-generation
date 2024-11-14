/*******************************************************************************
 * File generated from the Project Management Ontology::projectmanagementontology::model::project_management_ontology::project_management_ontology::HumanResource uml Class
 * Generated by the Acceleo 3 <i>UML to Java</i> generator.
 * Date: 31 October 2024 16:51:36 CET
 *******************************************************************************/
package projectmanagementontology.model.project_management_ontology.project_management_ontology;

import java.util.ArrayList;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of HumanResource.
 * 
 * @author 
 */
public class HumanResource implements Resource {
	/**
	 * Description of the property person.
	 */
	public final Person person = null;
	
	// Start of user code (user defined attributes for HumanResource)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public HumanResource() {
		// Start of user code constructor for HumanResource)
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for HumanResource)
	
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
	 * Returns person.
	 * @return person 
	 */
	public Person getPerson() {
		return this.person;
	}



}
