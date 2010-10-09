package com.estratg.core.user.model;

import java.sql.Timestamp;
import com.estratg.core.orm.common.PersistentPO;


public class BasicCredentialsPO extends PersistentPO implements BasicCredentials{
	private String login;
	private String password;
	private String passwordReminder;
	private String reminderEmail;
	private String ipRange;
	private String securityQuestion;	
	private Timestamp newPasswordExpiry;
	private int disabledFlag;
	private BasicProfile basicProfile;
	
	
	public BasicProfile getBasicProfile() {
		return basicProfile;
	}
	
	public void setBasicProfile(BasicProfile basicProfile) {
		this.basicProfile = basicProfile;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicCredentials#getLogin()
	 */
	@Override
	public String getLogin() {
		return login;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicCredentials#setLogin(java.lang.String)
	 */
	@Override
	public void setLogin(String login) {
		this.login = login;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicCredentials#getPassword()
	 */
	@Override
	public String getPassword() {
		return password;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicCredentials#setPassword(java.lang.String)
	 */
	@Override
	public void setPassword(String password) {
		this.password = password;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicCredentials#getPasswordReminder()
	 */
	@Override
	public String getPasswordReminder() {
		return passwordReminder;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicCredentials#setPasswordReminder(java.lang.String)
	 */
	@Override
	public void setPasswordReminder(String passwordReminder) {
		this.passwordReminder = passwordReminder;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicCredentials#getReminderEmail()
	 */
	@Override
	public String getReminderEmail() {
		return reminderEmail;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicCredentials#setReminderEmail(java.lang.String)
	 */
	@Override
	public void setReminderEmail(String reminderEmail) {
		this.reminderEmail = reminderEmail;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicCredentials#getIpRange()
	 */
	@Override
	public String getIpRange() {
		return ipRange;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicCredentials#setIpRange(java.lang.String)
	 */
	@Override
	public void setIpRange(String ipRange) {
		this.ipRange = ipRange;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicCredentials#getSecurityQuestion()
	 */
	@Override
	public String getSecurityQuestion() {
		return securityQuestion;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicCredentials#setSecurityQuestion(java.lang.String)
	 */
	@Override
	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicCredentials#getNewPasswordExpiry()
	 */
	@Override
	public Timestamp getNewPasswordExpiry() {
		return newPasswordExpiry;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicCredentials#setNewPasswordExpiry(java.sql.Timestamp)
	 */
	@Override
	public void setNewPasswordExpiry(Timestamp newPasswordExpiry) {
		this.newPasswordExpiry = newPasswordExpiry;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicCredentials#getDisabledFlag()
	 */
	@Override
	public int getDisabledFlag() {
		return disabledFlag;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicCredentials#setDisabledFlag(int)
	 */
	@Override
	public void setDisabledFlag(int disabledFlag) {
		this.disabledFlag = disabledFlag;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicCredentials#getProfile()
	 */

	
	
	
	
}
