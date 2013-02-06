
package com.xl.order.core.entity;


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;

import com.xl.profile.core.entity.Customer;
import com.xl.system.core.domain.DomainObject;
import com.xl.system.core.json.GsonExclude;



@Entity
@Table(name = "orders")
public class Order implements DomainObject{

    private static final long serialVersionUID = 1L;

    	@Id @GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	private String uuid;
    	
    	@GsonExclude
    	@ManyToOne(fetch=FetchType.EAGER)
    	@JoinColumn (name="Customer_UUID", nullable = false, updatable = false, insertable = false)
    	private Customer customer;
    	
	private String trackID;
    	
    	private Integer version;
    	


	private String customerFirstName;
	private String customerLastName;
	private String customerCompany;
	private String customerStreetAddress;
	private String customerSuburb;
	private String customerCity;
	private String customerPostcode;
	private String customerState;
	private String customerCountry;
	private String customerTelephone;
	private String customerMobile;
	private String customerEmailAddress;

	private String deliveryFirstName;
	private String deliveryLastName;
	private String deliveryCompany;
	private String deliveryStreetAddress;
	private String deliverySuburb;
	private String deliveryCity;
	private String deliveryPostcode;
	private String deliveryState;
	private String deliveryCountry;
	private String deliveryTelephone;
	private String deliveryMobile;
	private String deliveryEmailAddress;

	private String billingFirstName;
	private String billingLastName;
	private String billingCompany;
	private String billingStreetAddress;
	private String billingSuburb;
	private String billingCity;
	private String billingPostcode;
	private String billingState;
	private String billingCountry;
	private String billingTelephone;
	private String billingMobile;
	private String billingEmailAddress;

	private String paymentMethod;

	private String shippingMethod;
	
	private String couponCode;
	private Date lastModified;
	private Date datePurchased;
	private int orderStatus;
	private Date orderDateFinished;
	private String currency;
	private BigDecimal currencyValue;
	private BigDecimal total;
	private BigDecimal orderTax;
	private String ipAddress;
	private int merchantID;
	private String cardType;
	private String ccOwner;
	private String ccNumber;
	private String ccExpires;
	private String ccCvv;
	@org.hibernate.annotations.Type(type="true_false") 
	private boolean displayInvoicePayments;
	
	
	@OneToMany( cascade = {CascadeType.PERSIST, CascadeType.MERGE},fetch=FetchType.EAGER )
	@Cascade(org.hibernate.annotations.CascadeType.REPLICATE)
	@JoinColumn(name = "Order_UUID", nullable=false)
	private java.util.Set<OrderProduct> orderProducts=new HashSet<OrderProduct>();
	
	
	
	
	public Customer getCustomer() {
	    return customer;
	}
	public void setCustomer(Customer customer) {
	    this.customer = customer;
	}
	
