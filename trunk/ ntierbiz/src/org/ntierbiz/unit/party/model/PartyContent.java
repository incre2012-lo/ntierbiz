package org.ntierbiz.unit.party.model;

public interface PartyContent {

	public abstract String getCountry();

	public abstract void setCountry(String country);

	public abstract String getProvince();

	public abstract void setProvince(String province);

	public abstract String getCity();

	public abstract void setCity(String city);

	public abstract String getCountryCode();

	public abstract void setCountryCode(String countryCode);

	public abstract String getPincode();

	public abstract void setPincode(String pincode);

	public abstract String getStreet1();

	public abstract void setStreet1(String street1);

	public abstract String getStreet2();

	public abstract void setStreet2(String street2);

	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.party.model.PartyContent#getSmallDescription()
	 */
	public abstract String getSmallDescription();

	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.party.model.PartyContent#setSmallDescription(java.lang.String)
	 */
	public abstract void setSmallDescription(String smallDescription);

	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.party.model.PartyContent#getLongDescription()
	 */
	public abstract String getLongDescription();

	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.party.model.PartyContent#setLongDescription(java.lang.String)
	 */
	public abstract void setLongDescription(String longDescription);

	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.party.model.PartyContent#getLogo()
	 */
	public abstract String getLogo();

	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.party.model.PartyContent#setLogo(java.lang.String)
	 */
	public abstract void setLogo(String logo);

	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.party.model.PartyContent#getThumbnail()
	 */
	public abstract String getThumbnail();

	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.party.model.PartyContent#setThumbnail(java.lang.String)
	 */
	public abstract void setThumbnail(String thumbnail);

	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.party.model.PartyContent#getTitle()
	 */
	public abstract String getTitle();

	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.party.model.PartyContent#setTitle(java.lang.String)
	 */
	public abstract void setTitle(String title);

	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.party.model.PartyContent#getImage()
	 */
	public abstract String getImage();

	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.party.model.PartyContent#setImage(java.lang.String)
	 */
	public abstract void setImage(String image);

	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.party.model.PartyContent#getLargeImage()
	 */
	public abstract String getLargeImage();

	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.party.model.PartyContent#setLargeImage(java.lang.String)
	 */
	public abstract void setLargeImage(String largeImage);

	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.party.model.PartyContent#getRating()
	 */
	public abstract String getRating();

	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.party.model.PartyContent#setRating(java.lang.String)
	 */
	public abstract void setRating(String rating);

}