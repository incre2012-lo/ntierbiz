package org.ntierbiz.unit.party.model;

import java.util.Set;

import org.ntierbiz.core.orm.common.PersistentPO;
import org.ntierbiz.unit.category.model.ProductCategory;
import org.ntierbiz.unit.product.model.Product;

public class PartyPO extends PersistentPO implements Party {
	private String partyID;
	private PartyType partyType;
	private String name;
	private String lastName;
	private String telphone;
	private String email;
	private String password;
	private String firstName;
	private PartyContent partyContent;
	private Set<PartyAttribute> partyAttributes;
	private Set<PartyAttribute> sharedPartyAttributes;
	private Set<ProductCategory> standardProductCategories;
	private Set<ProductCategory> localProductCategories;
	private Set<Product> products;
	private Set<Product> sharedProducts;

	public Set<Product> getSharedProducts() {
		return sharedProducts;
	}

	public void setSharedProducts(Set<Product> sharedProducts) {
		this.sharedProducts = sharedProducts;
	}

	public Set<PartyAttribute> getSharedPartyAttributes() {
		return sharedPartyAttributes;
	}

	public void setSharedPartyAttributes(Set<PartyAttribute> sharedPartyAttributes) {
		this.sharedPartyAttributes = sharedPartyAttributes;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ntierbiz.unit.party.model.Party#getPartyID()
	 */
	@Override
	public String getPartyID() {
		return partyID;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ntierbiz.unit.party.model.Party#setPartyID(java.lang.String)
	 */
	@Override
	public void setPartyID(String partyID) {
		this.partyID = partyID;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ntierbiz.unit.party.model.Party#getPartyType()
	 */
	@Override
	public PartyType getPartyType() {
		return partyType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ntierbiz.unit.party.model.Party#setPartyType(org.ntierbiz.unit.party
	 * .model.PartyType)
	 */
	@Override
	public void setPartyType(PartyType partyType) {
		this.partyType = partyType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ntierbiz.unit.party.model.Party#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ntierbiz.unit.party.model.Party#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ntierbiz.unit.party.model.Party#getLastName()
	 */
	@Override
	public String getLastName() {
		return lastName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ntierbiz.unit.party.model.Party#setLastName(java.lang.String)
	 */
	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ntierbiz.unit.party.model.Party#getTelphone()
	 */
	@Override
	public String getTelphone() {
		return telphone;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ntierbiz.unit.party.model.Party#setTelphone(java.lang.String)
	 */
	@Override
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ntierbiz.unit.party.model.Party#getEmail()
	 */
	@Override
	public String getEmail() {
		return email;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ntierbiz.unit.party.model.Party#setEmail(java.lang.String)
	 */
	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ntierbiz.unit.party.model.Party#getPassword()
	 */
	@Override
	public String getPassword() {
		return password;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ntierbiz.unit.party.model.Party#setPassword(java.lang.String)
	 */
	@Override
	public void setPassword(String password) {
		this.password = password;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ntierbiz.unit.party.model.Party#getPartyContent()
	 */
	@Override
	public PartyContent getPartyContent() {
		return partyContent;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ntierbiz.unit.party.model.Party#setPartyContent(org.ntierbiz.unit
	 * .party.model.PartyContent)
	 */
	@Override
	public void setPartyContent(PartyContent partyContent) {
		this.partyContent = partyContent;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ntierbiz.unit.party.model.Party#getPartyAttribute()
	 */
	@Override
	public Set<PartyAttribute> getPartyAttributes() {
		return partyAttributes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ntierbiz.unit.party.model.Party#setPartyAttribute(org.ntierbiz.unit
	 * .party.model.PartyAttribute)
	 */
	@Override
	public void setPartyAttributes(Set<PartyAttribute> partyAttribute) {
		this.partyAttributes = partyAttribute;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ntierbiz.unit.party.model.Party#getStandardProductCategories()
	 */
	@Override
	public Set<ProductCategory> getStandardProductCategories() {
		return standardProductCategories;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ntierbiz.unit.party.model.Party#setStandardProductCategories(java
	 * .util.Set)
	 */
	@Override
	public void setStandardProductCategories(
			Set<ProductCategory> standardProductCategories) {
		this.standardProductCategories = standardProductCategories;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ntierbiz.unit.party.model.Party#getLocalProductCategories()
	 */
	@Override
	public Set<ProductCategory> getLocalProductCategories() {
		return localProductCategories;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ntierbiz.unit.party.model.Party#setLocalProductCategories(java.util
	 * .Set)
	 */
	@Override
	public void setLocalProductCategories(
			Set<ProductCategory> localProductCategories) {
		this.localProductCategories = localProductCategories;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ntierbiz.unit.party.model.Party#getProducts()
	 */
	@Override
	public Set<Product> getProducts() {
		return products;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ntierbiz.unit.party.model.Party#setProducts(java.util.Set)
	 */
	@Override
	public void setProducts(Set<Product> products) {
		this.products = products;
	}

}