	public String getCustomerCompany() {
	    return customerCompany;
	}
	public void setCustomerCompany(String customerCompany) {
	    this.customerCompany = customerCompany;
	}
	public String getCustomerStreetAddress() {
	    return customerStreetAddress;
	}
	public void setCustomerStreetAddress(String customerStreetAddress) {
	    this.customerStreetAddress = customerStreetAddress;
	}
	public String getCustomerSuburb() {
	    return customerSuburb;
	}
	public void setCustomerSuburb(String customerSuburb) {
	    this.customerSuburb = customerSuburb;
	}
	public String getCustomerCity() {
	    return customerCity;
	}
	public void setCustomerCity(String customerCity) {
	    this.customerCity = customerCity;
	}
	public String getCustomerPostcode() {
	    return customerPostcode;
	}
	public void setCustomerPostcode(String customerPostcode) {
	    this.customerPostcode = customerPostcode;
	}
	public String getCustomerState() {
	    return customerState;
	}
	public void setCustomerState(String customerState) {
	    this.customerState = customerState;
	}
	public String getCustomerCountry() {
	    return customerCountry;
	}
	public void setCustomerCountry(String customerCountry) {
	    this.customerCountry = customerCountry;
	}
	public String getCustomerTelephone() {
	    return customerTelephone;
	}
	public void setCustomerTelephone(String customerTelephone) {
	    this.customerTelephone = customerTelephone;
	}
	public String getCustomerEmailAddress() {
	    return customerEmailAddress;
	}
	public void setCustomerEmailAddress(String customerEmailAddress) {
	    this.customerEmailAddress = customerEmailAddress;
	}
	public String getDeliveryName() {
	    return deliveryFirstName;
	}
	public void setDeliveryName(String deliveryName) {
	    this.deliveryFirstName = deliveryName;
	}
	public String getDeliveryCompany() {
	    return deliveryCompany;
	}
	public void setDeliveryCompany(String deliveryCompany) {
	    this.deliveryCompany = deliveryCompany;
	}
	public String getDeliveryStreetAddress() {
	    return deliveryStreetAddress;
	}
	public void setDeliveryStreetAddress(String deliveryStreetAddress) {
	    this.deliveryStreetAddress = deliveryStreetAddress;
	}
	public String getDeliverySuburb() {
	    return deliverySuburb;
	}
	public void setDeliverySuburb(String deliverySuburb) {
	    this.deliverySuburb = deliverySuburb;
	}
	public String getDeliveryCity() {
	    return deliveryCity;
	}
	public void setDeliveryCity(String deliveryCity) {
	    this.deliveryCity = deliveryCity;
	}
	public String getDeliveryPostcode() {
	    return deliveryPostcode;
	}
	public void setDeliveryPostcode(String deliveryPostcode) {
	    this.deliveryPostcode = deliveryPostcode;
	}
	public String getDeliveryState() {
	    return deliveryState;
	}
	public void setDeliveryState(String deliveryState) {
	    this.deliveryState = deliveryState;
	}
	public String getDeliveryCountry() {
	    return deliveryCountry;
	}
	public void setDeliveryCountry(String deliveryCountry) {
	    this.deliveryCountry = deliveryCountry;
	}
	public String getBillingName() {
	    return billingFirstName;
	}
	public void setBillingName(String billingName) {
	    this.billingFirstName = billingName;
	}
	public String getBillingCompany() {
	    return billingCompany;
	}
	public void setBillingCompany(String billingCompany) {
	    this.billingCompany = billingCompany;
	}
	public String getBillingStreetAddress() {
	    return billingStreetAddress;
	}
	public void setBillingStreetAddress(String billingStreetAddress) {
	    this.billingStreetAddress = billingStreetAddress;
	}
	public String getBillingSuburb() {
	    return billingSuburb;
	}
	public void setBillingSuburb(String billingSuburb) {
	    this.billingSuburb = billingSuburb;
	}
	public String getBillingCity() {
	    return billingCity;
	}
	public void setBillingCity(String billingCity) {
	    this.billingCity = billingCity;
	}
	public String getBillingPostcode() {
	    return billingPostcode;
	}
	public void setBillingPostcode(String billingPostcode) {
	    this.billingPostcode = billingPostcode;
	}
	public String getBillingState() {
	    return billingState;
	}
	public void setBillingState(String billingState) {
	    this.billingState = billingState;
	}
	public String getBillingCountry() {
	    return billingCountry;
	}
	public void setBillingCountry(String billingCountry) {
	    this.billingCountry = billingCountry;
	}
	public String getPaymentMethod() {
	    return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
	    this.paymentMethod = paymentMethod;
	}
	public String getShippingMethod() {
	    return shippingMethod;
	}
	public void setShippingMethod(String shippingMethod) {
	    this.shippingMethod = shippingMethod;
	}
	public String getCouponCode() {
	    return couponCode;
	}
	public void setCouponCode(String couponCode) {
	    this.couponCode = couponCode;
	}
	public Date getLastModified() {
	    return lastModified;
	}
	public void setLastModified(Date lastModified) {
	    this.lastModified = lastModified;
	}
	public Date getDatePurchased() {
	    return datePurchased;
	}
	public void setDatePurchased(Date datePurchased) {
	    this.datePurchased = datePurchased;
	}
	public int getOrderStatus() {
	    return orderStatus;
	}
	public void setOrderStatus(int orderStatus) {
	    this.orderStatus = orderStatus;
	}
	public Date getOrderDateFinished() {
	    return orderDateFinished;
	}
	public void setOrderDateFinished(Date orderDateFinished) {
	    this.orderDateFinished = orderDateFinished;
	}
	public String getCurrency() {
	    return currency;
	}
	public void setCurrency(String currency) {
	    this.currency = currency;
	}
	public BigDecimal getCurrencyValue() {
	    return currencyValue;
	}
	public void setCurrencyValue(BigDecimal currencyValue) {
	    this.currencyValue = currencyValue;
	}
	public BigDecimal getTotal() {
	    return total;
	}
	public void setTotal(BigDecimal total) {
	    this.total = total;
	}
	public BigDecimal getOrderTax() {
	    return orderTax;
	}
	public void setOrderTax(BigDecimal orderTax) {
	    this.orderTax = orderTax;
	}
	public String getIpAddress() {
	    return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
	    this.ipAddress = ipAddress;
	}
	public int getMerchantID() {
	    return merchantID;
	}
	public void setMerchantID(int merchantID) {
	    this.merchantID = merchantID;
	}
	public String getCardType() {
	    return cardType;
	}
	public void setCardType(String cardType) {
	    this.cardType = cardType;
	}
	public String getCcOwner() {
	    return ccOwner;
	}
	public void setCcOwner(String ccOwner) {
	    this.ccOwner = ccOwner;
	}
	public String getCcNumber() {
	    return ccNumber;
	}
	public void setCcNumber(String ccNumber) {
	    this.ccNumber = ccNumber;
	}
	public String getCcExpires() {
	    return ccExpires;
	}
	public void setCcExpires(String ccExpires) {
	    this.ccExpires = ccExpires;
	}
	public String getCcCvv() {
	    return ccCvv;
	}
	public void setCcCvv(String ccCvv) {
	    this.ccCvv = ccCvv;
	}
	public boolean isDisplayInvoicePayments() {
	    return displayInvoicePayments;
	}
	public void setDisplayInvoicePayments(boolean displayInvoicePayments) {
	    this.displayInvoicePayments = displayInvoicePayments;
	}
	
	
	public java.util.Set<OrderProduct> getOrderProducts() {
	    return orderProducts;
	}
	public void setOrderProducts(java.util.Set<OrderProduct> orderProducts) {
	    this.orderProducts = orderProducts;
	}
	
