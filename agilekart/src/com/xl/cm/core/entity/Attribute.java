package com.xl.cm.core.entity;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "attribute")
@XmlAccessorType(XmlAccessType.FIELD)
public class Attribute {

	@XmlAttribute (name = "attributeID")
	private String attributeID;
	
	@XmlElement (name = "displayName")
	private String attrName;
	
	@XmlElement (name = "defaultValue")
	private String attrValue;
	
	public String getAttributeID() {
		return attributeID;
	}

	public void setAttributeID(String attributeID) {
		this.attributeID = attributeID;
	}

	public String getAttrName() {
	    return attrName;
	}

	public void setAttrName(String attrName) {
	    this.attrName = attrName;
	}

	public String getAttrValue() {
	    return attrValue;
	}

	public void setAttrValue(String attrValue) {
	    this.attrValue = attrValue;
	}
	
	
}
