package org.ntierbiz.unit.party.model;

import java.util.Set;

import org.ntierbiz.core.orm.common.Persistent;
import org.ntierbiz.unit.category.model.ProductCategory;
import org.ntierbiz.unit.product.model.Product;

public interface Party extends Persistent{
	public abstract String getFirstName();
	
	public abstract void setFirstName(String firstName);
	
	public abstract String getPartyID();

	public abstract void setPartyID(String partyID);

	public abstract PartyType getPartyType();

	public abstract void setPartyType(PartyType partyType);

	public abstract String getName();

	public abstract void setName(String name);

	public abstract String getLastName();

	public abstract void setLastName(String lastName);

	public abstract String getTelphone();

	public abstract void setTelphone(String telphone);

	public abstract String getEmail();

	public abstract void setEmail(String email);

	public abstract String getPassword();

	public abstract void setPassword(String password);

	public abstract PartyContent getPartyContent();

	public abstract void setPartyContent(PartyContent partyContent);

	public abstract Set<PartyAttribute> getPartyAttributes();

	public abstract void setPartyAttributes(Set<PartyAttribute> partyAttribute);

	public abstract Set<ProductCategory> getStandardProductCategories();

	public abstract void setStandardProductCategories(
			Set<ProductCategory> standardProductCategories);

	public abstract Set<ProductCategory> getLocalProductCategories();

	public abstract void setLocalProductCategories(
			Set<ProductCategory> localProductCategories);

	public abstract Set<Product> getProducts();

	public abstract void setProducts(Set<Product> products);
	
	public Set<PartyAttribute> getSharedPartyAttributes();

	public void setSharedPartyAttributes(Set<PartyAttribute> sharedPartyAttributes);
	
	public Set<Product> getSharedProducts();

	public void setSharedProducts(Set<Product> sharedProducts) ;

}