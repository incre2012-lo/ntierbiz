package com.xl.cm.core.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.beanutils.BeanPredicate;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.functors.EqualPredicate;

@XmlRootElement(name = "labels")
@XmlAccessorType(XmlAccessType.FIELD)
public class LabelMgr {

	 @XmlElement(name = "label")
	 protected List<Label> labels;

	public List<Label> getLabels() {
		return labels;
	}

	public void setLabels(List<Label> labels) {
		this.labels = labels;
	}
	 
	public void addLabel(Label label){
		this.labels.add(label);
	}
	 
	public Label createLabel(String id) {
		Label label=new Label();
		label.setLabelID(id);
		return label;
	}
	
	public Label findLabel(String labelID) {
		EqualPredicate nameEqlPredicate = new EqualPredicate(labelID);
		BeanPredicate beanPredicate = new BeanPredicate("labelID", nameEqlPredicate);
		return (Label)CollectionUtils.find(getLabels(), beanPredicate);
	}
	
	public boolean isLabel(String labelID) {
		EqualPredicate nameEqlPredicate = new EqualPredicate(labelID);
		BeanPredicate beanPredicate = new BeanPredicate("labelID", nameEqlPredicate);
		return CollectionUtils.exists(getLabels(), beanPredicate);
	}
}
