package com.xl.cm.catalog.tag;

import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;



import com.opensymphony.xwork2.ActionContext;
import com.xl.cm.core.entity.Product;
import com.xl.cm.core.service.CatalogService;

public class CategoryProductsTag  extends SimpleTagSupport{
	
	private int size;
	private String categoryID;
	private String alias;
	
	
	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public String getCategoryID() {
		return categoryID;
	}


	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}


	public String getAlias() {
		return alias;
	}


	public void setAlias(String alias) {
		this.alias = alias;
	}


	public void doTag() throws JspException {
		List <Product> products =(List<Product>)CatalogService.getInstance().getCatalogProducts(categoryID);
		try {
			int i=1;
			ActionContext.getContext().getValueStack().set("boxtitle", "Featured Products");
			ActionContext.getContext().getValueStack().set(alias, products);
			for(Product product:products){
			ActionContext.getContext().getValueStack().push(product);
			getJspBody().invoke(null);
			if(i==size)
				break;
			else i++;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
