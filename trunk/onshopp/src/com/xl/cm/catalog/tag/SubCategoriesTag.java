package com.xl.cm.catalog.tag;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;



import com.opensymphony.xwork2.ActionContext;
import com.xl.cm.core.entity.Category;
import com.xl.cm.core.service.CatalogService;

public class SubCategoriesTag extends SimpleTagSupport {
	private static final long serialVersionUID = 1L;


	private String categoryID;
	private String alias;

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

	public void doTag() throws JspException, IOException {
		try {
			List<Category> categories = CatalogService.getInstance()
					.getSubCategories(categoryID);
			for (Category category : categories) {
				ActionContext.getContext().getValueStack().set(alias, category);
				 StringWriter sw = new StringWriter();
				getJspBody().invoke(sw);
				 getJspContext().getOut().println(sw.toString());

			}

		} catch (Exception e) {
			
		}
	}
}
