package com.estratg.core.user.model;

import java.util.HashSet;
import java.util.Set;

import com.estratg.core.orm.common.PersistentPO;



public class BasicProfilePO extends PersistentPO implements BasicProfile {
private String companyName;
private String discription;
private String lastName;	
private String firstName;
private String keywords;
private String businessPartnerNumber;
private int confirmation;
private int typeCode;
private BasicCredentials basicCredentials;
private Set<BasicAddress> basicAddresses=new HashSet<BasicAddress>(0);


public BasicCredentials getBasicCredentials() {
	return basicCredentials;
}
public void setBasicCredentials(BasicCredentials basicCredentials) {
	this.basicCredentials = basicCredentials;
}
/* (non-Javadoc)
 * @see com.estratg.core.user.BasicProfile#getCompanyName()
 */
@Override
public String getCompanyName() {
	return companyName;
}
/* (non-Javadoc)
 * @see com.estratg.core.user.BasicProfile#setCompanyName(java.lang.String)
 */
@Override
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
/* (non-Javadoc)
 * @see com.estratg.core.user.BasicProfile#getDiscription()
 */
@Override
public String getDiscription() {
	return discription;
}
/* (non-Javadoc)
 * @see com.estratg.core.user.BasicProfile#setDiscription(java.lang.String)
 */
@Override
public void setDiscription(String discription) {
	this.discription = discription;
}
/* (non-Javadoc)
 * @see com.estratg.core.user.BasicProfile#getLastName()
 */
@Override
public String getLastName() {
	return lastName;
}
/* (non-Javadoc)
 * @see com.estratg.core.user.BasicProfile#setLastName(java.lang.String)
 */
@Override
public void setLastName(String lastName) {
	this.lastName = lastName;
}
/* (non-Javadoc)
 * @see com.estratg.core.user.BasicProfile#getFirstName()
 */
@Override
public String getFirstName() {
	return firstName;
}
/* (non-Javadoc)
 * @see com.estratg.core.user.BasicProfile#setFirstName(java.lang.String)
 */
@Override
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
/* (non-Javadoc)
 * @see com.estratg.core.user.BasicProfile#getKeywords()
 */
@Override
public String getKeywords() {
	return keywords;
}
/* (non-Javadoc)
 * @see com.estratg.core.user.BasicProfile#setKeywords(java.lang.String)
 */
@Override
public void setKeywords(String keywords) {
	this.keywords = keywords;
}
/* (non-Javadoc)
 * @see com.estratg.core.user.BasicProfile#getBusinessPartnerNumber()
 */
@Override
public String getBusinessPartnerNumber() {
	return businessPartnerNumber;
}
/* (non-Javadoc)
 * @see com.estratg.core.user.BasicProfile#setBusinessPartnerNumber(java.lang.String)
 */
@Override
public void setBusinessPartnerNumber(String businessPartnerNumber) {
	this.businessPartnerNumber = businessPartnerNumber;
}
/* (non-Javadoc)
 * @see com.estratg.core.user.BasicProfile#getConfirmation()
 */
@Override
public int getConfirmation() {
	return confirmation;
}
/* (non-Javadoc)
 * @see com.estratg.core.user.BasicProfile#setConfirmation(int)
 */
@Override
public void setConfirmation(int confirmation) {
	this.confirmation = confirmation;
}
/* (non-Javadoc)
 * @see com.estratg.core.user.BasicProfile#getTypeCode()
 */
@Override
public int getTypeCode() {
	return typeCode;
}
/* (non-Javadoc)
 * @see com.estratg.core.user.BasicProfile#setTypeCode(int)
 */
@Override
public void setTypeCode(int typeCode) {
	this.typeCode = typeCode;
}

public Set<BasicAddress> getBasicAddresses() {
	return basicAddresses;
}
public void setBasicAddresses(Set<BasicAddress> basicAddresses) {
	this.basicAddresses = basicAddresses;
}



}
