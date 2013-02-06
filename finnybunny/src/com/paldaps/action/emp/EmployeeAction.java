package com.paldaps.action.emp;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.paldaps.bo.dao.hibernate.QueryUtil;
import com.paldaps.bo.entity.emp.Employee;
import com.paldaps.bo.entity.emp.EmployeeYearView;
import com.paldaps.bo.service.ServiceFactory;
import com.paldaps.system.core.action.BaseCRUDAction;
import com.paldaps.system.core.util.SpringUtil;

public class EmployeeAction extends BaseCRUDAction implements Preparable{


	private static final long serialVersionUID = 1L;
	
	
	private Employee employee=null;
	private String year;
	private String month;
	private String operation;
	private String opening;
	private String amount;
	private List<EmployeeYearView> employeeYearViews=new ArrayList<EmployeeYearView>();
	private List<EmployeeYearView> employeeMonthlyViews=new ArrayList<EmployeeYearView>() ;	
	
	ServiceFactory serviceFactory=(ServiceFactory)SpringUtil.getBean("serviceFactory");	

		
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public List<EmployeeYearView> getEmployeeYearViews() {		
		return employeeYearViews;
	}

	public Map<String, String> getYears() {
		return (Map<String, String>) QueryUtil.allYearList();
	}

	public String getYear() {
		if(StringUtils.isNotBlank(year))
				return year;
			else
				return QueryUtil.currentFinacialYear(); 
	}

	public void setYear(String year) {
		this.year = year;
	}

	
	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getOperation() {
		if(StringUtils.isNotBlank(operation))
		return operation;
		else
			return "Withdrawal"; 
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String[] getOperations(){
		return new String[]{"Advance","Recovery","Withdrawal"};
	}

	
	public String getOpening() {
		return opening;
	}

	public void setOpening(String opening) {
		this.opening = opening;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	
	public List<EmployeeYearView> getEmployeeMonthlyViews() {
		return employeeMonthlyViews;
	}

	public void setEmployeeMonthlyViews(List<EmployeeYearView> employeeMonthlyViews) {
		this.employeeMonthlyViews = employeeMonthlyViews;
	}

	public String list() {	
		return SUCCESS;
	}
	
	public String display() {		
		return SUCCESS;
	}

	
	public String showYearStmt(){	
		employeeYearViews=serviceFactory.getEmployeeService().getYearView(employee.getPer_no(), year);		
		return SUCCESS;
	}

	public String showMonthlyStmt(){
		if(StringUtils.isBlank(month)){
			month=QueryUtil.currentYearMonth();
		}			
		employee=serviceFactory.getEmployeeService().getEmployee(employee.getPer_no());				
		employeeMonthlyViews=serviceFactory.getEmployeeService().getMonthlyView(employee.getPer_no(), month, opening);
		return SUCCESS;
	}

	
	public String addAmount(){
		month=QueryUtil.currentYearMonth();		
		if(StringUtils.isNotBlank(operation)){
			if(operation.equals("Advance")){
				serviceFactory.getEmployeeService().addAdvanceToEmployee(employee, month, amount, null, null);
			}else if(operation.equals("Recovery")){
				serviceFactory.getEmployeeService().addRecoveryToEmployee(employee, month, amount, null, null);
			}else if (operation.equals("Withdrawal")){
				serviceFactory.getEmployeeService().addWithdrawlToEmployee(employee, month, amount, null, null);
			}
		}
		employeeMonthlyViews=serviceFactory.getEmployeeService().getMonthlyView(employee.getPer_no(), month, amount);
		return SUCCESS;
	}
	

	public String addOpening(){		
		serviceFactory.getEmployeeService().addYearOpeningBal(employee.getPer_no(), QueryUtil.currentFinacialYear(), opening);
		return SUCCESS;
	}
	
	@Override
	public void prepare() throws Exception {		
		if(employee==null||StringUtils.isBlank(employee.getPer_no()))
			employee=new Employee();
		else
			employee=serviceFactory.getEmployeeService().getEmployee(employee.getPer_no());		
	}	
	
}
