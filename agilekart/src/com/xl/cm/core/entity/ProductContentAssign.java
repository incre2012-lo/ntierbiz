package com.xl.cm.core.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "productcontent")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProductContentAssign {

	@XmlAttribute (name = "productID")
	private String productID;
	
	@XmlAttribute (name = "contentID")
	private String contentID;

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getContentID() {
		return  contentID;
	}

	public void setContentID(String contentID) {
		this.contentID = contentID;
	}
	
	
}
