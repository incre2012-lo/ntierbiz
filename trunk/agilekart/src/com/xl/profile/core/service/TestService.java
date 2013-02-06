package com.xl.profile.core.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.xl.profile.core.entity.Customer;
import com.xl.system.core.exception.AuthenticationException;
import com.xl.system.core.exception.EntityNotFoundException;
import com.xl.system.core.service.ServiceFactory;

@Component("testService")
public class TestService {

    private UserService userService;
    private Customer user;
    
   
    
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    
    public void preMethodSetup() {
	 ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-master.xml");
	 ServiceFactory aServiceFactory=(ServiceFactory)ctx.getBean("serviceFactory");
	user = new Customer();
	user.setFirstName("First112345");
	user.setLastName("Last123415");
	user.setEmail("username12154");
	user.setPassword("goodpassword112345");	
	aServiceFactory.getUserService().saveUser(user);
//	userService.saveUser(user);
    }

    public void testAuthenticationSuccess() throws AuthenticationException, DataAccessException, EntityNotFoundException {

	Customer p = userService.authenticateUser("username1234", "goodpassword1234");
//	p = userService.getUserByUsername("username");
        System.out.println(p.getFirstName());
    }
    
    public static void main(String args[]){
	 ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-master.xml");	   
	TestService demo= (TestService) ctx.getBean("testService");
	    demo.preMethodSetup();
	    try {
		demo.testAuthenticationSuccess();
	    } catch (AuthenticationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    } catch (DataAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    } catch (EntityNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }

		
	}
}
