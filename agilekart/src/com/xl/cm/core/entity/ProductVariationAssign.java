package com.xl.cm.core.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "productvariation")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProductVariationAssign {

	@XmlAttribute (name = "productID")
	private String productID;
	
	@XmlAttribute (name = "variationID")
	private String variationID;

	@XmlAttribute (name = "variationAttribute")
	private String variationAttribute;
	
	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getVariationID() {
		return  variationID;
	}

	public void setVariationID(String variationID) {
		this.variationID = variationID;
	}

	public String getVariationAttribute() {
	    return variationAttribute;
	}

	public void setVariationAttribute(String variationAttribute) {
	    this.variationAttribute = variationAttribute;
	}
	
	
}
