package org.ntierbiz.unit.category.model;

import java.util.Set;

import org.ntierbiz.core.orm.common.Persistent;

public interface CategoryAttribute extends Persistent{

	public abstract String getName();

	public abstract void setName(String name);

	public abstract String getStringValue();

	public abstract void setStringValue(String stringValue);

	public abstract Integer getIntValue();

	public abstract void setIntValue(Integer intValue);

	public abstract String getObjectType();

	public abstract void setObjectType(String objecttype);
	
	public Set<ProductCategory> getCategories();
	
	public void setCategories(Set<ProductCategory> categories);
}