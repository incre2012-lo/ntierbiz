package com.xl.profile.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xl.order.core.entity.Order;
import com.xl.profile.core.dao.UserDao;
import com.xl.profile.core.entity.Customer;
import com.xl.system.core.exception.AuthenticationException;
import com.xl.system.core.exception.EntityNotFoundException;

@Service(value = "userService")
@Transactional
public class UserServiceImpl implements UserService{
   
    private UserDao userDao; 
   
    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    
    

  
    public void saveUser(Customer person) throws DataAccessException {
	userDao.save(person);
    }
    
    public void updateUser(Customer person) throws DataAccessException {
	userDao.update(person);
    }
  
    public void addOrder(Customer person, Order order) throws DataAccessException {
	person=userDao.load(person);
	person.getOrders().add(order);
	userDao.update(person);
    }
    
    public Customer authenticateUser(String username, String password) throws DataAccessException, AuthenticationException {
        return userDao.authenticateUser(username, password);
    }

   
   
    public Customer getUserByUsername(String username) throws DataAccessException, EntityNotFoundException {
        return userDao.getUserByUsername(username);
    }
    
}
