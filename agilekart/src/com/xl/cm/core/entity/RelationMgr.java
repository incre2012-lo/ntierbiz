package com.xl.cm.core.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.beanutils.BeanPredicate;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.PredicateUtils;
import org.apache.commons.collections.functors.EqualPredicate;

@XmlRootElement(name = "relations")
@XmlAccessorType(XmlAccessType.FIELD)
public class RelationMgr {
	
	 @XmlElement(name = "productcategory")
	 protected List<ProductCategoryAssign> productCategoriesAssign;
	 
	
	  
	 
	public List<ProductCategoryAssign> getProductCategoriesAssign() {
		return productCategoriesAssign;
	}

	public void setProductCategoriesAssign(
			List<ProductCategoryAssign> productCategoriesAssign) {
		this.productCategoriesAssign = productCategoriesAssign;
	}
	 
	 
	public void addProductCategoryAssign(ProductCategoryAssign productcategory) {
		this.productCategoriesAssign.add(productcategory);
	}

	public ProductCategoryAssign createProductCategoryAssign(String productid,String categoryid){	
		ProductCategoryAssign productcategory=new ProductCategoryAssign();
		productcategory.setProductID(productid);
		productcategory.setCategoryID(categoryid);
		return productcategory;
	}
	
	public void assignProductCategory(String productid,String categoryid){	
		ProductCategoryAssign productcategory =createProductCategoryAssign(productid,categoryid);
		getProductCategoriesAssign().add(productcategory);		
	}
	
	public boolean isProductCategoryAssign(String productid,String categoryid) {
		EqualPredicate prdEqlPredicate = new EqualPredicate(productid);
		EqualPredicate catEqlPredicate = new EqualPredicate(categoryid);
		BeanPredicate prdbeanPredicate = new BeanPredicate("productID", prdEqlPredicate);
		BeanPredicate catbeanPredicate = new BeanPredicate("categoryID", catEqlPredicate);
		return CollectionUtils.exists(getProductCategoriesAssign(),PredicateUtils.andPredicate(prdbeanPredicate, catbeanPredicate));
	}
	
	public ProductCategoryAssign findProductCategoryAssign(String productid,String categoryid) {
		EqualPredicate prdEqlPredicate = new EqualPredicate(productid);
		EqualPredicate catEqlPredicate = new EqualPredicate(categoryid);
		BeanPredicate prdbeanPredicate = new BeanPredicate("productID", prdEqlPredicate);
		BeanPredicate catbeanPredicate = new BeanPredicate("categoryID", catEqlPredicate);
		return (ProductCategoryAssign) CollectionUtils.find(getProductCategoriesAssign(),PredicateUtils.andPredicate(prdbeanPredicate, catbeanPredicate));
	}

	@XmlElement(name = "productcontent")
	protected List<ProductContentAssign> productContentsAssign;
	
	public List<ProductContentAssign> getProductContentsAssign() {
		return productContentsAssign;
	}

	public void setProductContentsAssign(
			List<ProductContentAssign> productContentsAssign) {
		this.productContentsAssign = productContentsAssign;
	}
	
	public void addProductContentAssign(ProductContentAssign productcontent) {
		this.productContentsAssign.add(productcontent);
	}

	public ProductContentAssign createProductContentAssign(String productid,String contentid){	
		ProductContentAssign productcontent=new ProductContentAssign();
		productcontent.setProductID(productid);
		productcontent.setContentID(contentid);
		return productcontent;
	}
	
	public void assignProductContent(String productid,String contentid){	
		ProductContentAssign productcontent =createProductContentAssign(productid,contentid);
		getProductContentsAssign().add(productcontent);		
	}
	
	public boolean isProductContentAssign(String productid,String contentid) {
		EqualPredicate prdEqlPredicate = new EqualPredicate(productid);
		EqualPredicate catEqlPredicate = new EqualPredicate(contentid);
		BeanPredicate prdbeanPredicate = new BeanPredicate("productID", prdEqlPredicate);
		BeanPredicate catbeanPredicate = new BeanPredicate("contentID", catEqlPredicate);
		return CollectionUtils.exists(getProductContentsAssign(),PredicateUtils.andPredicate(prdbeanPredicate, catbeanPredicate));
	}
	
