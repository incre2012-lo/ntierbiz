package com.xl.cm.catalog.action;

import com.xl.cm.core.action.BaseAction;
import com.xl.cm.core.common.Contants;
import com.xl.profile.core.entity.Customer;
import com.xl.system.core.util.UserUtil;

public class LoginAction extends BaseAction{

    private static final long serialVersionUID = 1L;
private String username;
   private String password;
   private Customer user;
   
    public String  input(){
	return INPUT;
    }
    
    public String login(){
	user=UserUtil.authenticateUser(username, password);
	 if(user!=null){	     
	     session.put(Contants.USER, user);
	     addActionMessage("You are logged in successfully.");  
	     return SUCCESS;
	 }else{
	     addActionMessage("Invalid username and password.Please try again or click on forget password.");  
	     return INPUT; 
	 }
	  
    }

    public String logout(){
	 session.remove(Contants.USER);
	 addActionMessage("You are logged out successfully.");  
	 return SUCCESS;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Customer getUser() {
        return user;
    }

    public void setUser(Customer user) {
        this.user = user;
    }
  
    
}
