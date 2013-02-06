package com.xl.profile.core.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.annotations.GenericGenerator;

import com.xl.system.core.domain.DomainObject;

@Entity
@Table(name = "pricebid")
public class PriceBid implements DomainObject{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String uuid;
    private String productID;
    private BigDecimal bidPrice;
    private BigDecimal finalPrice;
    private String comments;
    @org.hibernate.annotations.Type(type="true_false") 
    private boolean active;
    
    
    	public String getUuid() {
	    return uuid;
	}
	
    	public void setUuid(String uuid) {
	    this.uuid = uuid;
	}

	public String getProductID() {
	    return productID;
	}

	public void setProductID(String productID) {
	    this.productID = productID;
	}

	public BigDecimal getBidPrice() {
	    return bidPrice;
	}

	public void setBidPrice(BigDecimal bidPrice) {
	    this.bidPrice = bidPrice;
	}

	public BigDecimal getFinalPrice() {
	    return finalPrice;
	}

	public void setFinalPrice(BigDecimal finalPrice) {
	    this.finalPrice = finalPrice;
	}

	public boolean isActive() {
	    return active;
	}

	public void setActive(boolean active) {
	    this.active = active;
	}

	public String getComments() {
	    return comments;
	}

	public void setComments(String comments) {
	    this.comments = comments;
	}
	
}