	public String getCustomerFirstName() {
	    return customerFirstName;
	}
	public void setCustomerFirstName(String customerFirstName) {
	    this.customerFirstName = customerFirstName;
	}
	public String getCustomerLastName() {
	    return customerLastName;
	}
	public void setCustomerLastName(String customerLastName) {
	    this.customerLastName = customerLastName;
	}
	public String getDeliveryFirstName() {
	    return deliveryFirstName;
	}
	public void setDeliveryFirstName(String deliveryFirstName) {
	    this.deliveryFirstName = deliveryFirstName;
	}
	public String getBillingFirstName() {
	    return billingFirstName;
	}
	public void setBillingFirstName(String billingFirstName) {
	    this.billingFirstName = billingFirstName;
	}
	public String getDeliveryLastName() {
	    return deliveryLastName;
	}
	public void setDeliveryLastName(String deliveryLastName) {
	    this.deliveryLastName = deliveryLastName;
	}
	public String getBillingLastName() {
	    return billingLastName;
	}
	public void setBillingLastName(String billingLastName) {
	    this.billingLastName = billingLastName;
	}
	public String getCustomerMobile() {
	    return customerMobile;
	}
	public void setCustomerMobile(String customerMobile) {
	    this.customerMobile = customerMobile;
	}
	public String getDeliveryTelephone() {
	    return deliveryTelephone;
	}
	public void setDeliveryTelephone(String deliveryTelephone) {
	    this.deliveryTelephone = deliveryTelephone;
	}
	public String getDeliveryMobile() {
	    return deliveryMobile;
	}
	public void setDeliveryMobile(String deliveryMobile) {
	    this.deliveryMobile = deliveryMobile;
	}
	public String getDeliveryEmailAddress() {
	    return deliveryEmailAddress;
	}
	public void setDeliveryEmailAddress(String deliveryEmailAddress) {
	    this.deliveryEmailAddress = deliveryEmailAddress;
	}
	public String getBillingTelephone() {
	    return billingTelephone;
	}
	public void setBillingTelephone(String billingTelephone) {
	    this.billingTelephone = billingTelephone;
	}
	public String getBillingMobile() {
	    return billingMobile;
	}
	public void setBillingMobile(String billingMobile) {
	    this.billingMobile = billingMobile;
	}
	public String getBillingEmailAddress() {
	    return billingEmailAddress;
	}
	public void setBillingEmailAddress(String billingEmailAddress) {
	    this.billingEmailAddress = billingEmailAddress;
	}
	
	
	
	 
	public String getUuid() {
	    return uuid;
	}
	public void setUuid(String uuid) {
	    this.uuid = uuid;
	}
	@Version
	public Integer getVersion() {
	    return version;
	}
	public void setVersion(Integer version) {
	    this.version = version;
	}
	public String getTrackID() {
	    return trackID;
	}
	public void setTrackID(String trackID) {
	    this.trackID = trackID;
	}
	




}