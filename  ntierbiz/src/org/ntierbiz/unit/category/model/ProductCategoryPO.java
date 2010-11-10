package org.ntierbiz.unit.category.model;

import java.util.Set;

import org.ntierbiz.core.orm.common.PersistentPO;
import org.ntierbiz.unit.party.model.Party;
import org.ntierbiz.unit.product.model.Product;

public class ProductCategoryPO extends PersistentPO implements ProductCategory {
	private String name;
	private CategoryType categoryType;
	private int levels;
	private int groupIDHierarchyFlag;
	private int multipleAssignmentsFlag;
	private int leafAssignmentsFlag;
	private int inheritanceEnabledFlag;
	private Set<ProductCategory> levelNamePOs;
	private CategoryContent categoryContent;
	private Set<CategoryAttribute> categoryAttributes;
	private Set<CategoryAttribute> sharedCategoryAttributes;
	private Set<Product> products;
	private Set<Party> parties;

	public Set<CategoryAttribute> getCategoryAttributes() {
		return categoryAttributes;
	}

	public void setCategoryAttributes(Set<CategoryAttribute> categoryAttributes) {
		this.categoryAttributes = categoryAttributes;
	}

	public Set<CategoryAttribute> getSharedCategoryAttributes() {
		return sharedCategoryAttributes;
	}

	public void setSharedCategoryAttributes(
			Set<CategoryAttribute> sharedCategoryAttributes) {
		this.sharedCategoryAttributes = sharedCategoryAttributes;
	}

	public Set<Party> getParties() {
		return parties;
	}

	public void setParties(Set<Party> parties) {
		this.parties = parties;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ntierbiz.unit.category.model.ProductCategory#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ntierbiz.unit.category.model.ProductCategory#setName(java.lang.String
	 * )
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ntierbiz.unit.category.model.ProductCategory#getCategoryType()
	 */
	@Override
	public CategoryType getCategoryType() {
		return categoryType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ntierbiz.unit.category.model.ProductCategory#setCategoryType(org.
	 * ntierbiz.unit.category.model.CategoryType)
	 */
	@Override
	public void setCategoryType(CategoryType categoryType) {
		this.categoryType = categoryType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ntierbiz.unit.category.model.ProductCategory#getLevels()
	 */
	@Override
	public int getLevels() {
		return levels;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ntierbiz.unit.category.model.ProductCategory#setLevels(int)
	 */
	@Override
	public void setLevels(int levels) {
		this.levels = levels;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ntierbiz.unit.category.model.ProductCategory#getGroupIDHierarchyFlag
	 * ()
	 */
	@Override
	public int getGroupIDHierarchyFlag() {
		return groupIDHierarchyFlag;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ntierbiz.unit.category.model.ProductCategory#setGroupIDHierarchyFlag
	 * (int)
	 */
	@Override
	public void setGroupIDHierarchyFlag(int groupIDHierarchyFlag) {
		this.groupIDHierarchyFlag = groupIDHierarchyFlag;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ntierbiz.unit.category.model.ProductCategory#getMultipleAssignmentsFlag
	 * ()
	 */
	@Override
	public int getMultipleAssignmentsFlag() {
		return multipleAssignmentsFlag;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ntierbiz.unit.category.model.ProductCategory#setMultipleAssignmentsFlag
	 * (int)
	 */
	@Override
	public void setMultipleAssignmentsFlag(int multipleAssignmentsFlag) {
		this.multipleAssignmentsFlag = multipleAssignmentsFlag;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ntierbiz.unit.category.model.ProductCategory#getLeafAssignmentsFlag()
	 */
	@Override
	public int getLeafAssignmentsFlag() {
		return leafAssignmentsFlag;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ntierbiz.unit.category.model.ProductCategory#setLeafAssignmentsFlag
	 * (int)
	 */
	@Override
	public void setLeafAssignmentsFlag(int leafAssignmentsFlag) {
		this.leafAssignmentsFlag = leafAssignmentsFlag;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ntierbiz.unit.category.model.ProductCategory#getInheritanceEnabledFlag
	 * ()
	 */
	@Override
	public int getInheritanceEnabledFlag() {
		return inheritanceEnabledFlag;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ntierbiz.unit.category.model.ProductCategory#setInheritanceEnabledFlag
	 * (int)
	 */
	@Override
	public void setInheritanceEnabledFlag(int inheritanceEnabledFlag) {
		this.inheritanceEnabledFlag = inheritanceEnabledFlag;
	}

	@Override
	public Set<ProductCategory> getLevelNamePOs() {
		return levelNamePOs;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ntierbiz.unit.category.model.ProductCategory#setLevelNamePOs(java
	 * .util.Set)
	 */
	@Override
	public void setLevelNamePOs(Set<ProductCategory> levelNamePOs) {
		this.levelNamePOs = levelNamePOs;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ntierbiz.unit.category.model.ProductCategory#getCategoryContent()
	 */
	@Override
	public CategoryContent getCategoryContent() {
		return categoryContent;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ntierbiz.unit.category.model.ProductCategory#setCategoryContent(org
	 * .ntierbiz.unit.category.model.CategoryContent)
	 */
	@Override
	public void setCategoryContent(CategoryContent categoryContent) {
		this.categoryContent = categoryContent;
	}

	@Override
	public Set<Product> getProducts() {
		return products;
	}

	@Override
	public void setProducts(Set<Product> products) {
		this.products = products;
	}

}
