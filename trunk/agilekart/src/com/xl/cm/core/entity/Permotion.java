package com.xl.cm.core.entity;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "permotion")
@XmlAccessorType(XmlAccessType.FIELD)
public class Permotion {

	@XmlAttribute (name = "permotionID")
	private String permotionID;
	
	public String getPermotionID() {
		return permotionID;
	}

	public void setPermotionID(String permotionID) {
		this.permotionID = permotionID;
	}
	
}
