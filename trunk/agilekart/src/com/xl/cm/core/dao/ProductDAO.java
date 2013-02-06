package com.xl.cm.core.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanPredicate;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.PredicateUtils;
import org.apache.commons.collections.Transformer;
import org.apache.commons.collections.functors.EqualPredicate;
import org.apache.commons.lang.StringUtils;

import com.xl.cm.core.entity.Attribute;
import com.xl.cm.core.entity.AttributeMgr;
import com.xl.cm.core.entity.Category;
import com.xl.cm.core.entity.CategoryMgr;
import com.xl.cm.core.entity.Content;
import com.xl.cm.core.entity.ContentMgr;
import com.xl.cm.core.entity.Label;
import com.xl.cm.core.entity.LabelMgr;
import com.xl.cm.core.entity.Permotion;
import com.xl.cm.core.entity.PermotionMgr;
import com.xl.cm.core.entity.Price;
import com.xl.cm.core.entity.PriceMgr;
import com.xl.cm.core.entity.Product;
import com.xl.cm.core.entity.ProductAttributeAssign;
import com.xl.cm.core.entity.ProductCategoryAssign;
import com.xl.cm.core.entity.ProductContentAssign;
import com.xl.cm.core.entity.ProductLabelAssign;
import com.xl.cm.core.entity.ProductMgr;
import com.xl.cm.core.entity.ProductPermotionAssign;
import com.xl.cm.core.entity.ProductPriceAssign;
import com.xl.cm.core.entity.ProductVariationAssign;
import com.xl.cm.core.entity.RelationMgr;
import com.xl.cm.core.mgr.AttributeMgrFactory;
import com.xl.cm.core.mgr.CategoryMgrFactory;
import com.xl.cm.core.mgr.ContentMgrFactory;
import com.xl.cm.core.mgr.LabelMgrFactory;
import com.xl.cm.core.mgr.PermotionMgrFactory;
import com.xl.cm.core.mgr.PriceMgrFactory;
import com.xl.cm.core.mgr.ProductMgrFactory;
import com.xl.cm.core.mgr.RelationMgrFactory;


public class ProductDAO {
	private ProductMgr mgr;
	private RelationMgr relmgr;
	private CategoryMgr catmgr;
	private ContentMgr contentmgr;
	private PriceMgr pricemgr;
	private AttributeMgr attributemgr;
	private LabelMgr labelmgr;
	private PermotionMgr permotionmgr;
	
	public ProductDAO(){
			mgr =ProductMgrFactory.getInstance().getMgr();
			relmgr=RelationMgrFactory.getInstance().getMgr();
			catmgr=CategoryMgrFactory.getInstance().getMgr();
			contentmgr=ContentMgrFactory.getInstance().getMgr();
			pricemgr=PriceMgrFactory.getInstance().getMgr();
			attributemgr=AttributeMgrFactory.getInstance().getMgr();
			labelmgr=LabelMgrFactory.getInstance().getMgr();
			permotionmgr=PermotionMgrFactory.getInstance().getMgr();
	}
	
	public List<Product> getAllProducts(){
			List<Product>  products=mgr.getProducts();
			setProductUrlPath(products);
		return products;
	}
	public void persist(){
		ProductMgrFactory.getInstance().persist();
	}
	
	public void addProduct(Product product){	
		if(!mgr.isProduct(product.getProductID()))
			mgr.addProduct(product);
	}	
	
	public Product getProduct(String productID ){
		if(!mgr.isProduct(productID)){	
			Product product= mgr.createProduct(productID);
			setProductUrlPath(product);
			return product;
		}else{
			Product product=mgr.findProduct(productID);
			setProductUrlPath(product);
			return product;
		}			
	}
	
	public boolean isProduct(String productID ){
	    return mgr.isProduct(productID) ;
	}
	
	
	public void assignProductToCategory(Product prd,Category cat){
		relmgr.assignProductCategory(prd.getProductID(), cat.getCategoryID());
		RelationMgrFactory.getInstance().persist();
		
	}
	


	
	public List<Category> getProductCategories(String productID) {
		List<Category> list=new ArrayList<Category>();
		if(relmgr==null){
			return list;				
		}
		
		EqualPredicate nameEqlPredicate = new EqualPredicate(productID);
		BeanPredicate beanPredicate = new BeanPredicate("productID", nameEqlPredicate);		
		List <ProductCategoryAssign> productCategoryAssign=(List<ProductCategoryAssign>) CollectionUtils.select(relmgr.getProductCategoriesAssign(), beanPredicate);		
		  Transformer transformer = new Transformer( ) {
			  public Object transform(Object object) {
				  ProductCategoryAssign  assign = (ProductCategoryAssign) object;
				  return catmgr.findCategory(assign.getCategoryID());
              }
		  };
		  CollectionUtils.collect(productCategoryAssign, transformer,list);
		return list;
	}
	
	
	public void assignProductToContent(Product product,Content content){
		relmgr.assignProductContent(product.getProductID(), content.getContentID());
		RelationMgrFactory.getInstance().persist();
		
	}
	
