package com.paldaps.bo.service;

import java.util.List;

import org.springframework.dao.DataAccessException;


import com.paldaps.bo.entity.user.User;
import com.paldaps.system.core.exception.AuthenticationException;
import com.paldaps.system.core.exception.EntityNotFoundException;




public interface UserService {

    void saveUser(User user) throws DataAccessException;
    
    void updateUser(User user) throws DataAccessException;
    
    void addPermission(User user) throws DataAccessException ;

    User authenticateUser(String string, String string2) throws DataAccessException, AuthenticationException;

    User getUserByUsername(String string) throws DataAccessException, EntityNotFoundException;
    List<User> getUsers();
    void deleteUserById(String id);
    User getUserByID(String id);

}
