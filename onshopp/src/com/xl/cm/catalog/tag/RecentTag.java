package com.xl.cm.catalog.tag;

import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;




import com.opensymphony.xwork2.ActionContext;
import com.xl.cm.core.entity.Product;
import com.xl.cm.core.service.CatalogService;

public class RecentTag extends SimpleTagSupport {	

	
	public void doTag() throws JspException {
		List <Product> products =(List<Product>) CatalogService.getInstance().getlabelProducts("recent");
		try {
			for(Product product:products){
			ActionContext.getContext().getValueStack().push(product);
			getJspBody().invoke(null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}