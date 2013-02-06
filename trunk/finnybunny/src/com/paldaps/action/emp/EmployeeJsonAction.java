package com.paldaps.action.emp;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.paldaps.bo.entity.emp.Employee;
import com.paldaps.bo.entity.emp.TempEmployee;
import com.paldaps.bo.service.ServiceFactory;
import com.paldaps.system.core.util.SpringUtil;
public class EmployeeJsonAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Integer page=1;
	protected Integer rp=10;
	protected String sortname;
	protected String sortorder;
	protected String query;
	protected String qtype;
	protected Integer total=0;
	protected List<Employee> rows;
	protected ServiceFactory serviceFactory=(ServiceFactory)SpringUtil.getBean("serviceFactory");
	
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
	public List<Employee> getRows() {
		return rows;
	}
	public void setRows(List<Employee> rows) {
		this.rows = rows;
	}
	
	public String getJSON()	{
	    return execute();
	}

	public String execute() {
	   rows= serviceFactory.getEmployeeService().allEmployees(rp,page,sortname,sortorder,query,qtype);
	   total=serviceFactory.getEmployeeService().countAllEmployees(query,qtype);
	   return SUCCESS;
	}

}
