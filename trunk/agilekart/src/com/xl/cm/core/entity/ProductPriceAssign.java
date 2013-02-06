package com.xl.cm.core.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "productprice")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProductPriceAssign {

	@XmlAttribute (name = "productID")
	private String productID;
	
	@XmlAttribute (name = "priceID")
	private String priceID;

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getPriceID() {
		return  priceID;
	}

	public void setPriceID(String priceID) {
		this.priceID = priceID;
	}
	
	
}