	public List<Content> getProductContents(String productID) {
		List<Content> list=new ArrayList<Content>();
		if(relmgr==null){
			return list;				
		}
		EqualPredicate nameEqlPredicate = new EqualPredicate(productID);
		BeanPredicate beanPredicate = new BeanPredicate("productID", nameEqlPredicate);		
		List <ProductContentAssign> productContentAssign=(List<ProductContentAssign>) CollectionUtils.select(relmgr.getProductContentsAssign(), beanPredicate);		
		  Transformer transformer = new Transformer( ) {
			  public Object transform(Object object) {
				  ProductContentAssign  assign = (ProductContentAssign) object;
				  return contentmgr.findContent(assign.getContentID());
              }
		  };
		  CollectionUtils.collect(productContentAssign, transformer,list);
		return list;
	}
	
	
	
	
	public void assignProductToPrice(Product product,Price price){
		relmgr.assignProductPrice(product.getProductID(), price.getPriceID());
		RelationMgrFactory.getInstance().persist();
		
	}
	
	public List<Price> getProductPrices(String productID) {
		List<Price> list=new ArrayList<Price>();
		if(relmgr==null){
			return list;				
		}
		EqualPredicate nameEqlPredicate = new EqualPredicate(productID);
		BeanPredicate beanPredicate = new BeanPredicate("productID", nameEqlPredicate);		
		List <ProductPriceAssign> productPriceAssign=(List<ProductPriceAssign>) CollectionUtils.select(relmgr.getProductPricesAssign(), beanPredicate);		
		  Transformer transformer = new Transformer( ) {
			  public Object transform(Object object) {
				  ProductPriceAssign  assign = (ProductPriceAssign) object;
				  return pricemgr.findPrice(assign.getPriceID());
              }
		  };
		  CollectionUtils.collect(productPriceAssign, transformer,list);
		return list;
	}
	
	public void assignProductToAttribute(Product product,Attribute attribute){
		relmgr.assignProductAttribute(product.getProductID(), attribute.getAttributeID());
		RelationMgrFactory.getInstance().persist();
		
	}
	
	public void assignProductToAttributeWithProperty(Product product,Attribute attribute,String key, String value){
	    	ProductAttributeAssign productattribute=relmgr.createProductAttributeAssign(product.getProductID(),attribute.getAttributeID());
	    	productattribute.setDisplayName(key);
	    	productattribute.setValue(value);
	    	relmgr.getProductAttributesAssign().add(productattribute);	    	
		RelationMgrFactory.getInstance().persist();
		
	}
	
	public List<Attribute> getProductAttributes(String productID) {
		List<Attribute> list=new ArrayList<Attribute>();
		if(relmgr==null){
			return list;				
		}
		EqualPredicate nameEqlPredicate = new EqualPredicate(productID);
		BeanPredicate beanPredicate = new BeanPredicate("productID", nameEqlPredicate);		
		List <ProductAttributeAssign> productAttributeAssign=(List<ProductAttributeAssign>) CollectionUtils.select(relmgr.getProductAttributesAssign(), beanPredicate);		
		  Transformer transformer = new Transformer( ) {
			  public Object transform(Object object) {
				  ProductAttributeAssign  assign = (ProductAttributeAssign) object;
				   Attribute attribute= attributemgr.findAttribute(assign.getAttributeID()); 
				      if(StringUtils.isNotBlank(assign.getDisplayName())||StringUtils.equals("null", assign.getDisplayName()))
					  attribute.setAttrName(assign.getDisplayName());
				      if(StringUtils.isNotBlank(assign.getValue())||StringUtils.equals("null", assign.getValue()))
					  attribute.setAttrValue(assign.getValue());			      
				      return attribute;
              }
		  };
		  CollectionUtils.collect(productAttributeAssign, transformer,list);
		return list;
	}
	
	
	
	public void assignProductToLabel(Product product,Label label){
		relmgr.assignProductLabel(product.getProductID(), label.getLabelID());
		RelationMgrFactory.getInstance().persist();
		
	}
	
	public List<Label> getProductLabels(String productID) {
		List<Label> list=new ArrayList<Label>();
		if(relmgr==null){
			return list;				
		}
		EqualPredicate nameEqlPredicate = new EqualPredicate(productID);
		BeanPredicate beanPredicate = new BeanPredicate("productID", nameEqlPredicate);		
		List <ProductLabelAssign> productLabelAssign=(List<ProductLabelAssign>) CollectionUtils.select(relmgr.getProductLabelsAssign(), beanPredicate);		
		  Transformer transformer = new Transformer( ) {
			  public Object transform(Object object) {
				  ProductLabelAssign  assign = (ProductLabelAssign) object;
				  return labelmgr.findLabel(assign.getLabelID());
              }
		  };
		  CollectionUtils.collect(productLabelAssign, transformer,list);
		return list;
	}
	

	
	public void assignProductToPermotion(Product product,Permotion permotion){
		relmgr.assignProductPermotion(product.getProductID(), permotion.getPermotionID());
		RelationMgrFactory.getInstance().persist();
		
	}
	
