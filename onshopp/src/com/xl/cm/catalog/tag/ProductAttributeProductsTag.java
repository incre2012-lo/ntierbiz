package com.xl.cm.catalog.tag;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import com.opensymphony.xwork2.ActionContext;
import com.xl.cm.core.entity.Product;
import com.xl.cm.core.service.CatalogService;

public class ProductAttributeProductsTag extends SimpleTagSupport{

   private String productID;
   private String attribute;
   private String alias; 
   private boolean siblingVariation=false; 
    
    public void doTag() throws JspException {
	List <Product> products =new ArrayList<Product>();
	if(siblingVariation)
	    products =(List<Product>) CatalogService.getInstance().getSiblingProductsByAttribute(productID,attribute);
	else
	    products =(List<Product>) CatalogService.getInstance().getProductProductsByAttribute(productID,attribute);
	try {
		for(Product product:products){
		    ActionContext.getContext().getValueStack().set(alias, product);
			StringWriter sw = new StringWriter();
			getJspBody().invoke(sw);
			getJspContext().getOut().println(sw.toString());
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
    }


    public String getProductID() {
        return productID;
    }


    public void setProductID(String productID) {
        this.productID = productID;
    }


    public String getAttribute() {
        return attribute;
    }


    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }


    public String getAlias() {
        return alias;
    }


    public void setAlias(String alias) {
        this.alias = alias;
    }


    public boolean isSiblingVariation() {
        return siblingVariation;
    }


    public void setSiblingVariation(boolean siblingVariation) {
        this.siblingVariation = siblingVariation;
    }


   
    
    
}
