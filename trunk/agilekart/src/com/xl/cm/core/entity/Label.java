package com.xl.cm.core.entity;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "label")
@XmlAccessorType(XmlAccessType.FIELD)
public class Label {

	@XmlAttribute (name = "labelID")
	private String labelID;
	
	@XmlAttribute (name = "title")
	private String title;
	
	@XmlAttribute (name = "type")
	private String type;
	
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLabelID() {
		return labelID;
	}

	public void setLabelID(String labelID) {
		this.labelID = labelID;
	}
	
}
