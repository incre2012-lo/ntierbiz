package com.paldaps.action.job;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.mysql.jdbc.StringUtils;
import com.paldaps.bo.entity.emp.AdvGPFEntry;
import com.paldaps.bo.entity.emp.Employee;
import com.paldaps.bo.entity.emp.RecGPFEntry;
import com.paldaps.bo.entity.emp.SubsGPFEntry;
import com.paldaps.bo.entity.emp.TempEmployee;
import com.paldaps.bo.service.ServiceFactory;
import com.paldaps.system.core.util.SpringUtil;

public class PublishUtil {

	public static boolean unlock = true;
	
	public static Employee create(TempEmployee record) {
		Employee emp = new Employee();
		emp.setPer_no(record.getPer_no());
		emp.setCreated(new Date());		
		return emp;
	}

	public static void update(Employee emp, TempEmployee record) {
		emp.setBank_acno(record.getBank_acno());
		emp.setBank_add(record.getBank_add());
		emp.setEmp_name(record.getEmp_name());
		emp.setGpf_ac_no(record.getGpf_ac_no());
		emp.setPan_number(record.getPan_number());
		emp.setRnk_cd(record.getRnk_cd());
		emp.setUpdated(new Date());
		emp.setUnit_cd(record.getUnit_cd());
		if (!StringUtils.isNullOrEmpty(record.getAdvance())&& !"0".equals(record.getAdvance())) {
			AdvGPFEntry entry = new AdvGPFEntry();
			entry.setCreated(new Date());
			entry.setUpdated(new Date());
			entry.setYr_mth(record.getYr_mth());
			entry.setAdvance(record.getAdvance());
			entry.setAuthorId("admin");
			entry.setRemark(record.getLabel());
			entry.setLabel(record.getLabel());
			emp.getAdvGPFEntries().add(entry);
		}
		if (!StringUtils.isNullOrEmpty(record.getGpf_subs())&& !"0".equals(record.getGpf_subs())) {
			SubsGPFEntry entry = new SubsGPFEntry();
			entry.setCreated(new Date());
			entry.setUpdated(new Date());
			entry.setYr_mth(record.getYr_mth());
			entry.setGpf_subs(record.getGpf_subs());
			entry.setAuthorId("admin");
			entry.setRemark(record.getLabel());
			entry.setLabel(record.getLabel());
			emp.getSubsGPFEntries().add(entry);
		}
		if (!StringUtils.isNullOrEmpty(record.getGpf_arr_rec())&& !"0".equals(record.getGpf_arr_rec())) {
			RecGPFEntry entry = new RecGPFEntry();
			entry.setCreated(new Date());
			entry.setUpdated(new Date());
			entry.setYr_mth(record.getYr_mth());
			entry.setGpf_arr_rec(record.getGpf_arr_rec());
			entry.setAuthorId("admin");
			entry.setRemark(record.getLabel());
			entry.setLabel(record.getLabel());
			emp.getRecGPFEntries().add(entry);
		}
	}
	
	public static void doPublish(){
		ServiceFactory serviceFactory = (ServiceFactory) SpringUtil
				.getBean("serviceFactory");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd-HH-mm-ss");
	    String dateToday= dateFormat.format(new Date());
		serviceFactory.getBatchJobHibernateDAO().publishEmployeeRecords(dateToday);
	}


}