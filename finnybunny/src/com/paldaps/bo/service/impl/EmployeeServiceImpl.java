package com.paldaps.bo.service.impl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paldaps.bo.dao.EmployeeDao;
import com.paldaps.bo.dao.hibernate.QueryUtil;
import com.paldaps.bo.entity.emp.AdvGPFEntry;
import com.paldaps.bo.entity.emp.Employee;
import com.paldaps.bo.entity.emp.EmployeeOpnAndClsLog;
import com.paldaps.bo.entity.emp.EmployeeYearView;
import com.paldaps.bo.entity.emp.RecGPFEntry;
import com.paldaps.bo.entity.emp.SubsGPFEntry;
import com.paldaps.bo.entity.emp.WiDrGPFEntry;
import com.paldaps.bo.service.EmployeeService;
@Service(value = "employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao employeeDao;
	
	@Autowired
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	
	
	public void saveEmployee(Employee emp) throws DataAccessException {
		employeeDao.save(emp);
	}

	
	public Employee getEmployee(String per_no) {
		return employeeDao.getEmployeeByPer_No(per_no);
	}

	
	
	public void saveBatch(List<Employee> saveBatch) {
		 employeeDao.save(saveBatch);
	}

	
	
	public void updateBatch(List<Employee> updateBatch) {
		 employeeDao.update(updateBatch);		
	}

	
	
	public Integer countAllEmployees() throws DataAccessException {
		return employeeDao.countAll();
	}

	
	
	public List<Employee> allEmployees(Integer pageSize, Integer pageNumber,
			String sortname, String sortorder, String query, String qtype) {
		List<Employee> list=employeeDao.getAll(pageSize, pageNumber,sortname,sortorder,query,qtype);
		return list;
	}

	
	
	public List<Employee> allEmployees(Integer pageSize, Integer pageNumber)
			throws DataAccessException {
		List<Employee> list=employeeDao.getAll(pageSize, pageNumber);
		return list;
	}

	
	
	public Integer countAllEmployees(String query, String qtype)
			throws DataAccessException {
		return employeeDao.countAll(query, qtype);
	}

	
	
	public List<EmployeeYearView> getYearView(String per_no, String year) {
		BigDecimal prg=employeeDao.getYearOpeningBal(per_no, year);
		List<EmployeeYearView> views=new ArrayList<EmployeeYearView>();
		String mnths[]=QueryUtil.getMonths(year);
		Map<String, BigDecimal> subsMap=employeeDao.getYearlySubsGPFEntries(per_no, year);
		Map<String, BigDecimal> advMap=employeeDao.getYearlyAdvGPFEntries(per_no, year);
		Map<String, BigDecimal> recMap=employeeDao.getYearlyRecGPFEntries(per_no, year);
		Map<String, BigDecimal> widiMap=employeeDao.getYearlyWiDrGPFEntries(per_no, year);
		for (int i = 0; i < mnths.length; i++) {
			EmployeeYearView yearView=new EmployeeYearView();
			BigDecimal ne=BigDecimal.ZERO;
			BigDecimal adv=advMap.get(mnths[i]);
			BigDecimal rec=recMap.get(mnths[i]);
			BigDecimal subs=subsMap.get(mnths[i]);
			BigDecimal withdraw=widiMap.get(mnths[i]);
			yearView.setMth_year(mnths[i]);
			yearView.setAdv(adv.toString());
			yearView.setRec(rec.toString());
			yearView.setSubs(subs.toString());
			yearView.setWithdrawal(withdraw.toString());
			yearView.setOpening(prg.toString());
			ne=subs.add(rec).subtract(adv).subtract(withdraw);
			yearView.setNe(ne.toString());
			prg=prg.add(ne);
			yearView.setProg_total(prg.toString());
			views.add(yearView);
		}
		return views;
	}
	
	
	public List<EmployeeYearView> getMonthlyView(String per_no, String month ,String openingAmt) {
		List<EmployeeYearView> views=new ArrayList<EmployeeYearView>();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		List<SubsGPFEntry> subentries=employeeDao.getMonthlySubsGPFEntries(per_no, month);
		for (Iterator iterator = subentries.iterator(); iterator.hasNext();) {
			SubsGPFEntry subsGPFEntry = (SubsGPFEntry) iterator.next();
			EmployeeYearView yearView=new EmployeeYearView();				
			yearView.setMth_year(dateFormat.format(subsGPFEntry.getUpdated()));
			yearView.setAdv("0");
			yearView.setRec("0");
			yearView.setSubs(subsGPFEntry.getGpf_subs());
			yearView.setWithdrawal("0");
			yearView.setNe(subsGPFEntry.getGpf_subs());
			yearView.setProg_total(subsGPFEntry.getGpf_subs());
			views.add(yearView);
		}
		List<AdvGPFEntry> adventries=employeeDao.getMonthlyAdvGPFEntries(per_no, month);
		for (Iterator iterator = adventries.iterator(); iterator.hasNext();) {
			AdvGPFEntry entry = (AdvGPFEntry) iterator.next();
			EmployeeYearView yearView=new EmployeeYearView();				
			yearView.setMth_year(dateFormat.format(entry.getUpdated()));
			yearView.setAdv(entry.getAdvance());
			yearView.setRec("0");
			yearView.setSubs("0");
			yearView.setWithdrawal("0");
			BigDecimal ne=BigDecimal.ZERO;
			BigDecimal adv=new BigDecimal(entry.getAdvance());
			ne=ne.subtract(adv);
			yearView.setNe(ne.toString());
			yearView.setProg_total(ne.toString());
			views.add(yearView);
		}
		
		List<RecGPFEntry> recentries=employeeDao.getMonthlyRecGPFEntries(per_no, month);
		for (Iterator iterator = recentries.iterator(); iterator.hasNext();) {
			RecGPFEntry entry = (RecGPFEntry) iterator.next();
			EmployeeYearView yearView=new EmployeeYearView();				
			yearView.setMth_year(dateFormat.format(entry.getUpdated()));
			yearView.setAdv("0");
			yearView.setRec(entry.getGpf_arr_rec());
			yearView.setSubs("0");
			yearView.setWithdrawal("0");
			BigDecimal ne=BigDecimal.ZERO;
			BigDecimal adv=new BigDecimal(entry.getGpf_arr_rec());
			ne=ne.add(adv);
			yearView.setNe(ne.toString());
			yearView.setProg_total(ne.toString());
			views.add(yearView);
		}
		
		List<WiDrGPFEntry> widientries=employeeDao.getMonthlyWiDrGPFEntries(per_no, month);
		for (Iterator iterator = widientries.iterator(); iterator.hasNext();) {
			WiDrGPFEntry entry = (WiDrGPFEntry) iterator.next();
			EmployeeYearView yearView=new EmployeeYearView();				
			yearView.setMth_year(dateFormat.format(entry.getUpdated()));
			yearView.setAdv("0");
			yearView.setRec("0");
			yearView.setSubs("0");
			yearView.setWithdrawal(entry.getWithdraw());
			BigDecimal ne=BigDecimal.ZERO;
			BigDecimal adv=new BigDecimal(entry.getWithdraw());
			ne=ne.subtract(adv);
			yearView.setNe(ne.toString());
			yearView.setProg_total(ne.toString());
			views.add(yearView);
		}
		Collections.sort(views);
		BigDecimal opening=BigDecimal.ZERO;
		if(openingAmt==null){			
			List<EmployeeYearView> yeView=getYearView(per_no,QueryUtil.getYear(month));
			for (Iterator iterator = yeView.iterator(); iterator.hasNext();) {
				EmployeeYearView employeeYearView = (EmployeeYearView) iterator.next();			
				if(employeeYearView.getMth_year().equals(month)){
					opening=new BigDecimal(employeeYearView.getOpening());				
				}				
			}			
		}else{
			opening=new BigDecimal(openingAmt);
		}
		for (Iterator iterator = views.iterator(); iterator.hasNext();) {
			EmployeeYearView view = (EmployeeYearView) iterator.next();
			BigDecimal ne=new BigDecimal(view.getNe());
			opening=opening.add(ne);
			view.setProg_total(opening.toString());
		}
		return views;
	}
	
	public void addAdvanceToEmployee(Employee emp,String mnth_year,String amount,String authorid,String Remark){
		AdvGPFEntry entry = new AdvGPFEntry();
		entry.setYr_mth(mnth_year);
		entry.setAdvance(amount);
		entry.setAuthorId(authorid);
		entry.setRemark(Remark);
		employeeDao.addAdvance(emp, entry);
	}
	
	
	public void addRecoveryToEmployee(Employee emp,String mnth_year,String amount,String authorid,String Remark){
		RecGPFEntry entry = new RecGPFEntry();
		entry.setYr_mth(mnth_year);
		entry.setGpf_arr_rec(amount);
		entry.setAuthorId(authorid);
		entry.setRemark(Remark);
		employeeDao.addRecovery(emp, entry);
	}
	
	
	public void addWithdrawlToEmployee(Employee emp,String mnth_year,String amount,String authorid,String Remark){
		WiDrGPFEntry entry = new WiDrGPFEntry();
		entry.setYr_mth(mnth_year);
		entry.setWithdraw(amount);
		entry.setAuthorId(authorid);
		entry.setRemark(Remark);
		employeeDao.addWithdrawl(emp, entry);
	}
	
	@Override
	public boolean isOpeningBalanceRequired(String per_no,String year){
		BigDecimal prg=employeeDao.getYearOpeningBal(per_no, year);
		if(prg.equals(BigDecimal.ZERO))
			return true;
		else
			return false;
	}
	
	@Override
	public void addYearOpeningBal(String per_no, String year,String opening){
		if(isOpeningBalanceRequired(per_no,year)){
			employeeDao.setYearOpeningBal(per_no, year, opening);
		}
	}
}
