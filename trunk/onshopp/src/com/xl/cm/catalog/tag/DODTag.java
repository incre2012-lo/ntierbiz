package com.xl.cm.catalog.tag;



import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;



import com.opensymphony.xwork2.ActionContext;
import com.xl.cm.core.entity.Product;
import com.xl.cm.core.service.CatalogService;

public class DODTag extends TagSupport {	

	
	public int doStartTag() throws JspException {
		Product product =CatalogService.getInstance().getLandingDODProduct();
		try {
			 ActionContext.getContext().getValueStack().push(product);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
	
	public int doEndTag() {
		return EVAL_PAGE;
	}
}