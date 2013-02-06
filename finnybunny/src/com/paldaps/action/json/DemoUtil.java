package com.paldaps.action.json;

import java.util.List;

import com.paldaps.bo.entity.emp.TempEmployee;
import com.paldaps.bo.service.ServiceFactory;
import com.paldaps.system.core.util.SpringUtil;

public class DemoUtil {
	
	public static List<TempEmployee> getTempData(Integer pageSize,Integer pageNumber){
		ServiceFactory serviceFactory=(ServiceFactory)SpringUtil.getBean("serviceFactory");
		return serviceFactory.getTempEmployeeService().allTempEmployees(pageSize, pageNumber);		
	}
	public static Integer countTempData(){
		ServiceFactory serviceFactory=(ServiceFactory)SpringUtil.getBean("serviceFactory");
		return serviceFactory.getTempEmployeeService().countAllTempEmployees();		
	}
	
}
