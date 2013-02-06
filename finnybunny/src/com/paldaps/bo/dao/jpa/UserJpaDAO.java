package com.paldaps.bo.dao.jpa;

import org.springframework.stereotype.Repository;

import com.paldaps.bo.dao.UserDao;
import com.paldaps.bo.entity.user.User;
import com.paldaps.system.core.dao.jpa.GenericJpaDAO;



public class UserJpaDAO extends GenericJpaDAO<User> implements UserDao{


    public User authenticateUser(String username, String password) {
	
	return null;
    }

  
    public User getUserByUsername(String username) {
	
	return null;
    }

}
