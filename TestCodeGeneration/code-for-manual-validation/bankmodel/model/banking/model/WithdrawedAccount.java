/*******************************************************************************
 * File generated from the Banking::bankmodel::model::banking::model::WithdrawedAccount uml Class
 * Generated by the Acceleo 3 <i>UML to Java</i> generator.
 * Date: 19 October 2024 20:23:29 CEST
 *******************************************************************************/
package bankmodel.model.banking.model;

import java.util.ArrayList;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of WithdrawedAccount.
 * 
 * @author 
 */
public class WithdrawedAccount {
	/**
	 * Description of the property withdraw.
	 */
	public ArrayList<Withdraw> withdraw = new ArrayList<Withdraw>();
	
	// Start of user code (user defined attributes for WithdrawedAccount)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public WithdrawedAccount() {
		// Start of user code constructor for WithdrawedAccount)
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for WithdrawedAccount)
	
	// End of user code
	
	
	/**
	 * Returns withdraw.
	 * @return withdraw 
	 */
	public ArrayList<Withdraw> getWithdraw() {
		return this.withdraw;
	}
	
	/**
	 * Sets a value to attribute withdraw. 
	 * @param newWithdraw 
	 */
	public void setWithdraw(ArrayList<Withdraw> newWithdraw) {
	    this.withdraw = newWithdraw;
	}
	
	/**
	 * Adds one attribute (if withdraw had a multiple cardinality)
	 * @param withdrawToAdd in withdraw
	 */
	public void addWithdrawToWithdraw(Withdraw withdrawToAdd) {
		this.withdraw.add(withdrawToAdd);
	}
	
	/**
	 * Removes an attribute (if withdraw had a multiple cardinality)
	 * @param withdrawToRemove in withdraw
	 */
	public void removeWithdrawToWithdraw(Withdraw withdrawToRemove) {
		this.withdraw.remove(withdrawToRemove);
	}
	
	/**
	 * Adds all the attribute (if withdraw had a multiple cardinality)
	 * @param withdrawsToAdd in withdraw
	 */
	public void addAllWithdrawToWithdraw(ArrayList<Withdraw> withdrawsToAdd) {
		this.withdraw.addAll(withdrawsToAdd);
	}
	
	/**
	 * Removes all the attribute (if withdraw had a multiple cardinality)
	 * @param withdrawsToRemove in withdraw
	 */
	public void removeAllWithdrawToWithdraw(ArrayList<Withdraw> withdrawsToRemove) {
		this.withdraw.removeAll(withdrawsToRemove);
	}



}