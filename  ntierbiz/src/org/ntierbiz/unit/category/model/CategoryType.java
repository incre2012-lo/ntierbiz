package org.ntierbiz.unit.category.model;

import java.util.Set;

import org.ntierbiz.core.orm.common.Persistent;

public interface CategoryType extends Persistent{

	public abstract String getTypeID();

	public abstract void setTypeID(String typeID);

	public abstract Integer getTypeCode();

	public abstract void setTypeCode(Integer typeCode);

	public abstract String getDescription();

	public abstract void setDescription(String description);

	public abstract String getCategoryID();

	public abstract void setCategoryID(String categoryID);
	
	public Set<ProductCategory> getProductCategories();
	
	public void setProductCategories(Set<ProductCategory> productCategories);

}