	public List<Permotion> getProductPermotions(String productID) {
		List<Permotion> list=new ArrayList<Permotion>();
		if(relmgr==null){
			return list;				
		}
		EqualPredicate nameEqlPredicate = new EqualPredicate(productID);
		BeanPredicate beanPredicate = new BeanPredicate("productID", nameEqlPredicate);		
		List <ProductPermotionAssign> productPermotionAssign=(List<ProductPermotionAssign>) CollectionUtils.select(relmgr.getProductPermotionsAssign(), beanPredicate);		
		  Transformer transformer = new Transformer( ) {
			  public Object transform(Object object) {
				  ProductPermotionAssign  assign = (ProductPermotionAssign) object;
				  return permotionmgr.findPermotion(assign.getPermotionID());
              }
		  };
		  CollectionUtils.collect(productPermotionAssign, transformer,list);
		return list;
	}
	
	public void setProductUrlPath(Product product){
		List<Category> categories= getProductCategories(product.getProductID());
		if(categories.size()>0){
			Category cate=categories.get(0);
			product.setUrlPath("/"+cate.getParentCategoryID()+"/"+cate.getCategoryID()+"/"+product.getProductID()+"_buy");
		}else{
			product.setUrlPath("/"+"-"+"/"+"-"+"/"+product.getProductID()+"_buy");
		}
		
	}
	
	public void setProductUrlPath(List<Product> products){
		Transformer transformer = new Transformer( ) {
			  public Object transform(Object object) {
				  Product  assign = (Product) object;
				  setProductUrlPath(assign);
				  return assign;
             }
		  };
		  CollectionUtils.collect(products,transformer);
	}
	
	
	public void assignProductToVariation(Product product,Product variation){
		relmgr.assignProductVariation(product.getProductID(), variation.getProductID());
		RelationMgrFactory.getInstance().persist();
		
	}
	
	public List<Product> getProductVariations(String productID) {
		List<Product> list=new ArrayList<Product>();
		if(relmgr==null){
			return list;				
		}
		EqualPredicate nameEqlPredicate = new EqualPredicate(productID);
		BeanPredicate beanPredicate = new BeanPredicate("productID", nameEqlPredicate);		
		List <ProductVariationAssign> productVariationAssign=(List<ProductVariationAssign>) CollectionUtils.select(relmgr.getProductVariationsAssign(), beanPredicate);		
		  Transformer transformer = new Transformer( ) {
			  public Object transform(Object object) {
				  ProductVariationAssign  assign = (ProductVariationAssign) object;
				  return mgr.findProduct(assign.getVariationID());
			  }
		  };
		  CollectionUtils.collect(productVariationAssign, transformer,list);
		return list;
	}
	
	public List<Product> getProductVariationsByAttribute(String productID,String attribute) {
		List<Product> list=new ArrayList<Product>();
		if(relmgr==null){
			return list;				
		}
		EqualPredicate prdEqlPredicate = new EqualPredicate(productID);
		BeanPredicate beanPrdPredicate = new BeanPredicate("productID", prdEqlPredicate);	
		EqualPredicate attrEqlPredicate = new EqualPredicate(attribute);
		BeanPredicate beanAttrPredicate = new BeanPredicate("variationAttribute", attrEqlPredicate);
		List <ProductVariationAssign> productVariationAssign=(List<ProductVariationAssign>) CollectionUtils.select(relmgr.getProductVariationsAssign(), PredicateUtils.andPredicate(beanPrdPredicate, beanAttrPredicate));		
		  Transformer transformer = new Transformer( ) {
			  public Object transform(Object object) {
				  ProductVariationAssign  assign = (ProductVariationAssign) object;
				  return mgr.findProduct(assign.getVariationID());
			  }
		  };
		  CollectionUtils.collect(productVariationAssign, transformer,list);
		return list;
	}
	
	public Product getVariationMasterProduct(String variationID) {
		List<Product> list=new ArrayList<Product>();
		if(relmgr==null){
			return null;				
		}		
		EqualPredicate nameEqlPredicate = new EqualPredicate(variationID);
		BeanPredicate beanPredicate = new BeanPredicate("variationID", nameEqlPredicate);		
		List <ProductVariationAssign> productVariationAssign=(List<ProductVariationAssign>) CollectionUtils.select(relmgr.getProductVariationsAssign(), beanPredicate);		
		  Transformer transformer = new Transformer( ) {
			  public Object transform(Object object) {
				  ProductVariationAssign  assign = (ProductVariationAssign) object;
				  return mgr.findProduct(assign.getProductID());
          }
		  };
		  CollectionUtils.collect(productVariationAssign, transformer,list);
		return list.isEmpty()?null:list.get(0);
	}
	
	public List<Product> getVariationOtherVariationProductsByAttribute(String variationID,String attribute) {
		Product masterProduct=getVariationMasterProduct(variationID);
		return getProductVariationsByAttribute(masterProduct.getProductID(),attribute);
	}
	
	static class ProductDAOHolder{
		private static final ProductDAO _instance=new ProductDAO();
	}
	
	public static ProductDAO getInstance(){
		return ProductDAOHolder._instance;
	}
}
