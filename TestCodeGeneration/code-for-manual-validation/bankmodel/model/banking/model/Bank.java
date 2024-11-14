/*******************************************************************************
 * File generated from the Banking::bankmodel::model::banking::model::Bank uml Class
 * Generated by the Acceleo 3 <i>UML to Java</i> generator.
 * Date: 19 October 2024 20:23:29 CEST
 *******************************************************************************/
package bankmodel.model.banking.model;

import java.util.ArrayList;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Bank.
 * 
 * @author 
 */
public class Bank extends Organization {
	/**
	 * Description of the property account.
	 */
	public ArrayList<Account> account = new ArrayList<Account>();
	
	// Start of user code (user defined attributes for Bank)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public Bank() {
		// Start of user code constructor for Bank)
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for Bank)
	
	// End of user code
	
	
	/**
	 * Returns account.
	 * @return account 
	 */
	public ArrayList<Account> getAccount() {
		return this.account;
	}
	
	/**
	 * Sets a value to attribute account. 
	 * @param newAccount 
	 */
	public void setAccount(ArrayList<Account> newAccount) {
	    this.account = newAccount;
	}
	
	/**
	 * Adds one attribute (if account had a multiple cardinality)
	 * @param accountToAdd in account
	 */
	public void addAccountToAccount(Account accountToAdd) {
		this.account.add(accountToAdd);
	}
	
	/**
	 * Removes an attribute (if account had a multiple cardinality)
	 * @param accountToRemove in account
	 */
	public void removeAccountToAccount(Account accountToRemove) {
		this.account.remove(accountToRemove);
	}
	
	/**
	 * Adds all the attribute (if account had a multiple cardinality)
	 * @param accountsToAdd in account
	 */
	public void addAllAccountToAccount(ArrayList<Account> accountsToAdd) {
		this.account.addAll(accountsToAdd);
	}
	
	/**
	 * Removes all the attribute (if account had a multiple cardinality)
	 * @param accountsToRemove in account
	 */
	public void removeAllAccountToAccount(ArrayList<Account> accountsToRemove) {
		this.account.removeAll(accountsToRemove);
	}



}