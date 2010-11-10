package org.ntierbiz.unit.party.model;

import org.ntierbiz.core.orm.common.PersistentPO;

public class PartyContentPO extends PersistentPO implements PartyContent  {
private String smallDescription;
private String longDescription;
private String logo;
private String thumbnail;
private String title;
private String image;
private String largeImage;
private String rating;
private String country;
private String province;
private String city;
private String countryCode;
private String pincode;
private String street1;

public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getProvince() {
	return province;
}
public void setProvince(String province) {
	this.province = province;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCountryCode() {
	return countryCode;
}
public void setCountryCode(String countryCode) {
	this.countryCode = countryCode;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
public String getStreet1() {
	return street1;
}
public void setStreet1(String street1) {
	this.street1 = street1;
}
public String getStreet2() {
	return street2;
}
public void setStreet2(String street2) {
	this.street2 = street2;
}
private String street2;
/* (non-Javadoc)
 * @see org.ntierbiz.unit.party.model.PartyContent#getSmallDescription()
 */
@Override
public String getSmallDescription() {
	return smallDescription;
}
/* (non-Javadoc)
 * @see org.ntierbiz.unit.party.model.PartyContent#setSmallDescription(java.lang.String)
 */
@Override
public void setSmallDescription(String smallDescription) {
	this.smallDescription = smallDescription;
}
/* (non-Javadoc)
 * @see org.ntierbiz.unit.party.model.PartyContent#getLongDescription()
 */
@Override
public String getLongDescription() {
	return longDescription;
}
/* (non-Javadoc)
 * @see org.ntierbiz.unit.party.model.PartyContent#setLongDescription(java.lang.String)
 */
@Override
public void setLongDescription(String longDescription) {
	this.longDescription = longDescription;
}
/* (non-Javadoc)
 * @see org.ntierbiz.unit.party.model.PartyContent#getLogo()
 */
@Override
public String getLogo() {
	return logo;
}
/* (non-Javadoc)
 * @see org.ntierbiz.unit.party.model.PartyContent#setLogo(java.lang.String)
 */
@Override
public void setLogo(String logo) {
	this.logo = logo;
}
/* (non-Javadoc)
 * @see org.ntierbiz.unit.party.model.PartyContent#getThumbnail()
 */
@Override
public String getThumbnail() {
	return thumbnail;
}
/* (non-Javadoc)
 * @see org.ntierbiz.unit.party.model.PartyContent#setThumbnail(java.lang.String)
 */
@Override
public void setThumbnail(String thumbnail) {
	this.thumbnail = thumbnail;
}
/* (non-Javadoc)
 * @see org.ntierbiz.unit.party.model.PartyContent#getTitle()
 */
@Override
public String getTitle() {
	return title;
}
/* (non-Javadoc)
 * @see org.ntierbiz.unit.party.model.PartyContent#setTitle(java.lang.String)
 */
@Override
public void setTitle(String title) {
	this.title = title;
}
/* (non-Javadoc)
 * @see org.ntierbiz.unit.party.model.PartyContent#getImage()
 */
@Override
public String getImage() {
	return image;
}
/* (non-Javadoc)
 * @see org.ntierbiz.unit.party.model.PartyContent#setImage(java.lang.String)
 */
@Override
public void setImage(String image) {
	this.image = image;
}
/* (non-Javadoc)
 * @see org.ntierbiz.unit.party.model.PartyContent#getLargeImage()
 */
@Override
public String getLargeImage() {
	return largeImage;
}
/* (non-Javadoc)
 * @see org.ntierbiz.unit.party.model.PartyContent#setLargeImage(java.lang.String)
 */
@Override
public void setLargeImage(String largeImage) {
	this.largeImage = largeImage;
}
/* (non-Javadoc)
 * @see org.ntierbiz.unit.party.model.PartyContent#getRating()
 */
@Override
public String getRating() {
	return rating;
}
/* (non-Javadoc)
 * @see org.ntierbiz.unit.party.model.PartyContent#setRating(java.lang.String)
 */
@Override
public void setRating(String rating) {
	this.rating = rating;
}	

}
