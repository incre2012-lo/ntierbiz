package com.xl.cm.core.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "productattribute")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProductAttributeAssign {

	@XmlAttribute (name = "productID")
	private String productID;
	
	@XmlAttribute (name = "attributeID")
	private String attributeID;
	
	@XmlElement (name = "displayName")
	private String displayName;
	
	@XmlElement (name = "value")
	private String value;

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getAttributeID() {
		return  attributeID;
	}

	public void setAttributeID(String attributeID) {
		this.attributeID = attributeID;
	}

	public String getDisplayName() {
	    return displayName;
	}

	public void setDisplayName(String displayName) {
	    this.displayName = displayName;
	}

	public String getValue() {
	    return value;
	}

	public void setValue(String value) {
	    this.value = value;
	}
	
	
}
