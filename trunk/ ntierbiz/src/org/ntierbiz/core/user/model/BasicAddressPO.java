package org.ntierbiz.core.user.model;

import org.ntierbiz.core.orm.common.PersistentPO;

public class BasicAddressPO extends PersistentPO implements BasicAddress {
	
	private int typeCode;
	private String addressName;
	private String addressNr;	
	private String city;
	private String country;
	private String countryCode;
	private String county;
	private String postBox;
	private String postalCode;
	private String region;
	private String province;
	private String state;
	private String street;
	private String street2;
	private String streetTranscription;
	private String email;
	private String fax;
	private String homePage;
	private String mobile;
	private String phoneHome;
	private String phoneBusiness;
	private String phoneBusinessDirect;
	private String companyName;
	private String companyNameTranscription;
	private String firstName;
	private String firstNameTranscription;
	private String secondName;
	private String honorific;
	private String jobTitle;
	private String lastName;
	private String lastNameTranscription;
	private String secondLastName;	
	private String suffix;
	private String title;
	private BasicProfile basicProfile;
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#getTypeCode()
	 */
	public int getTypeCode() {
		return typeCode;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#setTypeCode(int)
	 */
	public void setTypeCode(int typeCode) {
		this.typeCode = typeCode;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#getAddressName()
	 */
	public String getAddressName() {
		return addressName;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#setAddressName(java.lang.String)
	 */
	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#getAddressNr()
	 */
	public String getAddressNr() {
		return addressNr;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#setAddressNr(java.lang.String)
	 */
	public void setAddressNr(String addressNr) {
		this.addressNr = addressNr;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#getCity()
	 */
	public String getCity() {
		return city;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#setCity(java.lang.String)
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#getCountry()
	 */
	public String getCountry() {
		return country;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#setCountry(java.lang.String)
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#getCountryCode()
	 */
	public String getCountryCode() {
		return countryCode;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#setCountryCode(java.lang.String)
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#getCounty()
	 */
	public String getCounty() {
		return county;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#setCounty(java.lang.String)
	 */
	public void setCounty(String county) {
		this.county = county;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#getPostBox()
	 */
	public String getPostBox() {
		return postBox;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#setPostBox(java.lang.String)
	 */
	public void setPostBox(String postBox) {
		this.postBox = postBox;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#getPostalCode()
	 */
	public String getPostalCode() {
		return postalCode;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#setPostalCode(java.lang.String)
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#getRegion()
	 */
	public String getRegion() {
		return region;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#setRegion(java.lang.String)
	 */
	public void setRegion(String region) {
		this.region = region;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#getProvince()
	 */
	public String getProvince() {
		return province;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#setProvince(java.lang.String)
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#getState()
	 */
	public String getState() {
		return state;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#setState(java.lang.String)
	 */
	public void setState(String state) {
		this.state = state;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#getStreet()
	 */
	public String getStreet() {
		return street;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#setStreet(java.lang.String)
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#getStreet2()
	 */
	public String getStreet2() {
		return street2;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#setStreet2(java.lang.String)
	 */
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#getStreetTranscription()
	 */
	public String getStreetTranscription() {
		return streetTranscription;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#setStreetTranscription(java.lang.String)
	 */
	public void setStreetTranscription(String streetTranscription) {
		this.streetTranscription = streetTranscription;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#getEmail()
	 */
	public String getEmail() {
		return email;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#setEmail(java.lang.String)
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#getFax()
	 */
	public String getFax() {
		return fax;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#setFax(java.lang.String)
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#getHomePage()
	 */
	public String getHomePage() {
		return homePage;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#setHomePage(java.lang.String)
	 */
	public void setHomePage(String homePage) {
		this.homePage = homePage;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#getMobile()
	 */
	public String getMobile() {
		return mobile;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#setMobile(java.lang.String)
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#getPhoneHome()
	 */
	public String getPhoneHome() {
		return phoneHome;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#setPhoneHome(java.lang.String)
	 */
	public void setPhoneHome(String phoneHome) {
		this.phoneHome = phoneHome;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#getPhoneBusiness()
	 */
	public String getPhoneBusiness() {
		return phoneBusiness;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#setPhoneBusiness(java.lang.String)
	 */
	public void setPhoneBusiness(String phoneBusiness) {
		this.phoneBusiness = phoneBusiness;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#getPhoneBusinessDirect()
	 */
	public String getPhoneBusinessDirect() {
		return phoneBusinessDirect;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#setPhoneBusinessDirect(java.lang.String)
	 */
	public void setPhoneBusinessDirect(String phoneBusinessDirect) {
		this.phoneBusinessDirect = phoneBusinessDirect;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#getCompanyName()
	 */
	public String getCompanyName() {
		return companyName;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#setCompanyName(java.lang.String)
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#getCompanyNameTranscription()
	 */
	public String getCompanyNameTranscription() {
		return companyNameTranscription;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#setCompanyNameTranscription(java.lang.String)
	 */
	public void setCompanyNameTranscription(String companyNameTranscription) {
		this.companyNameTranscription = companyNameTranscription;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#getFirstName()
	 */
	public String getFirstName() {
		return firstName;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#setFirstName(java.lang.String)
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#getFirstNameTranscription()
	 */
	public String getFirstNameTranscription() {
		return firstNameTranscription;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#setFirstNameTranscription(java.lang.String)
	 */
	public void setFirstNameTranscription(String firstNameTranscription) {
		this.firstNameTranscription = firstNameTranscription;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#getSecondName()
	 */
	public String getSecondName() {
		return secondName;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#setSecondName(java.lang.String)
	 */
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#getHonorific()
	 */
	public String getHonorific() {
		return honorific;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#setHonorific(java.lang.String)
	 */
	public void setHonorific(String honorific) {
		this.honorific = honorific;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#getJobTitle()
	 */
	public String getJobTitle() {
		return jobTitle;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#setJobTitle(java.lang.String)
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#getLastName()
	 */
	public String getLastName() {
		return lastName;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#setLastName(java.lang.String)
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#getLastNameTranscription()
	 */
	public String getLastNameTranscription() {
		return lastNameTranscription;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#setLastNameTranscription(java.lang.String)
	 */
	public void setLastNameTranscription(String lastNameTranscription) {
		this.lastNameTranscription = lastNameTranscription;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#getSecondLastName()
	 */
	public String getSecondLastName() {
		return secondLastName;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#setSecondLastName(java.lang.String)
	 */
	public void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#getSuffix()
	 */
	public String getSuffix() {
		return suffix;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#setSuffix(java.lang.String)
	 */
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#getTitle()
	 */
	public String getTitle() {
		return title;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#setTitle(java.lang.String)
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.user.BasicAddress#getBasicProfiles()
	 */
	
	public BasicProfile getBasicProfile() {
		return basicProfile;
	}
	public void setBasicProfile(BasicProfile basicProfile) {
		this.basicProfile = basicProfile;
	}
	
}
