/*******************************************************************************
 * File generated from the LucasBassetti_CaixaBanco::bankaccount2013::model::lucasbassetti_caixabanco::caixa_banco::Pessoa uml Class
 * Generated by the Acceleo 3 <i>UML to Java</i> generator.
 * Date: 19 October 2024 20:23:12 CEST
 *******************************************************************************/
package bankaccount2013.model.lucasbassetti_caixabanco.caixa_banco;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Pessoa.
 * 
 * @author 
 */
public class Pessoa {
	/**
	 * Description of the property pessoaComContaRole.
	 */
	public PessoaComConta pessoaComContaRole = null;
	
	/**
	 * Description of the property clienteRole.
	 */
	public Cliente clienteRole = null;
	
	// Start of user code (user defined attributes for Pessoa)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public Pessoa() {
		// Start of user code constructor for Pessoa)
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for Pessoa)
	
	// End of user code
	
	
	/**
	 * Returns pessoaComContaRole.
	 * @return pessoaComContaRole 
	 */
	public PessoaComConta getPessoaComContaRole() {
		return this.pessoaComContaRole;
	}
	
	/**
	 * Sets a value to attribute pessoaComContaRole. 
	 * @param newPessoaComContaRole 
	 */
	public void setPessoaComContaRole(PessoaComConta newPessoaComContaRole) {
		this.pessoaComContaRole = newPessoaComContaRole;
	}

	/**
	 * Returns clienteRole.
	 * @return clienteRole 
	 */
	public Cliente getClienteRole() {
		return this.clienteRole;
	}
	
	/**
	 * Sets a value to attribute clienteRole. 
	 * @param newClienteRole 
	 */
	public void setClienteRole(Cliente newClienteRole) {
		this.clienteRole = newClienteRole;
	}



}
