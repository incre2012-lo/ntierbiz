package com.paldaps.bo.dao.hibernate;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaQuery;

import org.apache.commons.lang.StringUtils;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.paldaps.bo.dao.EmployeeDao;
import com.paldaps.bo.entity.emp.AdvGPFEntry;
import com.paldaps.bo.entity.emp.Employee;
import com.paldaps.bo.entity.emp.EmployeeOpnAndClsLog;
import com.paldaps.bo.entity.emp.RecGPFEntry;
import com.paldaps.bo.entity.emp.SubsGPFEntry;
import com.paldaps.bo.entity.emp.WiDrGPFEntry;

import com.paldaps.system.core.dao.hibernate.GenericHibernateDAO;

@Repository(value = "employeeDao")
public class EmployeeHibernateDAO extends GenericHibernateDAO<Employee>
		implements EmployeeDao {

	@Autowired
	public EmployeeHibernateDAO(SessionFactory sessionFactory) {
		super(sessionFactory);
		this.clazz = Employee.class;
	}

	
	public Employee getEmployeeByPer_No(String per_no) {
		Employee employee = (Employee) this.getCurrentSession()
				.createQuery("from " + clazz.getName() + " where per_no = ?")
				.setString(0, per_no).uniqueResult();
		return employee;
	}

	
	public void addAdvance(Employee employee,AdvGPFEntry entry){
		entry.setCreated(new Date());
		entry.setUpdated(new Date());
		employee=getEmployeeByPer_No(employee.getPer_no());
		employee.getAdvGPFEntries().add(entry);
		update(employee);
	}
	
	public void addRecovery(Employee employee, RecGPFEntry entry) {
		entry.setCreated(new Date());
		entry.setUpdated(new Date());
		employee=getEmployeeByPer_No(employee.getPer_no());
		employee.getRecGPFEntries().add(entry);
		update(employee);
	}


	
	public void addWithdrawl(Employee employee, WiDrGPFEntry entry) {
		entry.setCreated(new Date());
		entry.setUpdated(new Date());
		employee=getEmployeeByPer_No(employee.getPer_no());
		employee.getWidrlsGPFEntries().add(entry);
		update(employee);
		
	}
	public void save(List<Employee> saveBatch) {
		for (Employee emp : saveBatch)
			this.save(emp);
	}

	
	
	public void update(List<Employee> updateBatch) {
		for (Employee emp : updateBatch)
			this.update(emp);
	}

	
	
	public List<Employee> getAll(Integer pageSize, Integer pageNumber) {
		if (pageNumber == 1)
			return this.getCurrentSession().createQuery("from Employee")
					.setMaxResults(pageSize).list();
		else
			return this.getCurrentSession().createQuery("from Employee")
					.setFirstResult(pageSize * (pageNumber - 1))
					.setMaxResults(pageSize).list();
	}

	
	
	public Integer countAll() {
		return ((Long) this.getCurrentSession()
				.createQuery("select count(*) from Employee").uniqueResult())
				.intValue();
	}

	
	
	public List<Employee> getAll(Integer pageSize, Integer pageNumber,
			String sortname, String sortorder, String query, String qtype) {
		String q = QueryUtil.getQuery(Employee.class.getSimpleName(), query,
				qtype, sortname, sortorder);
		System.out.println(q);
		if (pageNumber == 1)
			return this.getCurrentSession().createQuery(q)
					.setMaxResults(pageSize).list();
		else
			return this.getCurrentSession().createQuery(q)
					.setFirstResult(pageSize * (pageNumber - 1))
					.setMaxResults(pageSize).list();
	}

	
	
	public Integer countAll(String query, String qtype) {
		String q = QueryUtil.getQuery(Employee.class.getName(), query, qtype,
				null, null);
		return ((Long) this.getCurrentSession()
				.createQuery("select count(*) " + q).uniqueResult()).intValue();
	}

	
	public List<SubsGPFEntry> getMonthlySubsGPFEntries(String per_no,
			String months) {
		return this.getCurrentSession()
					.createQuery("from SubsGPFEntry where yr_mth= ? and per_no=?")
					.setString(0, months)
					.setString(1, per_no)
					.list();
		
	}

	
	
	public Map<String, BigDecimal> getYearlySubsGPFEntries(String per_no,
			String year) {
		String mnths[]=QueryUtil.getMonths(year);
		Map<String, BigDecimal> yearlySubsGPF=new HashMap<String, BigDecimal>();
		for (int i = 0; i < mnths.length; i++) {
			BigDecimal total=BigDecimal.ZERO;
			List<SubsGPFEntry> entries= this.getCurrentSession()
					.createQuery("from SubsGPFEntry where yr_mth= ? and per_no=?")
					.setString(0, mnths[i])
					.setString(1, per_no)
					.list();
			for (Iterator iterator = entries.iterator(); iterator.hasNext();) {
				SubsGPFEntry entry = (SubsGPFEntry) iterator.next();				
				try {
					String subs=entry.getGpf_subs();
					BigDecimal bigDecimal=new BigDecimal(subs);
					total=total.add(bigDecimal);
				} catch (Exception e) {
				}
				
			}
			yearlySubsGPF.put(mnths[i],total);
		}
		
		return yearlySubsGPF;
	}
	
	
	public List<AdvGPFEntry> getMonthlyAdvGPFEntries(String per_no,
			String months) {
		return this.getCurrentSession()
					.createQuery("from AdvGPFEntry where yr_mth= ? and per_no=?")
					.setString(0, months)
					.setString(1, per_no)
					.list();
		
	}
	
	
	public Map<String, BigDecimal> getYearlyAdvGPFEntries(String per_no,
			String year) {
		String mnths[]=QueryUtil.getMonths(year);
		Map<String, BigDecimal> yearlyGPF=new HashMap<String, BigDecimal>();
		for (int i = 0; i < mnths.length; i++) {
			BigDecimal total=BigDecimal.ZERO;
			List<AdvGPFEntry> entries= this.getCurrentSession()
					.createQuery("from AdvGPFEntry where yr_mth= ? and per_no=?")
					.setString(0, mnths[i])
					.setString(1, per_no)
					.list();
			for (Iterator iterator = entries.iterator(); iterator.hasNext();) {
				AdvGPFEntry entry = (AdvGPFEntry) iterator.next();				
				try {
					String amount=entry.getAdvance();
					BigDecimal bigDecimal=new BigDecimal(amount);
					total=total.add(bigDecimal);
				} catch (Exception e) {
				}
				
			}
			yearlyGPF.put(mnths[i],total);
		}
		
		return yearlyGPF;
	}

	
	
	public List<RecGPFEntry> getMonthlyRecGPFEntries(String per_no,
			String months) {
		return this.getCurrentSession()
					.createQuery("from RecGPFEntry where yr_mth= ? and per_no=?")
					.setString(0, months)
					.setString(1, per_no)
					.list();
		
	}
	
	
	
	public Map<String, BigDecimal> getYearlyRecGPFEntries(String per_no,
			String year) {
		String mnths[]=QueryUtil.getMonths(year);
		Map<String, BigDecimal> yearlyGPF=new HashMap<String, BigDecimal>();
		for (int i = 0; i < mnths.length; i++) {
			BigDecimal total=BigDecimal.ZERO;
			List<RecGPFEntry> entries= this.getCurrentSession()
					.createQuery("from RecGPFEntry where yr_mth= ? and per_no=?")
					.setString(0, mnths[i])
					.setString(1, per_no)
					.list();
			for (Iterator iterator = entries.iterator(); iterator.hasNext();) {
				RecGPFEntry entry = (RecGPFEntry) iterator.next();				
				try {
					String amount=entry.getGpf_arr_rec();
					BigDecimal bigDecimal=new BigDecimal(amount);
					total=total.add(bigDecimal);
				} catch (Exception e) {
				}
				
			}
			yearlyGPF.put(mnths[i],total);
		}
		
		return yearlyGPF;
	}
	
	
	public List<WiDrGPFEntry> getMonthlyWiDrGPFEntries(String per_no,
			String months) {
		return this.getCurrentSession()
					.createQuery("from WiDrGPFEntry where yr_mth= ? and per_no=?")
					.setString(0, months)
					.setString(1, per_no)
					.list();
		
	}

	
	
	public Map<String, BigDecimal> getYearlyWiDrGPFEntries(String per_no,
			String year) {
		String mnths[]=QueryUtil.getMonths(year);
		Map<String, BigDecimal> yearlyGPF=new HashMap<String, BigDecimal>();
		for (int i = 0; i < mnths.length; i++) {
			BigDecimal total=BigDecimal.ZERO;
			List<WiDrGPFEntry> entries= this.getCurrentSession()
					.createQuery("from WiDrGPFEntry where yr_mth= ? and per_no=?")
					.setString(0, mnths[i])
					.setString(1, per_no)
					.list();
			for (Iterator iterator = entries.iterator(); iterator.hasNext();) {
				WiDrGPFEntry entry = (WiDrGPFEntry) iterator.next();				
				try {
					String amount=entry.getWithdraw();
					BigDecimal bigDecimal=new BigDecimal(amount);
					total=total.add(bigDecimal);
				} catch (Exception e) {
				}
				
			}
			yearlyGPF.put(mnths[i],total);
		}
		
		return yearlyGPF;
	}

	
	
	public BigDecimal getYearOpeningBal(String per_no, String year) {
		EmployeeOpnAndClsLog entry =(EmployeeOpnAndClsLog) this.getCurrentSession()
				.createQuery("from EmployeeOpnAndClsLog where year= ? and per_no=?")
				.setString(0, year)
				.setString(1, per_no)
				.uniqueResult();
		BigDecimal decimal=BigDecimal.ZERO;
		
		try {
			if(entry!=null){
				BigDecimal am=new BigDecimal(entry.getOpening());
				decimal=decimal.add(am);
			}
		} catch (Exception e) {			
		}
		return decimal;
	}


	
	public void setYearOpeningBal(String per_no, String year,String opening){
		Employee employee=getEmployeeByPer_No(per_no);
		EmployeeOpnAndClsLog log =new EmployeeOpnAndClsLog();
		log.setCreated(new Date());
		log.setUpdated(new Date());
		log.setYear(year);
		log.setOpening(opening);
		employee.getEmployeeOpnAndClsGPFEntries().add(log);
		update(employee);
	}
	
}
