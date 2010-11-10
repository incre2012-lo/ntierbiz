package org.ntierbiz.unit.category.model;

import java.util.Set;

import org.ntierbiz.core.orm.common.PersistentPO;

public class CategoryAttributePO extends PersistentPO implements CategoryAttribute{
	private String name;
	private String stringValue;
	private Integer intValue;	
	private String ObjectType;
	private Set<ProductCategory> categories;
	
	
	public Set<ProductCategory> getCategories() {
		return categories;
	}
	public void setCategories(Set<ProductCategory> categories) {
		this.categories = categories;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.category.model.CategoryAttribute#getName()
	 */
	@Override
	public String getName() {
		return name;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.category.model.CategoryAttribute#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.category.model.CategoryAttribute#getStringValue()
	 */
	@Override
	public String getStringValue() {
		return stringValue;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.category.model.CategoryAttribute#setStringValue(java.lang.String)
	 */
	@Override
	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.category.model.CategoryAttribute#getIntValue()
	 */
	@Override
	public Integer getIntValue() {
		return intValue;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.category.model.CategoryAttribute#setIntValue(java.lang.Integer)
	 */
	@Override
	public void setIntValue(Integer intValue) {
		this.intValue = intValue;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.category.model.CategoryAttribute#getObjectType()
	 */
	@Override
	public String getObjectType() {
		return ObjectType;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.category.model.CategoryAttribute#setObjectType(java.lang.String)
	 */
	@Override
	public void setObjectType(String objecttype) {
		ObjectType = objecttype;
	}

}
