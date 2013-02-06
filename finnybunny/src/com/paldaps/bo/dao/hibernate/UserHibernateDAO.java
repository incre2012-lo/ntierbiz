package com.paldaps.bo.dao.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.paldaps.bo.entity.user.User;
import com.paldaps.bo.dao.UserDao;
import com.paldaps.system.core.dao.hibernate.GenericHibernateDAO;
import com.paldaps.system.core.exception.AuthenticationException;
import com.paldaps.system.core.exception.EntityNotFoundException;


@Repository(value = "userDao")
public class UserHibernateDAO extends GenericHibernateDAO<User> implements UserDao{

    
    @Autowired
    public UserHibernateDAO(SessionFactory sessionFactory) {
	super(sessionFactory);
	this.clazz=User.class;
    }


    public User authenticateUser(String username, String password) throws AuthenticationException {
	   @SuppressWarnings("unchecked")
	List<User> validUsers = this.getCurrentSession().createQuery("from " + clazz.getName()+" where email = ? and password = ?")
	   			.setString(0, username).setString(1, password).list();  			
	   			

	        if (validUsers == null || validUsers.size() <= 0)
	            throw new AuthenticationException("No users found");
	
	 return validUsers.get(0);
    }

  
    public User getUserByUsername(String username) throws EntityNotFoundException {
	List<User> users =  this.getCurrentSession().createQuery("from " + clazz.getName()+" where email = ?").setString(0, username).list();	 			
	        if (users == null || users.size() <= 0)
	            throw new EntityNotFoundException("Not person with username " + username + " found");
	        return users.get(0);	
    }

  
}