	public ProductContentAssign findProductContentAssign(String productid,String contentid) {
		EqualPredicate prdEqlPredicate = new EqualPredicate(productid);
		EqualPredicate catEqlPredicate = new EqualPredicate(contentid);
		BeanPredicate prdbeanPredicate = new BeanPredicate("productID", prdEqlPredicate);
		BeanPredicate catbeanPredicate = new BeanPredicate("contentID", catEqlPredicate);
		return (ProductContentAssign) CollectionUtils.find(getProductContentsAssign(),PredicateUtils.andPredicate(prdbeanPredicate, catbeanPredicate));
	}
	
	@XmlElement(name = "productprice")
	protected List<ProductPriceAssign> productPricesAssign;
	
	public List<ProductPriceAssign> getProductPricesAssign() {
		return productPricesAssign;
	}

	public void setProductPricesAssign(
			List<ProductPriceAssign> productPricesAssign) {
		this.productPricesAssign = productPricesAssign;
	}
	
	public void addProductPriceAssign(ProductPriceAssign productprice) {
		this.productPricesAssign.add(productprice);
	}

	public ProductPriceAssign createProductPriceAssign(String productid,String priceid){	
		ProductPriceAssign productprice=new ProductPriceAssign();
		productprice.setProductID(productid);
		productprice.setPriceID(priceid);
		return productprice;
	}
	
	public void assignProductPrice(String productid,String priceid){	
		ProductPriceAssign productprice =createProductPriceAssign(productid,priceid);
		getProductPricesAssign().add(productprice);		
	}
	
	public boolean isProductPriceAssign(String productid,String priceid) {
		EqualPredicate prdEqlPredicate = new EqualPredicate(productid);
		EqualPredicate catEqlPredicate = new EqualPredicate(priceid);
		BeanPredicate prdbeanPredicate = new BeanPredicate("productID", prdEqlPredicate);
		BeanPredicate catbeanPredicate = new BeanPredicate("priceID", catEqlPredicate);
		return CollectionUtils.exists(getProductPricesAssign(),PredicateUtils.andPredicate(prdbeanPredicate, catbeanPredicate));
	}
	
	public ProductPriceAssign findProductPriceAssign(String productid,String priceid) {
		EqualPredicate prdEqlPredicate = new EqualPredicate(productid);
		EqualPredicate catEqlPredicate = new EqualPredicate(priceid);
		BeanPredicate prdbeanPredicate = new BeanPredicate("productID", prdEqlPredicate);
		BeanPredicate catbeanPredicate = new BeanPredicate("priceID", catEqlPredicate);
		return (ProductPriceAssign) CollectionUtils.find(getProductPricesAssign(),PredicateUtils.andPredicate(prdbeanPredicate, catbeanPredicate));
	}

	@XmlElement(name = "productattribute")
	protected List<ProductAttributeAssign> productAttributesAssign;
	
	public List<ProductAttributeAssign> getProductAttributesAssign() {
		return productAttributesAssign;
	}

	public void setProductAttributesAssign(
			List<ProductAttributeAssign> productAttributesAssign) {
		this.productAttributesAssign = productAttributesAssign;
	}
	
	public void addProductAttributeAssign(ProductAttributeAssign productattribute) {
		this.productAttributesAssign.add(productattribute);
	}

	public ProductAttributeAssign createProductAttributeAssign(String productid,String attributeid){	
		ProductAttributeAssign productattribute=new ProductAttributeAssign();
		productattribute.setProductID(productid);
		productattribute.setAttributeID(attributeid);
		return productattribute;
	}
	
	public void assignProductAttribute(String productid,String attributeid){	
		ProductAttributeAssign productattribute =createProductAttributeAssign(productid,attributeid);
		getProductAttributesAssign().add(productattribute);		
	}
	
