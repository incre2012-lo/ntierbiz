package com.xl.system.core.util;

import org.springframework.dao.DataAccessException;

import com.xl.profile.core.entity.Customer;
import com.xl.system.core.exception.AuthenticationException;
import com.xl.system.core.service.ServiceFactory;

public class UserUtil {

    public static String registerUser(Customer user){
	 ServiceFactory serviceFactory=(ServiceFactory)SpringUtil.getBean("serviceFactory");
	 try {
	     user.setPassword("onshopp");
	    serviceFactory.getUserService().saveUser(user);  
	     return "success:Your Account Registered Sucessfully";
	 } catch (DataAccessException e) {
	   return "input:You are already registered with us. Please check your registred email get new password, try login with it.";
	}catch (Exception e) {
	   return "error:Sorry for inconvience caused. There are some technical fault.Our representive will contact you soon";
	}
	
    }
    
    public static Customer authenticateUser(String username,String password){
	 ServiceFactory serviceFactory=(ServiceFactory)SpringUtil.getBean("serviceFactory");
	 	try {
		     return serviceFactory.getUserService().authenticateUser(username, password); 
		 } catch (Exception e) {
		     return null;
		 }
	 	
    }
}
