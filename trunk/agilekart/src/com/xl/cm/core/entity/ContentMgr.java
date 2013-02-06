package com.xl.cm.core.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.beanutils.BeanPredicate;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.functors.EqualPredicate;

@XmlRootElement(name = "contents")
@XmlAccessorType(XmlAccessType.FIELD)
public class ContentMgr {

	 @XmlElement(name = "content")
	 protected List<Content> contents;

	public List<Content> getContents() {
		return contents;
	}

	public void setContents(List<Content> contents) {
		this.contents = contents;
	}
	 
	public void addContent(Content content){
		this.contents.add(content);
	}
	 
	public Content createContent(String id) {
		Content content=new Content();
		content.setContentID(id);
		return content;
	}
	
	public Content findContent(String contentID) {
		EqualPredicate nameEqlPredicate = new EqualPredicate(contentID);
		BeanPredicate beanPredicate = new BeanPredicate("contentID", nameEqlPredicate);
		return (Content)CollectionUtils.find(getContents(), beanPredicate);
	}
	
	public boolean isContent(String contentID) {
		EqualPredicate nameEqlPredicate = new EqualPredicate(contentID);
		BeanPredicate beanPredicate = new BeanPredicate("contentID", nameEqlPredicate);
		return CollectionUtils.exists(getContents(), beanPredicate);
	}
}
