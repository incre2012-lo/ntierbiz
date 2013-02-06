package com.paldaps.action.json;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.paldaps.bo.entity.emp.TempEmployee;
public class DemoJsonAction extends ActionSupport{

	protected Integer page=1;
	protected Integer rp=10;
	protected String sortname;
	protected String sortorder;
	protected String query;
	protected String qtype;
	protected Integer total=0;
	protected List<TempEmployee> rows;
	
	
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRp() {
		return rp;
	}
	public void setRp(Integer rp) {
		this.rp = rp;
	}
	public String getSortname() {
		return sortname;
	}
	public void setSortname(String sortname) {
		this.sortname = sortname;
	}
	public String getSortorder() {
		return sortorder;
	}
	public void setSortorder(String sortorder) {
		this.sortorder = sortorder;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public String getQtype() {
		return qtype;
	}
	public void setQtype(String qtype) {
		this.qtype = qtype;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public List<TempEmployee> getRows() {
		return rows;
	}
	public void setRows(List<TempEmployee> rows) {
		this.rows = rows;
	}
	
	public String getJSON()	{
	    return execute();
	}

	public String execute() {
		//int to = rp * page;
	    //int from = to - rp; 
	    //count query
	    //total = 0;
	   // setRows(new ArrayList());
	    
	   rows= DemoUtil.getTempData(rp,page);
	   total=DemoUtil.countTempData();
	   return SUCCESS;
	}

}
