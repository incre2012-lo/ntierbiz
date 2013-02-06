package com.xl.cm.catalog.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;



import com.xl.cm.core.service.CatalogService;

public class BannerTag extends TagSupport {	
	
	
	public int doStartTag() throws JspException {
		String content =CatalogService.getInstance().getBannerHTML();
		try {
			pageContext.getOut().print(content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
	
	public int doEndTag() {
		return EVAL_PAGE;
	}
}
