package com.xl.cm.core.entity;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "category")
@XmlAccessorType(XmlAccessType.FIELD)
public class Category {

	@XmlAttribute (name = "categoryID")
	private String categoryID;
	
	@XmlAttribute (name = "parentCategoryID")	
	private String parentCategoryID;
	
	@XmlAttribute (name = "categoryStatus")	
	private boolean categoryStatus;
	
		
	@XmlAttribute (name = "categorySortOrder")
	private int categorySortOrder;

	@XmlElement (name = "categoryImage")
	private String categoryImage;
	
	@XmlElement (name = "categoryImage1")
	private String categoryImage1;
	
	@XmlElement (name = "categoryImage2")
	private String categoryImage2;
	
	@XmlElement (name = "categoryImage3")
	private String categoryImage3;
	
	@XmlElement (name = "categoryImage4")
	private String categoryImage4;	
	
	@XmlElement(name = "desc")
	private String desc;
	
	@XmlElement(name = "shortDesc")
	private String shortDesc;
	
	@XmlElement(name = "title")
	private String title;
	
	@XmlElement(name = "categoryUrl")
	private String productUrl;
	
	@XmlElement(name = "categoryHighlight")
	private String productHighlight;
	
	@XmlElement(name = "seUrlSrc")
	private String seUrlSrc;
	
	@XmlElement(name = "seUrl")
	private String seUrl;

	@XmlElement(name = "metatagTitle")
	private String metatagTitle;
	
	@XmlElement(name = "metatagKeywords")
	private String metatagKeywords;
	
	@XmlElement(name = "metatagDescription")
	private String metatagDescription;

	public String getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}

	public String getParentCategoryID() {
		return parentCategoryID;
	}

	public void setParentCategoryID(String parentCategoryID) {
		this.parentCategoryID = parentCategoryID;
	}

	public boolean isCategoryStatus() {
		return categoryStatus;
	}

	public void setCategoryStatus(boolean categoryStatus) {
		this.categoryStatus = categoryStatus;
	}

	public int getCategorySortOrder() {
		return categorySortOrder;
	}

	public void setCategorySortOrder(int categorySortOrder) {
		this.categorySortOrder = categorySortOrder;
	}

	public String getCategoryImage() {
		return categoryImage;
	}

	public void setCategoryImage(String categoryImage) {
		this.categoryImage = categoryImage;
	}

	public String getCategoryImage1() {
		return categoryImage1;
	}

	public void setCategoryImage1(String categoryImage1) {
		this.categoryImage1 = categoryImage1;
	}

	public String getCategoryImage2() {
		return categoryImage2;
	}

	public void setCategoryImage2(String categoryImage2) {
		this.categoryImage2 = categoryImage2;
	}

	public String getCategoryImage3() {
		return categoryImage3;
	}

	public void setCategoryImage3(String categoryImage3) {
		this.categoryImage3 = categoryImage3;
	}

	public String getCategoryImage4() {
		return categoryImage4;
	}

	public void setCategoryImage4(String categoryImage4) {
		this.categoryImage4 = categoryImage4;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getShortDesc() {
		return shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getProductUrl() {
		return productUrl;
	}

	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}

	public String getProductHighlight() {
		return productHighlight;
	}

	public void setProductHighlight(String productHighlight) {
		this.productHighlight = productHighlight;
	}

	public String getSeUrlSrc() {
		return seUrlSrc;
	}

	public void setSeUrlSrc(String seUrlSrc) {
		this.seUrlSrc = seUrlSrc;
	}

	public String getSeUrl() {
		return seUrl;
	}

	public void setSeUrl(String seUrl) {
		this.seUrl = seUrl;
	}

	public String getMetatagTitle() {
		return metatagTitle;
	}

	public void setMetatagTitle(String metatagTitle) {
		this.metatagTitle = metatagTitle;
	}

	public String getMetatagKeywords() {
		return metatagKeywords;
	}

	public void setMetatagKeywords(String metatagKeywords) {
		this.metatagKeywords = metatagKeywords;
	}

	public String getMetatagDescription() {
		return metatagDescription;
	}

	public void setMetatagDescription(String metatagDescription) {
		this.metatagDescription = metatagDescription;
	}
	
}
