package com.estratg.core.user.model;

import java.sql.Timestamp;

import com.estratg.core.orm.common.Persistent;


public interface BasicCredentials extends Persistent{

	public abstract String getLogin();

	public abstract void setLogin(String login);

	public abstract String getPassword();

	public abstract void setPassword(String password);

	public abstract String getPasswordReminder();

	public abstract void setPasswordReminder(String passwordReminder);

	public abstract String getReminderEmail();

	public abstract void setReminderEmail(String reminderEmail);

	public abstract String getIpRange();

	public abstract void setIpRange(String ipRange);

	public abstract String getSecurityQuestion();

	public abstract void setSecurityQuestion(String securityQuestion);

	public abstract Timestamp getNewPasswordExpiry();

	public abstract void setNewPasswordExpiry(Timestamp newPasswordExpiry);

	public abstract int getDisabledFlag();

	public abstract void setDisabledFlag(int disabledFlag);

	public abstract  BasicProfile getBasicProfile();
	
	public abstract void setBasicProfile(BasicProfile basicProfile);

}