package com.xl.cm.core.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "productlabel")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProductLabelAssign {

	@XmlAttribute (name = "productID")
	private String productID;
	
	@XmlAttribute (name = "labelID")
	private String labelID;

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getLabelID() {
		return  labelID;
	}

	public void setLabelID(String labelID) {
		this.labelID = labelID;
	}
	
	
}