	public boolean isProductAttributeAssign(String productid,String attributeid) {
		EqualPredicate prdEqlPredicate = new EqualPredicate(productid);
		EqualPredicate catEqlPredicate = new EqualPredicate(attributeid);
		BeanPredicate prdbeanPredicate = new BeanPredicate("productID", prdEqlPredicate);
		BeanPredicate catbeanPredicate = new BeanPredicate("attributeID", catEqlPredicate);
		return CollectionUtils.exists(getProductAttributesAssign(),PredicateUtils.andPredicate(prdbeanPredicate, catbeanPredicate));
	}
	
	public ProductAttributeAssign findProductAttributeAssign(String productid,String attributeid) {
		EqualPredicate prdEqlPredicate = new EqualPredicate(productid);
		EqualPredicate catEqlPredicate = new EqualPredicate(attributeid);
		BeanPredicate prdbeanPredicate = new BeanPredicate("productID", prdEqlPredicate);
		BeanPredicate catbeanPredicate = new BeanPredicate("attributeID", catEqlPredicate);
		return (ProductAttributeAssign) CollectionUtils.find(getProductAttributesAssign(),PredicateUtils.andPredicate(prdbeanPredicate, catbeanPredicate));
	}
	
	@XmlElement(name = "productlabel")
	protected List<ProductLabelAssign> productLabelsAssign;
	
	public List<ProductLabelAssign> getProductLabelsAssign() {
		return productLabelsAssign;
	}

	public void setProductLabelsAssign(
			List<ProductLabelAssign> productLabelsAssign) {
		this.productLabelsAssign = productLabelsAssign;
	}
	
	public void addProductLabelAssign(ProductLabelAssign productlabel) {
		this.productLabelsAssign.add(productlabel);
	}

	public ProductLabelAssign createProductLabelAssign(String productid,String labelid){	
		ProductLabelAssign productlabel=new ProductLabelAssign();
		productlabel.setProductID(productid);
		productlabel.setLabelID(labelid);
		return productlabel;
	}
	
	public void assignProductLabel(String productid,String labelid){	
		ProductLabelAssign productlabel =createProductLabelAssign(productid,labelid);
		getProductLabelsAssign().add(productlabel);		
	}
	
	public boolean isProductLabelAssign(String productid,String labelid) {
		EqualPredicate prdEqlPredicate = new EqualPredicate(productid);
		EqualPredicate catEqlPredicate = new EqualPredicate(labelid);
		BeanPredicate prdbeanPredicate = new BeanPredicate("productID", prdEqlPredicate);
		BeanPredicate catbeanPredicate = new BeanPredicate("labelID", catEqlPredicate);
		return CollectionUtils.exists(getProductLabelsAssign(),PredicateUtils.andPredicate(prdbeanPredicate, catbeanPredicate));
	}
	
	public ProductLabelAssign findProductLabelAssign(String productid,String labelid) {
		EqualPredicate prdEqlPredicate = new EqualPredicate(productid);
		EqualPredicate catEqlPredicate = new EqualPredicate(labelid);
		BeanPredicate prdbeanPredicate = new BeanPredicate("productID", prdEqlPredicate);
		BeanPredicate catbeanPredicate = new BeanPredicate("labelID", catEqlPredicate);
		return (ProductLabelAssign) CollectionUtils.find(getProductLabelsAssign(),PredicateUtils.andPredicate(prdbeanPredicate, catbeanPredicate));
	}

	@XmlElement(name = "productpermotion")
	protected List<ProductPermotionAssign> productPermotionsAssign;
	
	public List<ProductPermotionAssign> getProductPermotionsAssign() {
		return productPermotionsAssign;
	}

	public void setProductPermotionsAssign(
			List<ProductPermotionAssign> productPermotionsAssign) {
		this.productPermotionsAssign = productPermotionsAssign;
	}
	
	public void addProductPermotionAssign(ProductPermotionAssign productpermotion) {
		this.productPermotionsAssign.add(productpermotion);
	}

