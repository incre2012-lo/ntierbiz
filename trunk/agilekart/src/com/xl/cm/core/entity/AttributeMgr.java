package com.xl.cm.core.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.beanutils.BeanPredicate;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.functors.EqualPredicate;

@XmlRootElement(name = "attributes")
@XmlAccessorType(XmlAccessType.FIELD)
public class AttributeMgr {

	 @XmlElement(name = "attribute")
	 protected List<Attribute> attributes;

	public List<Attribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}
	 
	public void addAttribute(Attribute attribute){
		this.attributes.add(attribute);
	}
	 
	public Attribute createAttribute(String id) {
		Attribute attribute=new Attribute();
		attribute.setAttributeID(id);
		return attribute;
	}
	
	public Attribute findAttribute(String attributeID) {
		EqualPredicate nameEqlPredicate = new EqualPredicate(attributeID);
		BeanPredicate beanPredicate = new BeanPredicate("attributeID", nameEqlPredicate);
		return (Attribute)CollectionUtils.find(getAttributes(), beanPredicate);
	}
	
	public boolean isAttribute(String attributeID) {
		EqualPredicate nameEqlPredicate = new EqualPredicate(attributeID);
		BeanPredicate beanPredicate = new BeanPredicate("attributeID", nameEqlPredicate);
		return CollectionUtils.exists(getAttributes(), beanPredicate);
	}
}
