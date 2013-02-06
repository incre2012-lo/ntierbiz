package com.paldaps.action.login;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.paldaps.system.core.action.BaseAction;
import com.paldaps.system.core.util.Constants;

public class LoginAction extends BaseAction implements SessionAware{

	
	protected Map<String, Object> session;
	
	public String index(){		
		return SUCCESS;	
	}
	
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}
	
	public String logout(){
		session.remove(Constants.USER_HANDLE);	
		return SUCCESS;	 
	}
}
