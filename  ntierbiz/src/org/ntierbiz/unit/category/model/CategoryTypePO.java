package org.ntierbiz.unit.category.model;

import java.util.Set;

import org.ntierbiz.core.orm.common.PersistentPO;

public class CategoryTypePO  extends PersistentPO implements CategoryType{
	private String typeID;
	private Integer typeCode;
	private String description;
	private String categoryID;
	private Set<ProductCategory> productCategories;
	public Set<ProductCategory> getProductCategories() {
		return productCategories;
	}
	public void setProductCategories(Set<ProductCategory> productCategories) {
		this.productCategories = productCategories;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.category.model.CategoryType#getTypeID()
	 */
	@Override
	public String getTypeID() {
		return typeID;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.category.model.CategoryType#setTypeID(java.lang.String)
	 */
	@Override
	public void setTypeID(String typeID) {
		this.typeID = typeID;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.category.model.CategoryType#getTypeCode()
	 */
	@Override
	public Integer getTypeCode() {
		return typeCode;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.category.model.CategoryType#setTypeCode(java.lang.Integer)
	 */
	@Override
	public void setTypeCode(Integer typeCode) {
		this.typeCode = typeCode;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.category.model.CategoryType#getDescription()
	 */
	@Override
	public String getDescription() {
		return description;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.category.model.CategoryType#setDescription(java.lang.String)
	 */
	@Override
	public void setDescription(String description) {
		this.description = description;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.category.model.CategoryType#getCategoryID()
	 */
	@Override
	public String getCategoryID() {
		return categoryID;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.category.model.CategoryType#setCategoryID(java.lang.String)
	 */
	@Override
	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}
	
}