	public ProductPermotionAssign createProductPermotionAssign(String productid,String permotionid){	
		ProductPermotionAssign productpermotion=new ProductPermotionAssign();
		productpermotion.setProductID(productid);
		productpermotion.setPermotionID(permotionid);
		return productpermotion;
	}
	
	public void assignProductPermotion(String productid,String permotionid){	
		ProductPermotionAssign productpermotion =createProductPermotionAssign(productid,permotionid);
		getProductPermotionsAssign().add(productpermotion);		
	}
	
	public boolean isProductPermotionAssign(String productid,String permotionid) {
		EqualPredicate prdEqlPredicate = new EqualPredicate(productid);
		EqualPredicate catEqlPredicate = new EqualPredicate(permotionid);
		BeanPredicate prdbeanPredicate = new BeanPredicate("productID", prdEqlPredicate);
		BeanPredicate catbeanPredicate = new BeanPredicate("permotionID", catEqlPredicate);
		return CollectionUtils.exists(getProductPermotionsAssign(),PredicateUtils.andPredicate(prdbeanPredicate, catbeanPredicate));
	}
	
	public ProductPermotionAssign findProductPermotionAssign(String productid,String permotionid) {
		EqualPredicate prdEqlPredicate = new EqualPredicate(productid);
		EqualPredicate catEqlPredicate = new EqualPredicate(permotionid);
		BeanPredicate prdbeanPredicate = new BeanPredicate("productID", prdEqlPredicate);
		BeanPredicate catbeanPredicate = new BeanPredicate("permotionID", catEqlPredicate);
		return (ProductPermotionAssign) CollectionUtils.find(getProductPermotionsAssign(),PredicateUtils.andPredicate(prdbeanPredicate, catbeanPredicate));
	}

	@XmlElement(name = "productvariation")
	protected List<ProductVariationAssign> productVariationsAssign;
	
	public List<ProductVariationAssign> getProductVariationsAssign() {
		return productVariationsAssign;
	}

	public void setProductVariationsAssign(
			List<ProductVariationAssign> productVariationsAssign) {
		this.productVariationsAssign = productVariationsAssign;
	}
	
	public void addProductVariationAssign(ProductVariationAssign productvariation) {
		this.productVariationsAssign.add(productvariation);
	}

	public ProductVariationAssign createProductVariationAssign(String productid,String variationid){	
		ProductVariationAssign productvariation=new ProductVariationAssign();
		productvariation.setProductID(productid);
		productvariation.setVariationID(variationid);
		return productvariation;
	}
	
	public void assignProductVariation(String productid,String variationid){	
		ProductVariationAssign productvariation =createProductVariationAssign(productid,variationid);
		getProductVariationsAssign().add(productvariation);		
	}
	
	public boolean isProductVariationAssign(String productid,String variationid) {
		EqualPredicate prdEqlPredicate = new EqualPredicate(productid);
		EqualPredicate catEqlPredicate = new EqualPredicate(variationid);
		BeanPredicate prdbeanPredicate = new BeanPredicate("productID", prdEqlPredicate);
		BeanPredicate catbeanPredicate = new BeanPredicate("variationID", catEqlPredicate);
		return CollectionUtils.exists(getProductVariationsAssign(),PredicateUtils.andPredicate(prdbeanPredicate, catbeanPredicate));
	}
	
	public ProductVariationAssign findProductVariationAssign(String productid,String variationid) {
		EqualPredicate prdEqlPredicate = new EqualPredicate(productid);
		EqualPredicate catEqlPredicate = new EqualPredicate(variationid);
		BeanPredicate prdbeanPredicate = new BeanPredicate("productID", prdEqlPredicate);
		BeanPredicate catbeanPredicate = new BeanPredicate("variationID", catEqlPredicate);
		return (ProductVariationAssign) CollectionUtils.find(getProductVariationsAssign(),PredicateUtils.andPredicate(prdbeanPredicate, catbeanPredicate));
	}
}
