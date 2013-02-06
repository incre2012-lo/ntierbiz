package com.xl.profile.core.service;

import org.springframework.dao.DataAccessException;

import com.xl.order.core.entity.Order;
import com.xl.profile.core.entity.Customer;
import com.xl.system.core.exception.AuthenticationException;
import com.xl.system.core.exception.EntityNotFoundException;


public interface UserService {

    void saveUser(Customer user) throws DataAccessException;
    
    void updateUser(Customer user) throws DataAccessException;
    
    void addOrder(Customer person, Order order) throws DataAccessException ;

    Customer authenticateUser(String string, String string2) throws DataAccessException, AuthenticationException;

    Customer getUserByUsername(String string) throws DataAccessException, EntityNotFoundException;

}
