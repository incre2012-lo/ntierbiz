package com.paldaps.bo.dao;

import java.util.List;
import java.util.Map;
import java.math.BigDecimal;

import com.paldaps.bo.entity.emp.AdvGPFEntry;
import com.paldaps.bo.entity.emp.Employee;
import com.paldaps.bo.entity.emp.RecGPFEntry;
import com.paldaps.bo.entity.emp.SubsGPFEntry;
import com.paldaps.bo.entity.emp.WiDrGPFEntry;
import com.paldaps.system.core.dao.IGenericDAO;

public interface EmployeeDao extends IGenericDAO<Employee> {

	public abstract BigDecimal getYearOpeningBal(String per_no, String year);

	public abstract Map<String, BigDecimal> getYearlyWiDrGPFEntries(String per_no, String year);

	public abstract List<WiDrGPFEntry> getMonthlyWiDrGPFEntries(String per_no, String months);

	public abstract Map<String, BigDecimal> getYearlyRecGPFEntries(String per_no, String year);

	public abstract List<RecGPFEntry> getMonthlyRecGPFEntries(String per_no, String months);

	public abstract Map<String, BigDecimal> getYearlyAdvGPFEntries(String per_no, String year);

	public abstract List<AdvGPFEntry> getMonthlyAdvGPFEntries(String per_no, String months);

	public abstract Map<String, BigDecimal> getYearlySubsGPFEntries(String per_no, String year);

	public abstract List<SubsGPFEntry> getMonthlySubsGPFEntries(String per_no, String months);

	public abstract Integer countAll(String query, String qtype);

	public abstract List<Employee> getAll(Integer pageSize, Integer pageNumber, String sortname,
			String sortorder, String query, String qtype);

	public abstract Integer countAll();

	public abstract List<Employee> getAll(Integer pageSize, Integer pageNumber);

	public abstract void update(List<Employee> updateBatch);

	public abstract void save(List<Employee> saveBatch);

	public abstract Employee getEmployeeByPer_No(String per_no);

	public abstract void addAdvance(Employee employee, AdvGPFEntry entry);

	public abstract void addRecovery(Employee emp, RecGPFEntry entry);

	public abstract void addWithdrawl(Employee emp, WiDrGPFEntry entry);

	public abstract void setYearOpeningBal(String per_no, String year,
			String opening);
	
}
