package com.xl.cm.catalog.action;

import org.apache.commons.lang.StringUtils;

import com.xl.cm.core.action.BaseAction;
import com.xl.cm.core.common.Contants;
import com.xl.profile.core.entity.Customer;
import com.xl.system.core.util.UserUtil;

public class UserAction extends BaseAction{
  
    private static final long serialVersionUID = 1L;
    private Customer user=null;
    
    public String  input(){
	 user=(Customer)session.get(Contants.USER);
	       if(user==null)
		   return INPUT;
	       else{
		   addActionMessage("You are already login. There is no need to register again");
		   return SUCCESS;
	       }   
    }
   
   public String  register(){
       	   if(user==null)
	   return INPUT;
	   String msg=UserUtil.registerUser(user);
	   if(StringUtils.startsWith(msg, SUCCESS)){
	       session.put(Contants.USER, user);
	      addActionMessage(StringUtils.removeStart(msg, SUCCESS+":"));
	       return SUCCESS;
	   }
	   else if(StringUtils.startsWith(msg, INPUT)){
	       addActionMessage(StringUtils.removeStart(msg, INPUT+":"));
	       return INPUT; 
	   }
	   else{
	       addActionError(StringUtils.removeStart(msg, ERROR+":"));
	       return INPUT;  
	   }
	    
    }


    public Customer getUser() {
        return user;
    }
    
    public void setUser(Customer user) {
        this.user = user;
    }
   
   
}
