/*******************************************************************************
 * File generated from the Normative Acts::barcelos2013normativeacts::model::normative_acts::normative_acts::ComposedItem uml Class
 * Generated by the Acceleo 3 <i>UML to Java</i> generator.
 * Date: 19 October 2024 20:23:49 CEST
 *******************************************************************************/
package barcelos2013normativeacts.model.normative_acts.normative_acts;

import java.util.ArrayList;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of ComposedItem.
 * 
 * @author 
 */
public class ComposedItem extends Item {
	/**
	 * Description of the property letter.
	 */
	public ArrayList<Letter> letter = new ArrayList<Letter>();
	
	// Start of user code (user defined attributes for ComposedItem)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public ComposedItem() {
		// Start of user code constructor for ComposedItem)
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for ComposedItem)
	
	// End of user code
	
	
	/**
	 * Returns letter.
	 * @return letter 
	 */
	public ArrayList<Letter> getLetter() {
		return this.letter;
	}
	
	/**
	 * Sets a value to attribute letter. 
	 * @param newLetter 
	 */
	public void setLetter(ArrayList<Letter> newLetter) {
	    this.letter = newLetter;
	}
	
	/**
	 * Adds one attribute (if letter had a multiple cardinality)
	 * @param letterToAdd in letter
	 */
	public void addLetterToLetter(Letter letterToAdd) {
		this.letter.add(letterToAdd);
	}
	
	/**
	 * Removes an attribute (if letter had a multiple cardinality)
	 * @param letterToRemove in letter
	 */
	public void removeLetterToLetter(Letter letterToRemove) {
		this.letter.remove(letterToRemove);
	}
	
	/**
	 * Adds all the attribute (if letter had a multiple cardinality)
	 * @param lettersToAdd in letter
	 */
	public void addAllLetterToLetter(ArrayList<Letter> lettersToAdd) {
		this.letter.addAll(lettersToAdd);
	}
	
	/**
	 * Removes all the attribute (if letter had a multiple cardinality)
	 * @param lettersToRemove in letter
	 */
	public void removeAllLetterToLetter(ArrayList<Letter> lettersToRemove) {
		this.letter.removeAll(lettersToRemove);
	}



}
