package com.xl.cm.core.entity;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

	public ObjectFactory() {
    }
	
	public ProductMgr createProducts() {
        return new ProductMgr();
    }
	
	 public Product createProduct() {
	        return new Product();
	    }
	 
	 public CategoryMgr createCategories(){
		 return new CategoryMgr();
	 }
	
	 public Category createCategory(){
		 return new Category();
	 }
	 
	 public LabelMgr createLabels(){
		 return new LabelMgr();
	 }
	 
	 public Label createLabel(){
		 return new Label();
	 }
	 
	 public ContentMgr createContents(){
		 return new ContentMgr();
	 }
	 
	 public Content createContent(){
		 return new Content();
	 }
	 
	 public RelationMgr createRelations(){
		 return new RelationMgr();
	 }
	 
	 public ProductCategoryAssign createProductcategory(){
		 return new ProductCategoryAssign();
	 }
	 
	 public AttributeMgr createAttributes(){
		 return new AttributeMgr();
	 }
	 
	 public Attribute createAttribute(){
		 return new Attribute();
	 }
}
