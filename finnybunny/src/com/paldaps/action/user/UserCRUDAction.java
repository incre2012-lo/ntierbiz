package com.paldaps.action.user;



import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.paldaps.bo.entity.user.User;
import com.paldaps.bo.service.ServiceFactory;
import com.paldaps.system.core.action.BaseCRUDAction;
import com.paldaps.system.core.util.SpringUtil;

public class UserCRUDAction extends BaseCRUDAction implements ModelDriven<User>,Preparable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private User user ;
	private String userpermissions;
	private String cfmPassword;
	
	ServiceFactory serviceFactory=(ServiceFactory)SpringUtil.getBean("serviceFactory");
	
	
	public String getUserpermissions() {
		return userpermissions;
	}

	public void setUserpermissions(String userpermissions) {
		this.userpermissions = userpermissions;
	}

	public String[] getDefaultPermissions(){	
		if(StringUtils.isBlank(user.getPermissions()))
		return new String[]{"Org_Report"};
		else
		return user.getPermissions().replaceAll(" ","").split(",");
			
	}
	
	

	

	
	public String getCfmPassword() {
		return cfmPassword;
	}

	public void setCfmPassword(String cfmPassword) {
		this.cfmPassword = cfmPassword;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getUserList() {
		return serviceFactory.getUserService().getUsers();
	}

	

	
	



	public User getModel() {
		return user;
	}
	
	
	public void prepare() throws Exception {
		if(user==null||StringUtils.isBlank(user.getUuid()))
			user=new User();
		else
			user=serviceFactory.getUserService().getUserByID(user.getUuid());
			
	}

	
	public String list(){
		
		return SUCCESS;
	}
	
	public String create(){	
			user.setPermissions(userpermissions);
			serviceFactory.getUserService().saveUser(user);		
		return SUCCESS;
	}
	public String edit(){
		return SUCCESS;
	}
	
	public String update(){		
		user.setPermissions(userpermissions);
		serviceFactory.getUserService().updateUser(user);	
	return SUCCESS;
	}
	
	public String delete()	{
		 serviceFactory.getUserService().deleteUserById(user.getUuid());
		return SUCCESS;
	}
	
		
	public String generatePasswordInput(){		
		return SUCCESS;
	}
	
	public String generatePassword(){
		System.out.println(user.getUuid());
		serviceFactory.getUserService().updateUser(user);	
		return SUCCESS;
	}
	
	
}
