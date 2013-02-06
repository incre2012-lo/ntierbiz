package com.paldaps.bo.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.paldaps.bo.dao.EmployeeDao;
import com.paldaps.bo.entity.emp.Employee;
import com.paldaps.bo.entity.emp.EmployeeYearView;



public interface EmployeeService {

	public abstract List<EmployeeYearView> getMonthlyView(String per_no, String month, String openingAmt);

	public abstract List<EmployeeYearView> getYearView(String per_no, String year);

	public abstract Integer countAllEmployees(String query, String qtype)
			throws DataAccessException;

	public abstract List<Employee> allEmployees(Integer pageSize, Integer pageNumber)
			throws DataAccessException;

	public abstract List<Employee> allEmployees(Integer pageSize, Integer pageNumber, String sortname,
			String sortorder, String query, String qtype);

	public abstract Integer countAllEmployees() throws DataAccessException;

	public abstract void updateBatch(List<Employee> updateBatch);

	public abstract void saveBatch(List<Employee> saveBatch);

	public abstract Employee getEmployee(String per_no);

	public abstract void saveEmployee(Employee emp)
			throws DataAccessException;

	public abstract void setEmployeeDao(EmployeeDao employeeDao);

	public abstract void addWithdrawlToEmployee(Employee emp, String mnth_year,
			String amount, String authorid, String Remark);

	public abstract void addRecoveryToEmployee(Employee emp, String mnth_year,
			String amount, String authorid, String Remark);

	public abstract void addAdvanceToEmployee(Employee emp, String mnth_year,
			String amount, String authorid, String Remark);

	public abstract boolean isOpeningBalanceRequired(String per_no, String year);

	public abstract void addYearOpeningBal(String per_no, String year,
			String opening);


}
