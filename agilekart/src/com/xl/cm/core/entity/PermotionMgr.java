package com.xl.cm.core.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.beanutils.BeanPredicate;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.functors.EqualPredicate;

@XmlRootElement(name = "permotions")
@XmlAccessorType(XmlAccessType.FIELD)
public class PermotionMgr {

	 @XmlElement(name = "permotion")
	 protected List<Permotion> permotions;

	public List<Permotion> getPermotions() {
		return permotions;
	}

	public void setPermotions(List<Permotion> permotions) {
		this.permotions = permotions;
	}
	 
	public void addPermotion(Permotion permotion){
		this.permotions.add(permotion);
	}
	 
	public Permotion createPermotion(String id) {
		Permotion permotion=new Permotion();
		permotion.setPermotionID(id);
		return permotion;
	}
	
	public Permotion findPermotion(String permotionID) {
		EqualPredicate nameEqlPredicate = new EqualPredicate(permotionID);
		BeanPredicate beanPredicate = new BeanPredicate("permotionID", nameEqlPredicate);
		return (Permotion)CollectionUtils.find(getPermotions(), beanPredicate);
	}
	
	public boolean isPermotion(String permotionID) {
		EqualPredicate nameEqlPredicate = new EqualPredicate(permotionID);
		BeanPredicate beanPredicate = new BeanPredicate("permotionID", nameEqlPredicate);
		return CollectionUtils.exists(getPermotions(), beanPredicate);
	}
}
