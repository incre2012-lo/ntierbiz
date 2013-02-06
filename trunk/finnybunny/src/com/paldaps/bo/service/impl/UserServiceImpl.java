package com.paldaps.bo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paldaps.bo.dao.UserDao;
import com.paldaps.bo.entity.user.User;
import com.paldaps.bo.service.UserService;
import com.paldaps.system.core.exception.AuthenticationException;
import com.paldaps.system.core.exception.EntityNotFoundException;


@Service(value = "userService")
@Transactional
public class UserServiceImpl implements UserService{
   
    private UserDao userDao; 
   
    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    
  
    public void saveUser(User person) throws DataAccessException {
    	userDao.save(person);
    }
    
    public void updateUser(User person) throws DataAccessException {
    	userDao.update(person);
    }
  
    public void addPermission(User person) throws DataAccessException {
    	person=userDao.load(person);
    	userDao.update(person);
    }
    
    public User authenticateUser(String username, String password) throws DataAccessException, AuthenticationException {
        return userDao.authenticateUser(username, password);
    }   
   
    public User getUserByUsername(String username) throws DataAccessException, EntityNotFoundException {
        return userDao.getUserByUsername(username);
    }
    
    public List<User> getUsers(){
     return userDao.findAll();
    }
    
    public void deleteUserById(String id){
    	userDao.deleteById(id);
    	
    }
    
    public User getUserByID(String id){
    	return userDao.getById(id);
    }
    
}
