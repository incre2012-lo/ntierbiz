package com.xl.cm.catalog.action;


import com.xl.cm.core.action.BaseAction;
import com.xl.cm.core.dao.ProductDAO;
import com.xl.cm.core.entity.Product;
import com.xl.cm.core.page.Contants;
import com.xl.cm.core.service.CatalogService;

public class BrowseAction extends BaseAction{
	private static final long serialVersionUID = 1L;

	private String categoryID;
	private String parentCategoryID;
	private String productID;
	private Product product;
	
	
	
	public String getParentCategoryID() {
		return parentCategoryID;
	}

	public void setParentCategoryID(String parentCategoryID) {
		this.parentCategoryID = parentCategoryID;
	}

	public String getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String browse(){		
		return SUCCESS;	
	}
	
	public String landing(){
		
		return SUCCESS;	
	}
	
	public String details(){
		setProduct(ProductDAO.getInstance().getProduct(getProductID()));		
		request.put(Contants.PRODUCTATTRIBUTES, CatalogService.getInstance().getProductAttributes(getProductID()));
		request.put(Contants.PRODUCTBRAND, CatalogService.getInstance().getProductContent(getProductID(),"ideal"));
		return SUCCESS;	
	}

	

}
