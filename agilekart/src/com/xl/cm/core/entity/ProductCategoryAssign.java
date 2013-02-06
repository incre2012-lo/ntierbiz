package com.xl.cm.core.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "productcategory")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProductCategoryAssign {

	@XmlAttribute (name = "productID")
	private String productID;
	
	@XmlAttribute (name = "categoryID")
	private String categoryID;

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}
	
	
}
