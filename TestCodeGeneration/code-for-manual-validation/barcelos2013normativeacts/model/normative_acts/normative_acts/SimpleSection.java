/*******************************************************************************
 * File generated from the Normative Acts::barcelos2013normativeacts::model::normative_acts::normative_acts::SimpleSection uml Class
 * Generated by the Acceleo 3 <i>UML to Java</i> generator.
 * Date: 19 October 2024 20:23:49 CEST
 *******************************************************************************/
package barcelos2013normativeacts.model.normative_acts.normative_acts;

import java.util.ArrayList;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of SimpleSection.
 * 
 * @author 
 */
public class SimpleSection extends Section {
	/**
	 * Description of the property members.
	 */
	public ArrayList<ArticleComponentOfSection> members = new ArrayList<ArticleComponentOfSection>();
	
	// Start of user code (user defined attributes for SimpleSection)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public SimpleSection() {
		// Start of user code constructor for SimpleSection)
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for SimpleSection)
	
	// End of user code
	
	
	/**
	 * Returns members.
	 * @return members 
	 */
	public ArrayList<ArticleComponentOfSection> getMembers() {
		return this.members;
	}
	
	/**
	 * Sets a value to attribute members. 
	 * @param newMembers 
	 */
	public void setMembers(ArrayList<ArticleComponentOfSection> newMembers) {
	    this.members = newMembers;
	}
	
	/**
	 * Adds one attribute (if members had a multiple cardinality)
	 * @param articleComponentOfSectionToAdd in members
	 */
	public void addArticleComponentOfSectionToMembers(ArticleComponentOfSection articleComponentOfSectionToAdd) {
		this.members.add(articleComponentOfSectionToAdd);
	}
	
	/**
	 * Removes an attribute (if members had a multiple cardinality)
	 * @param articleComponentOfSectionToRemove in members
	 */
	public void removeArticleComponentOfSectionToMembers(ArticleComponentOfSection articleComponentOfSectionToRemove) {
		this.members.remove(articleComponentOfSectionToRemove);
	}
	
	/**
	 * Adds all the attribute (if members had a multiple cardinality)
	 * @param articleComponentOfSectionsToAdd in members
	 */
	public void addAllArticleComponentOfSectionToMembers(ArrayList<ArticleComponentOfSection> articleComponentOfSectionsToAdd) {
		this.members.addAll(articleComponentOfSectionsToAdd);
	}
	
	/**
	 * Removes all the attribute (if members had a multiple cardinality)
	 * @param articleComponentOfSectionsToRemove in members
	 */
	public void removeAllArticleComponentOfSectionToMembers(ArrayList<ArticleComponentOfSection> articleComponentOfSectionsToRemove) {
		this.members.removeAll(articleComponentOfSectionsToRemove);
	}



}
