package com.estratg.core.user.action;

import java.util.List;

import com.estratg.core.action.common.Constants;
import com.estratg.core.user.mgr.UserMgr;
import com.estratg.core.user.model.BasicAddressPO;
import com.estratg.core.user.model.BasicCredentialsPO;
import com.estratg.core.user.model.BasicProfilePO;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9122597050761048006L;

	private BasicProfilePO basicProfilePO;
	private BasicCredentialsPO basicCredentialsPO;
	private BasicAddressPO basicAddressPO;
	private List<BasicProfilePO> profiles;
	private UserMgr userMgr;
	private String mappedRequest;

		
	/*
	 * Action method : add ,Description: Prepare web page for save, Next action
	 * method: save
	 */
	public String add() {
		setMappedRequest(Constants.SAVE);
		return SUCCESS;
	}

	/*
	 * Action method : save ,Description: Commit INSERT, Next action method: list
	 */
	public String save() {
		userMgr.createUser(basicProfilePO, basicCredentialsPO,basicAddressPO);
		return list();
	}

	/*
	 * Action method : edit ,Description: Prepare web page for update, Next action
	 * method: update
	 */
	public String edit() {
		setMappedRequest(Constants.UPDATE);
		return SUCCESS;
	}

	/*
	 * Action method : update ,Description: Commit UPDATE, Next action method:
	 * list
	 */
	public String update() {
		return list();
	}

	/*
	 * Action method : destroy ,Description: Prepare web page for remove, Next
	 * action method: remove
	 */
	public String destroy() {
		
		setMappedRequest(Constants.REMOVE);
		return SUCCESS;
	}

	/*
	 * Action method : remove ,Description: Commit DELETE, Next action method:
	 * list
	 */
	public String remove() {
		return list();
	}

	/*
	 * Action method : show ,Description: Prepare web page for detail display,
	 * Next action method: list
	 */
	public String show() {
		setMappedRequest(Constants.LIST);
		return SUCCESS;
	}

	/*
	 * Action method : list, Description: Prepare web page for list display, Next
	 * action method: list
	 */
	public String list() {
		profiles = userMgr.getAllProfiles();
		return Constants.LIST;
	}

	/*
	 * Action method : print ,Description: Prepare web page for print, Next action
	 * method: list
	 */
	public String print() {
		return SUCCESS;
	}

	public String getActionName() {
		return "user";
	}

	

	public String getActionMethod() {
		return mappedRequest;
	}

	// when invalid, the request parameter will restore command action
	public void setActionMethod(String method) {
		this.mappedRequest = method;
	}

	// this prepares command for button on initial screen write
	public void setMappedRequest(String actionMethod) {
		this.mappedRequest = getActionName() + "-" + actionMethod;
	}

	public UserMgr getUserMgr() {
		return userMgr;
	}

	public void setUserMgr(UserMgr userMgr) {
		this.userMgr = userMgr;
	}

	public List<BasicProfilePO> getProfiles() {
		return profiles;
	}

	public void setProfiles(List<BasicProfilePO> profiles) {
		this.profiles = profiles;
	}

	public BasicAddressPO getBasicAddressPO() {
		return basicAddressPO;
	}

	public void setBasicAddressPO(BasicAddressPO basicAddressPO) {
		this.basicAddressPO = basicAddressPO;
	}

	public BasicProfilePO getBasicProfilePO() {
		return basicProfilePO;
	}

	public void setBasicProfilePO(BasicProfilePO basicProfilePO) {
		this.basicProfilePO = basicProfilePO;
	}

	public BasicCredentialsPO getBasicCredentialsPO() {
		return basicCredentialsPO;
	}

	public void setBasicCredentialsPO(BasicCredentialsPO basicCredentialsPO) {
		this.basicCredentialsPO = basicCredentialsPO;
	}

}
