/*******************************************************************************
 * File generated from the Normative Acts::barcelos2013normativeacts::model::normative_acts::normative_acts::ArticleComposedOfItem uml Class
 * Generated by the Acceleo 3 <i>UML to Java</i> generator.
 * Date: 19 October 2024 20:23:50 CEST
 *******************************************************************************/
package barcelos2013normativeacts.model.normative_acts.normative_acts;

import java.util.ArrayList;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of ArticleComposedOfItem.
 * 
 * @author 
 */
public class ArticleComposedOfItem extends ComposedArticle {
	/**
	 * Description of the property itemComponentOfArticle.
	 */
	public ArrayList<ItemComponentOfArticle> itemComponentOfArticle = new ArrayList<ItemComponentOfArticle>();
	
	// Start of user code (user defined attributes for ArticleComposedOfItem)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public ArticleComposedOfItem() {
		// Start of user code constructor for ArticleComposedOfItem)
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for ArticleComposedOfItem)
	
	// End of user code
	
	
	/**
	 * Returns itemComponentOfArticle.
	 * @return itemComponentOfArticle 
	 */
	public ArrayList<ItemComponentOfArticle> getItemComponentOfArticle() {
		return this.itemComponentOfArticle;
	}
	
	/**
	 * Sets a value to attribute itemComponentOfArticle. 
	 * @param newItemComponentOfArticle 
	 */
	public void setItemComponentOfArticle(ArrayList<ItemComponentOfArticle> newItemComponentOfArticle) {
	    this.itemComponentOfArticle = newItemComponentOfArticle;
	}
	
	/**
	 * Adds one attribute (if itemComponentOfArticle had a multiple cardinality)
	 * @param itemComponentOfArticleToAdd in itemComponentOfArticle
	 */
	public void addItemComponentOfArticleToItemComponentOfArticle(ItemComponentOfArticle itemComponentOfArticleToAdd) {
		this.itemComponentOfArticle.add(itemComponentOfArticleToAdd);
	}
	
	/**
	 * Removes an attribute (if itemComponentOfArticle had a multiple cardinality)
	 * @param itemComponentOfArticleToRemove in itemComponentOfArticle
	 */
	public void removeItemComponentOfArticleToItemComponentOfArticle(ItemComponentOfArticle itemComponentOfArticleToRemove) {
		this.itemComponentOfArticle.remove(itemComponentOfArticleToRemove);
	}
	
	/**
	 * Adds all the attribute (if itemComponentOfArticle had a multiple cardinality)
	 * @param itemComponentOfArticlesToAdd in itemComponentOfArticle
	 */
	public void addAllItemComponentOfArticleToItemComponentOfArticle(ArrayList<ItemComponentOfArticle> itemComponentOfArticlesToAdd) {
		this.itemComponentOfArticle.addAll(itemComponentOfArticlesToAdd);
	}
	
	/**
	 * Removes all the attribute (if itemComponentOfArticle had a multiple cardinality)
	 * @param itemComponentOfArticlesToRemove in itemComponentOfArticle
	 */
	public void removeAllItemComponentOfArticleToItemComponentOfArticle(ArrayList<ItemComponentOfArticle> itemComponentOfArticlesToRemove) {
		this.itemComponentOfArticle.removeAll(itemComponentOfArticlesToRemove);
	}



}