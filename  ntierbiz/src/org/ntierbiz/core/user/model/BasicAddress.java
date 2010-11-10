package org.ntierbiz.core.user.model;

import org.ntierbiz.core.orm.common.Persistent;



public interface BasicAddress extends Persistent{

	public abstract int getTypeCode();

	public abstract void setTypeCode(int typeCode);

	public abstract String getAddressName();

	public abstract void setAddressName(String addressName);

	public abstract String getAddressNr();

	public abstract void setAddressNr(String addressNr);

	public abstract String getCity();

	public abstract void setCity(String city);

	public abstract String getCountry();

	public abstract void setCountry(String country);

	public abstract String getCountryCode();

	public abstract void setCountryCode(String countryCode);

	public abstract String getCounty();

	public abstract void setCounty(String county);

	public abstract String getPostBox();

	public abstract void setPostBox(String postBox);

	public abstract String getPostalCode();

	public abstract void setPostalCode(String postalCode);

	public abstract String getRegion();

	public abstract void setRegion(String region);

	public abstract String getProvince();

	public abstract void setProvince(String province);

	public abstract String getState();

	public abstract void setState(String state);

	public abstract String getStreet();

	public abstract void setStreet(String street);

	public abstract String getStreet2();

	public abstract void setStreet2(String street2);

	public abstract String getStreetTranscription();

	public abstract void setStreetTranscription(String streetTranscription);

	public abstract String getEmail();

	public abstract void setEmail(String email);

	public abstract String getFax();

	public abstract void setFax(String fax);

	public abstract String getHomePage();

	public abstract void setHomePage(String homePage);

	public abstract String getMobile();

	public abstract void setMobile(String mobile);

	public abstract String getPhoneHome();

	public abstract void setPhoneHome(String phoneHome);

	public abstract String getPhoneBusiness();

	public abstract void setPhoneBusiness(String phoneBusiness);

	public abstract String getPhoneBusinessDirect();

	public abstract void setPhoneBusinessDirect(String phoneBusinessDirect);

	public abstract String getCompanyName();

	public abstract void setCompanyName(String companyName);

	public abstract String getCompanyNameTranscription();

	public abstract void setCompanyNameTranscription(
			String companyNameTranscription);

	public abstract String getFirstName();

	public abstract void setFirstName(String firstName);

	public abstract String getFirstNameTranscription();

	public abstract void setFirstNameTranscription(String firstNameTranscription);

	public abstract String getSecondName();

	public abstract void setSecondName(String secondName);

	public abstract String getHonorific();

	public abstract void setHonorific(String honorific);

	public abstract String getJobTitle();

	public abstract void setJobTitle(String jobTitle);

	public abstract String getLastName();

	public abstract void setLastName(String lastName);

	public abstract String getLastNameTranscription();

	public abstract void setLastNameTranscription(String lastNameTranscription);

	public abstract String getSecondLastName();

	public abstract void setSecondLastName(String secondLastName);

	public abstract String getSuffix();

	public abstract void setSuffix(String suffix);

	public abstract String getTitle();

	public abstract void setTitle(String title);

	public abstract BasicProfile getBasicProfile();
	
	public abstract void setBasicProfile(BasicProfile basicProfile);
}