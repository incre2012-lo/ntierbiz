package com.xl.profile.core.dao;

import com.xl.profile.core.entity.Customer;
import com.xl.system.core.dao.IGenericDAO;
import com.xl.system.core.exception.AuthenticationException;
import com.xl.system.core.exception.EntityNotFoundException;

public interface UserDao extends IGenericDAO<Customer>{

    Customer authenticateUser(String username, String password) throws AuthenticationException;

    Customer getUserByUsername(String username) throws EntityNotFoundException;

}
