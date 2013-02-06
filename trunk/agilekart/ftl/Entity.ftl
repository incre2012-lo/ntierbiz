package com.xl.cm.core.entity;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "${Entity}")
@XmlAccessorType(XmlAccessType.FIELD)
public class ${BigEntity} {

	@XmlAttribute (name = "${Entity}ID")
	private String ${Entity}ID;
	
	public String get${BigEntity}ID() {
		return ${Entity}ID;
	}

	public void set${BigEntity}ID(String ${Entity}ID) {
		this.${Entity}ID = ${Entity}ID;
	}
	
}
