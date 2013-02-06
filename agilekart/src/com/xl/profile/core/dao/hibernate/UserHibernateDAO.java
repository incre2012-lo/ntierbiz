package com.xl.profile.core.dao.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xl.profile.core.dao.UserDao;
import com.xl.profile.core.entity.Customer;
import com.xl.system.core.dao.hibernate.GenericHibernateDAO;
import com.xl.system.core.exception.AuthenticationException;
import com.xl.system.core.exception.EntityNotFoundException;


@Repository(value = "userDao")
public class UserHibernateDAO extends GenericHibernateDAO<Customer> implements UserDao{

    
    @Autowired
    public UserHibernateDAO(SessionFactory sessionFactory) {
	super(sessionFactory);
	this.clazz=Customer.class;
    }


    public Customer authenticateUser(String username, String password) throws AuthenticationException {
	   @SuppressWarnings("unchecked")
	List<Customer> validUsers = this.getCurrentSession().createQuery("from " + clazz.getName()+" where email = ? and password = ?")
	   			.setString(0, username).setString(1, password).list();  			
	   			

	        if (validUsers == null || validUsers.size() <= 0)
	            throw new AuthenticationException("No users found");
	
	 return validUsers.get(0);
    }

  
    public Customer getUserByUsername(String username) throws EntityNotFoundException {
	List<Customer> users =  this.getCurrentSession().createQuery("from " + clazz.getName()+" where email = ?").setString(0, username).list();	 			
	        if (users == null || users.size() <= 0)
	            throw new EntityNotFoundException("Not person with username " + username + " found");
	        return users.get(0);	
    }

  
}
