package com.xl.profile.core.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;


import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;

import com.xl.order.core.entity.Order;
import com.xl.system.core.domain.DomainObject;


@Entity
@Table(name = "customer", uniqueConstraints = {
	@UniqueConstraint(columnNames = "email")})

public class Customer implements DomainObject{  
    
    private static final long serialVersionUID = 1L;
   
    	@Id @GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	private String uuid;
    	private String firstName;
	private String lastName;
	private String company;
	private String streetAddress;
	private String suburb;
	private String city;
	private String postcode;
	private String state;
	private String country;
	private String telephone;
	private String mobile;
	private String email;
	private String password;
	private Integer version;
	
	@OneToMany( cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
	@Cascade(org.hibernate.annotations.CascadeType.REPLICATE)
	@JoinColumn(name = "Customer_UUID", nullable=false)
	private Set<Order> orders=new HashSet<Order>();
	
	@OneToMany( cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
	@Cascade(org.hibernate.annotations.CascadeType.REPLICATE)
	@JoinColumn(name = "Customer_UUID", nullable=false)
	private Set<PriceBid> bidPrices=new HashSet<PriceBid>();
	
	public String getFirstName() {
	    return firstName;
	}
	public void setFirstName(String firstName) {
	    this.firstName = firstName;
	}
	public String getLastName() {
	    return lastName;
	}
	public void setLastName(String lastName) {
	    this.lastName = lastName;
	}
	public String getCompany() {
	    return company;
	}
	public void setCompany(String company) {
	    this.company = company;
	}
	public String getStreetAddress() {
	    return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
	    this.streetAddress = streetAddress;
	}
	public String getSuburb() {
	    return suburb;
	}
	public void setSuburb(String suburb) {
	    this.suburb = suburb;
	}
	public String getCity() {
	    return city;
	}
	public void setCity(String city) {
	    this.city = city;
	}
	public String getPostcode() {
	    return postcode;
	}
	public void setPostcode(String postcode) {
	    this.postcode = postcode;
	}
	public String getState() {
	    return state;
	}
	public void setState(String state) {
	    this.state = state;
	}
	public String getCountry() {
	    return country;
	}
	public void setCountry(String country) {
	    this.country = country;
	}
	public String getTelephone() {
	    return telephone;
	}
	public void setTelephone(String telephone) {
	    this.telephone = telephone;
	}
	public String getMobile() {
	    return mobile;
	}
	public void setMobile(String mobile) {
	    this.mobile = mobile;
	}
	public String getEmail() {
	    return email;
	}
	public void setEmail(String email) {
	    this.email = email;
	}
	public String getPassword() {
	    return password;
	}
	public void setPassword(String password) {
	    this.password = password;
	}
	
	
	public String getUuid() {
	    return uuid;
	}
	public void setUuid(String uuid) {
	    this.uuid = uuid;
	}
	
	
	public Set<Order> getOrders() {
	    return orders;
	}
	public void setOrders(Set<Order> orders) {
	    this.orders = orders;
	}
	@Version
	public Integer getVersion() {
	        return version;
	 }
	public void setVersion(Integer version) {
	        this.version = version;
	}
	public Set<PriceBid> getBidPrices() {
	    return bidPrices;
	}
	public void setBidPrices(Set<PriceBid> bidPrices) {
	    this.bidPrices = bidPrices;
	}
	
	
}
