/*******************************************************************************
 * File generated from the Project Management Ontology::projectmanagementontology::model::project_management_ontology::project_management_ontology::Project uml Class
 * Generated by the Acceleo 3 <i>UML to Java</i> generator.
 * Date: 31 October 2024 16:51:36 CET
 *******************************************************************************/
package projectmanagementontology.model.project_management_ontology.project_management_ontology;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Project.
 * 
 * @author 
 */
public class Project {
	/**
	 * Description of the property performedSchedule.
	 */
	public PerformedSchedule performedSchedule = null;
	
	/**
	 * Description of the property plannedSchedule.
	 */
	public PlannedSchedule plannedSchedule = null;
	
	// Start of user code (user defined attributes for Project)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public Project() {
		// Start of user code constructor for Project)
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for Project)
	
	// End of user code
	
	
	/**
	 * Returns performedSchedule.
	 * @return performedSchedule 
	 */
	public PerformedSchedule getPerformedSchedule() {
		return this.performedSchedule;
	}
	
	/**
	 * Sets a value to attribute performedSchedule. 
	 * @param newPerformedSchedule 
	 */
	public void setPerformedSchedule(PerformedSchedule newPerformedSchedule) {
		this.performedSchedule = newPerformedSchedule;
	}

	/**
	 * Returns plannedSchedule.
	 * @return plannedSchedule 
	 */
	public PlannedSchedule getPlannedSchedule() {
		return this.plannedSchedule;
	}
	
	/**
	 * Sets a value to attribute plannedSchedule. 
	 * @param newPlannedSchedule 
	 */
	public void setPlannedSchedule(PlannedSchedule newPlannedSchedule) {
		this.plannedSchedule = newPlannedSchedule;
	}



}