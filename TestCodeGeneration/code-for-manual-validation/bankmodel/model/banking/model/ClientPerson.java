/*******************************************************************************
 * File generated from the Banking::bankmodel::model::banking::model::ClientPerson uml Class
 * Generated by the Acceleo 3 <i>UML to Java</i> generator.
 * Date: 19 October 2024 20:23:29 CEST
 *******************************************************************************/
package bankmodel.model.banking.model;

import java.util.ArrayList;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of ClientPerson.
 * 
 * @author 
 */
public class ClientPerson implements Client {
	/**
	 * Description of the property person.
	 */
	public final Person person = null;
	
	// Start of user code (user defined attributes for ClientPerson)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public ClientPerson() {
		// Start of user code constructor for ClientPerson)
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for ClientPerson)
	
	// End of user code
	/**
	 * Returns account.
	 * Originates from implemented interface.
	 * @return account 
	 */
	@Override
	public ArrayList<Account> getAccount() {
		// Start of user code for method getAccount
		// TODO implement
		return new ArrayList<Account>();
		// End of user code
	}
	
	/**
	 * Sets a value to attribute account. 
	 * Originates from implemented interface.
	 * @param newAccount 
	 */
	@Override
	public void setAccount(ArrayList<Account> newAccount) {
		// Start of user code for method setAccount
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
