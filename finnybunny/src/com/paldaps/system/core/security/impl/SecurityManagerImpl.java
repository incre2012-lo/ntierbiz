package com.paldaps.system.core.security.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.paldaps.bo.entity.user.User;
import com.paldaps.bo.service.ServiceFactory;
import com.paldaps.system.core.exception.AuthenticationException;
import com.paldaps.system.core.security.SecurityManager;
import com.paldaps.system.core.util.Constants;
import com.paldaps.system.core.util.SpringUtil;

public class SecurityManagerImpl implements SecurityManager {

	@Override
	public Object login(String username, String password) {
		ServiceFactory serviceFactory=(ServiceFactory)SpringUtil.getBean("serviceFactory");
		 try {
			 User user=serviceFactory.getUserService().authenticateUser(username, password);
			 return user.getUuid();
		} catch (DataAccessException e) {
			return null;
		} catch (AuthenticationException e) {
			return null;
		}		
			
	}

}
