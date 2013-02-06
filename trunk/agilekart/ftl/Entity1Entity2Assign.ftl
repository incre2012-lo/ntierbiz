package com.xl.cm.core.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "${Entity1}${Entity2}")
@XmlAccessorType(XmlAccessType.FIELD)
public class ${BigEntity1}${BigEntity2}Assign {

	@XmlAttribute (name = "${Entity1}ID")
	private String ${Entity1}ID;
	
	@XmlAttribute (name = "${Entity2}ID")
	private String ${Entity2}ID;

	public String get${BigEntity1}ID() {
		return ${Entity1}ID;
	}

	public void set${BigEntity1}ID(String ${Entity1}ID) {
		this.${Entity1}ID = ${Entity1}ID;
	}

	public String get${BigEntity2}ID() {
		return  ${Entity2}ID;
	}

	public void set${BigEntity2}ID(String ${Entity2}ID) {
		this.${Entity2}ID = ${Entity2}ID;
	}
	
	
}
