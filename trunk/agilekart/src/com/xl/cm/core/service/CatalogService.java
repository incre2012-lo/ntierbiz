package com.xl.cm.core.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanPredicate;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.functors.EqualPredicate;

import com.xl.cm.core.dao.CategoryDAO;
import com.xl.cm.core.dao.LabelDAO;
import com.xl.cm.core.dao.ContentDAO;
import com.xl.cm.core.dao.ProductDAO;
import com.xl.cm.core.entity.Attribute;
import com.xl.cm.core.entity.Category;
import com.xl.cm.core.entity.Content;
import com.xl.cm.core.entity.Product;

public class CatalogService {

	public Product getLandingDODProduct(){
		LabelDAO labelDao= LabelDAO.getInstance();
		List <Product> products= labelDao.getLabelProducts("dod");		
		if(products.isEmpty())
		return null;
		else
		return	products.get(0);
	}
	
	public String getBannerHTML(){
		ContentDAO contentdao =ContentDAO.getInstance();
		Content content=contentdao.getContent("banner");
		return content==null?"":content.getBody();
	}
	
	
	
	public List <Product> getlabelProducts(String labelID){
		LabelDAO labelDao= LabelDAO.getInstance();
		List <Product> products= labelDao.getLabelProducts(labelID);		
		if(products.isEmpty())
		return new ArrayList<Product>();
		else
		return products;
	}
	
	public List<Attribute> getProductAttributes(String productID){
	    ProductDAO productDAO=ProductDAO.getInstance();
	    List <Attribute>attributes= productDAO.getProductAttributes(productID);		
		if(attributes.isEmpty())
		return new ArrayList<Attribute>();
		else
		return attributes;
	}
	
	public List<Content> getProductContents(String productID){
	    ProductDAO productDAO=ProductDAO.getInstance();
	    List <Content>contents= productDAO.getProductContents(productID);		
		if(contents.isEmpty())
		return new ArrayList<Content>();
		else
		return contents;
	}
	
	public Content getProductContent(String productID,String contentID){
	    List <Content>contents=getProductContents(productID);
	    EqualPredicate nameEqlPredicate = new EqualPredicate(contentID);
	    BeanPredicate beanPredicate = new BeanPredicate("contentID", nameEqlPredicate);
	    return (Content)CollectionUtils.find(contents, beanPredicate);
	}
	
	public List<Product> getCategoryProducts(String categoryID){
		CategoryDAO categoryDao= CategoryDAO.getInstance();
		List <Product> products= categoryDao.getCategoryProducts(categoryID);		
		if(products.isEmpty())
		return null;
		else
		return	products;
	}
	
	public List<Product> getProductProductsByAttribute(String productID,String attribute){
		ProductDAO productDao= ProductDAO.getInstance();
		List <Product> products= productDao.getProductVariationsByAttribute(productID, attribute);		
		if(products.isEmpty())
		return null;
		else
		return	products;
	}
	
	public List<Product> getSiblingProductsByAttribute(String productID,String attribute){
		ProductDAO productDao= ProductDAO.getInstance();
		List <Product> products= productDao.getVariationOtherVariationProductsByAttribute(productID,attribute);		
		if(products.isEmpty())
		return null;
		else
		return	products;
	}
	
	public List<Product> getCatalogProducts(String categoryID){
		List <Product> products=new ArrayList<Product>();
		List <Product> curProducts = getCategoryProducts(categoryID);		
		if(curProducts!=null&&!curProducts.isEmpty())
			products.addAll(curProducts);
		 List<Category> categories=getSubCategories(categoryID);
		 for(Category category:categories){
			 List <Product> curProducts2= getCatalogProducts(category.getCategoryID());
			 if(curProducts2!=null&&!curProducts2.isEmpty())
					products.addAll(curProducts2);
		 }			 
			return	products;
	}
	
	public List<Category> getSubCategories(String categoryID){
		 List<Category> categories= CategoryDAO.getInstance().getSubCategories(categoryID);
		if(categories==null||categories.isEmpty())
			return new ArrayList<Category>();
		else 
		return categories;
	}
	
	public Category getCategory(String categoryID){
		Category  category= CategoryDAO.getInstance().getCategory(categoryID);
		if(category==null)
			return null;
		else 
		return category;
	}
	
	static class CatalogServiceHolder{
		private static final CatalogService _instance=new CatalogService();
	}
	
	public static CatalogService getInstance(){
		return CatalogServiceHolder._instance;
	}
	public static void main(String[] args){
//		 List<Product> prdlist=CatalogService.getInstance().getCategoryProducts();
//		System.out.println(CatalogService.getInstance().getLandingDODProduct().getDesc());
		ProductDAO.getInstance().persist();
		
	}
}
