package com.paldaps.bo.dao;

import com.paldaps.bo.entity.user.User;
import com.paldaps.system.core.dao.IGenericDAO;
import com.paldaps.system.core.exception.AuthenticationException;
import com.paldaps.system.core.exception.EntityNotFoundException;



public interface UserDao extends IGenericDAO<User>{

    User authenticateUser(String username, String password) throws AuthenticationException;

    User getUserByUsername(String username) throws EntityNotFoundException;

}
