package com.xl.cm.core.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.beanutils.BeanPredicate;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.functors.EqualPredicate;

@XmlRootElement(name = "categories")
@XmlAccessorType(XmlAccessType.FIELD)
public class CategoryMgr {

	 @XmlElement(name = "category")
	 protected List<Category> categories;

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	 
	public void addCategory(Category category){
		this.categories.add(category);
	}
	 
	public Category createCategory(String id) {
		Category category=new Category();
		category.setCategoryID(id);
		return category;
	}
	
	public Category findCategory(String categoryID) {
		EqualPredicate nameEqlPredicate = new EqualPredicate(categoryID);
		BeanPredicate beanPredicate = new BeanPredicate("categoryID", nameEqlPredicate);
		return (Category)CollectionUtils.find(getCategories(), beanPredicate);
	}
	
	public boolean isCategory(String categoryID) {
		EqualPredicate nameEqlPredicate = new EqualPredicate(categoryID);
		BeanPredicate beanPredicate = new BeanPredicate("categoryID", nameEqlPredicate);
		return CollectionUtils.exists(getCategories(), beanPredicate);
	}
}
