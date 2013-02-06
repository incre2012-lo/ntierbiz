package com.xl.cm.catalog.tag;

import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;



import com.opensymphony.xwork2.ActionContext;
import com.xl.cm.core.dao.LabelDAO;
import com.xl.cm.core.entity.Label;
import com.xl.cm.core.entity.Product;
import com.xl.cm.core.service.CatalogService;

public class LabelProductsTag  extends SimpleTagSupport {	

	private int size;
	private String label;
	private String type;
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	
	public void doTag() throws JspException {
		List <Product> products =(List<Product>) CatalogService.getInstance().getlabelProducts(label);
		Label feature=LabelDAO.getInstance().getLabel(label);
		try {
			int i=1;
			ActionContext.getContext().getValueStack().set("boxtitle", feature.getTitle());
			ActionContext.getContext().getValueStack().set(label+"Products", products);
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
