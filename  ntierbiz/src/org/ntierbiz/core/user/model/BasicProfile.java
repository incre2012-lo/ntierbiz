package org.ntierbiz.core.user.model;

import java.util.Set;

import org.ntierbiz.core.orm.common.Persistent;




public interface BasicProfile extends Persistent{

	public abstract String getCompanyName();

	public abstract void setCompanyName(String companyName);

	public abstract String getDiscription();

	public abstract void setDiscription(String discription);

	public abstract String getLastName();

	public abstract void setLastName(String lastName);

	public abstract String getFirstName();

	public abstract void setFirstName(String firstName);

	public abstract String getKeywords();

	public abstract void setKeywords(String keywords);

	public abstract String getBusinessPartnerNumber();

	public abstract void setBusinessPartnerNumber(String businessPartnerNumber);

	public abstract int getConfirmation();

	public abstract void setConfirmation(int confirmation);

	public abstract int getTypeCode();

	public abstract void setTypeCode(int typeCode);
	
	public abstract BasicCredentials getBasicCredentials();
	
	public abstract void setBasicCredentials(BasicCredentials basicCredentials);
	
	public abstract Set<BasicAddress> getBasicAddresses();
	
	public abstract void setBasicAddresses(Set<BasicAddress> basicAddresses);

}