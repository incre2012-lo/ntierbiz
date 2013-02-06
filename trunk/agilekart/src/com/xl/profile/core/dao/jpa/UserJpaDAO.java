package com.xl.profile.core.dao.jpa;

import org.springframework.stereotype.Repository;

import com.xl.profile.core.dao.UserDao;
import com.xl.profile.core.entity.Customer;
import com.xl.system.core.dao.jpa.GenericJpaDAO;


public class UserJpaDAO extends GenericJpaDAO<Customer> implements UserDao{


    public Customer authenticateUser(String username, String password) {
	
	return null;
    }

  
    public Customer getUserByUsername(String username) {
	
	return null;
    }

}
