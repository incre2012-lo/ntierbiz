package org.ntierbiz.unit.category.model;

import java.util.Set;

import org.ntierbiz.unit.party.model.Party;
import org.ntierbiz.unit.product.model.Product;

public interface ProductCategory {

	public abstract Set<CategoryAttribute> getCategoryAttributes();

	public abstract void setCategoryAttributes(
			Set<CategoryAttribute> categoryAttributes);

	public abstract Set<CategoryAttribute> getSharedCategoryAttributes();

	public abstract void setSharedCategoryAttributes(
			Set<CategoryAttribute> sharedCategoryAttributes);

	public abstract Set<Party> getParties();

	public abstract void setParties(Set<Party> parties);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ntierbiz.unit.category.model.ProductCategory#getName()
	 */
	public abstract String getName();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ntierbiz.unit.category.model.ProductCategory#setName(java.lang.String
	 * )
	 */
	public abstract void setName(String name);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ntierbiz.unit.category.model.ProductCategory#getCategoryType()
	 */
	public abstract CategoryType getCategoryType();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ntierbiz.unit.category.model.ProductCategory#setCategoryType(org.
	 * ntierbiz.unit.category.model.CategoryType)
	 */
	public abstract void setCategoryType(CategoryType categoryType);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ntierbiz.unit.category.model.ProductCategory#getLevels()
	 */
	public abstract int getLevels();

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ntierbiz.unit.category.model.ProductCategory#setLevels(int)
	 */
	public abstract void setLevels(int levels);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ntierbiz.unit.category.model.ProductCategory#getGroupIDHierarchyFlag
	 * ()
	 */
	public abstract int getGroupIDHierarchyFlag();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ntierbiz.unit.category.model.ProductCategory#setGroupIDHierarchyFlag
	 * (int)
	 */
	public abstract void setGroupIDHierarchyFlag(int groupIDHierarchyFlag);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ntierbiz.unit.category.model.ProductCategory#getMultipleAssignmentsFlag
	 * ()
	 */
	public abstract int getMultipleAssignmentsFlag();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ntierbiz.unit.category.model.ProductCategory#setMultipleAssignmentsFlag
	 * (int)
	 */
	public abstract void setMultipleAssignmentsFlag(int multipleAssignmentsFlag);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ntierbiz.unit.category.model.ProductCategory#getLeafAssignmentsFlag()
	 */
	public abstract int getLeafAssignmentsFlag();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ntierbiz.unit.category.model.ProductCategory#setLeafAssignmentsFlag
	 * (int)
	 */
	public abstract void setLeafAssignmentsFlag(int leafAssignmentsFlag);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ntierbiz.unit.category.model.ProductCategory#getInheritanceEnabledFlag
	 * ()
	 */
	public abstract int getInheritanceEnabledFlag();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ntierbiz.unit.category.model.ProductCategory#setInheritanceEnabledFlag
	 * (int)
	 */
	public abstract void setInheritanceEnabledFlag(int inheritanceEnabledFlag);

	public abstract Set<ProductCategory> getLevelNamePOs();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ntierbiz.unit.category.model.ProductCategory#setLevelNamePOs(java
	 * .util.Set)
	 */
	public abstract void setLevelNamePOs(Set<ProductCategory> levelNamePOs);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ntierbiz.unit.category.model.ProductCategory#getCategoryContent()
	 */
	public abstract CategoryContent getCategoryContent();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ntierbiz.unit.category.model.ProductCategory#setCategoryContent(org
	 * .ntierbiz.unit.category.model.CategoryContent)
	 */
	public abstract void setCategoryContent(CategoryContent categoryContent);

	public abstract Set<Product> getProducts();

	public abstract void setProducts(Set<Product> products);

}