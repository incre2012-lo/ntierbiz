package com.paldaps.bo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.paldaps.bo.dao.hibernate.BatchJobHibernateDAO;


@Component("serviceFactory")
public class ServiceFactory {

	  private UserService userService;
	  private EmployeeService employeeService;
	  private TempEmployeeService tempEmployeeService;
	  private BatchJobHibernateDAO batchJobHibernateDAO;
	  
	  @Autowired
	  public void setUserService(UserService userService) {
	        this.userService = userService;
	  }
	  
	  public UserService getUserService() {
	        return userService;
	  }

		public EmployeeService getEmployeeService() {
			return employeeService;
		}

	@Autowired
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public TempEmployeeService getTempEmployeeService() {
		return tempEmployeeService;
	}

	@Autowired
	public void setTempEmployeeService(TempEmployeeService tempEmployeeService) {
		this.tempEmployeeService = tempEmployeeService;
	}

	
	public BatchJobHibernateDAO getBatchJobHibernateDAO() {
		return batchJobHibernateDAO;
	}

	@Autowired
	public void setBatchJobHibernateDAO(BatchJobHibernateDAO batchJobHibernateDAO) {
		this.batchJobHibernateDAO = batchJobHibernateDAO;
	}
	  
	  
}
