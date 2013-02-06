package com.xl.cm.core.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "productpermotion")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProductPermotionAssign {

	@XmlAttribute (name = "productID")
	private String productID;
	
	@XmlAttribute (name = "permotionID")
	private String permotionID;

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getPermotionID() {
		return  permotionID;
	}

	public void setPermotionID(String permotionID) {
		this.permotionID = permotionID;
	}
	
	
}
