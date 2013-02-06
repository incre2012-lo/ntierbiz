package com.xl.cm.core.entity;

import java.util.List;

import javax.xml.bind.annotation.*;

import org.apache.commons.beanutils.BeanPredicate;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.functors.EqualPredicate;

@XmlRootElement(name = "products")
@XmlAccessorType(XmlAccessType.FIELD)

public class ProductMgr {	
	
	 @XmlElement(name = "product")
	 protected List<Product> products;

	public List<Product> getProducts() {		
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public void addProduct(Product product) {
		this.products.add(product);
	}
	
	public Product createProduct(String id){
		Product prd=new Product();
		prd.setProductID(id);
		return prd;
	}
	public Product findProduct(String productID) {	
		EqualPredicate nameEqlPredicate = new EqualPredicate(productID);
		BeanPredicate beanPredicate = new BeanPredicate("productID", nameEqlPredicate);
		return (Product)CollectionUtils.find(getProducts(), beanPredicate);
	}
	
	public boolean isProduct(String productID) {
		EqualPredicate nameEqlPredicate = new EqualPredicate(productID);
		BeanPredicate beanPredicate = new BeanPredicate("productID", nameEqlPredicate);
		return CollectionUtils.exists(getProducts(), beanPredicate);
	}
}