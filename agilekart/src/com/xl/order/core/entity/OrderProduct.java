
package com.xl.order.core.entity;


import java.math.BigDecimal;
import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;

import com.xl.system.core.domain.DomainObject;
import com.xl.system.core.json.GsonExclude;


@Entity
@Table(name = "orderproduct")
public class OrderProduct implements DomainObject {
    	private static final long serialVersionUID = 1L;

    	  	
    	@Id @GeneratedValue(generator="system-uuid")
    	@GenericGenerator(name="system-uuid", strategy = "uuid")
    	private String uuid;
    	
    	private Integer version;
    	@GsonExclude
    	@ManyToOne
    	@Cascade({CascadeType.SAVE_UPDATE})
    	@JoinColumn (name="Order_UUID", nullable = false, updatable = false, insertable = false)
    	private Order order;
    	
	private String productID;

	private String productModel;

	private String productName;

	private BigDecimal productPrice;// unit price + [attributes price if any
									// selected]

	private BigDecimal finalPrice;// (unit price + attributes) * quantity

	private BigDecimal productTax;

	private int productQuantity;

	private BigDecimal onetimeCharge;//
	@org.hibernate.annotations.Type(type="true_false") 
	private boolean productIsFree;

	private BigDecimal productSpecialNewPrice;
	private Date productSpecialDateAvailable;
	private Date productSpecialDateExpire;

	
	/**
	 * transiant attributes not saved in the database
	 */

	// product specific attributes for processing the order
	private String taxClassID;
	private int productType;
	@org.hibernate.annotations.Type(type="true_false") 
	private boolean productVirtual;
	@org.hibernate.annotations.Type(type="true_false") 
	private boolean productSubscribtion;
	private BigDecimal productWeight;
	private BigDecimal productLength;
	private BigDecimal productWidth;
	private BigDecimal productHeight;
	private int productQuantityOrderMax = 1;

	private BigDecimal originalProductPrice;
	private BigDecimal soldPrice;

	// Shopping cart transient lines
	private String currency;
	private String errorMessage;
	private String priceErrorMessage;
	private String quantityErrorMessage;
	private String lineID;
	@org.hibernate.annotations.Type(type="true_false") 
	private boolean attributes;
	@org.hibernate.annotations.Type(type="true_false") 
	private boolean shipping;
	
	private String productDescription;
	private String priceFormated;// final price formated
	private String productImage;
	private String priceText;// unit price + attributes displayed in the cart &
								// price submited from JSP
	private String costText;// price + attributes * quantity
	private String attributesLine;
	private String quantityText;
	
	private BigDecimal attributeAdditionalCost;
	private int merchantId;
	
	
	
	public String getProductID() {
	    return productID;
	}
	public void setProductID(String productID) {
	    this.productID = productID;
	}
	public String getProductModel() {
	    return productModel;
	}
	public void setProductModel(String productModel) {
	    this.productModel = productModel;
	}
	public String getProductName() {
	    return productName;
	}
	public void setProductName(String productName) {
	    this.productName = productName;
	}
	public BigDecimal getProductPrice() {
	    return productPrice;
	}
	public void setProductPrice(BigDecimal productPrice) {
	    this.productPrice = productPrice;
	}
	public BigDecimal getFinalPrice() {
	    return finalPrice;
	}
	public void setFinalPrice(BigDecimal finalPrice) {
	    this.finalPrice = finalPrice;
	}
	public BigDecimal getProductTax() {
	    return productTax;
	}
	public void setProductTax(BigDecimal productTax) {
	    this.productTax = productTax;
	}
	public int getProductQuantity() {
	    return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
	    this.productQuantity = productQuantity;
	}
	public BigDecimal getOnetimeCharge() {
	    return onetimeCharge;
	}
	public void setOnetimeCharge(BigDecimal onetimeCharge) {
	    this.onetimeCharge = onetimeCharge;
	}
	public boolean isProductIsFree() {
	    return productIsFree;
	}
	public void setProductIsFree(boolean productIsFree) {
	    this.productIsFree = productIsFree;
	}
	public BigDecimal getProductSpecialNewPrice() {
	    return productSpecialNewPrice;
	}
	public void setProductSpecialNewPrice(BigDecimal productSpecialNewPrice) {
	    this.productSpecialNewPrice = productSpecialNewPrice;
	}
	public Date getProductSpecialDateAvailable() {
	    return productSpecialDateAvailable;
	}
	public void setProductSpecialDateAvailable(Date productSpecialDateAvailable) {
	    this.productSpecialDateAvailable = productSpecialDateAvailable;
	}
	public Date getProductSpecialDateExpire() {
	    return productSpecialDateExpire;
	}
	public void setProductSpecialDateExpire(Date productSpecialDateExpire) {
	    this.productSpecialDateExpire = productSpecialDateExpire;
	}
	public String getTaxClassID() {
	    return taxClassID;
	}
	public void setTaxClassID(String taxClassID) {
	    this.taxClassID = taxClassID;
	}
	public int getProductType() {
	    return productType;
	}
	public void setProductType(int productType) {
	    this.productType = productType;
	}
	public boolean isProductVirtual() {
	    return productVirtual;
	}
	public void setProductVirtual(boolean productVirtual) {
	    this.productVirtual = productVirtual;
	}
	public boolean isProductSubscribtion() {
	    return productSubscribtion;
	}
	public void setProductSubscribtion(boolean productSubscribtion) {
	    this.productSubscribtion = productSubscribtion;
	}
	public BigDecimal getProductWeight() {
	    return productWeight;
	}
	public void setProductWeight(BigDecimal productWeight) {
	    this.productWeight = productWeight;
	}
	public BigDecimal getProductLength() {
	    return productLength;
	}
	public void setProductLength(BigDecimal productLength) {
	    this.productLength = productLength;
	}
	public BigDecimal getProductWidth() {
	    return productWidth;
	}
	public void setProductWidth(BigDecimal productWidth) {
	    this.productWidth = productWidth;
	}
	public BigDecimal getProductHeight() {
	    return productHeight;
	}
	public void setProductHeight(BigDecimal productHeight) {
	    this.productHeight = productHeight;
	}
	public int getProductQuantityOrderMax() {
	    return productQuantityOrderMax;
	}
	public void setProductQuantityOrderMax(int productQuantityOrderMax) {
	    this.productQuantityOrderMax = productQuantityOrderMax;
	}
	public BigDecimal getOriginalProductPrice() {
	    return originalProductPrice;
	}
	public void setOriginalProductPrice(BigDecimal originalProductPrice) {
	    this.originalProductPrice = originalProductPrice;
	}
	public BigDecimal getSoldPrice() {
	    return soldPrice;
	}
	public void setSoldPrice(BigDecimal soldPrice) {
	    this.soldPrice = soldPrice;
	}
	public String getCurrency() {
	    return currency;
	}
	public void setCurrency(String currency) {
	    this.currency = currency;
	}
	public String getErrorMessage() {
	    return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
	    this.errorMessage = errorMessage;
	}
	public String getPriceErrorMessage() {
	    return priceErrorMessage;
	}
	public void setPriceErrorMessage(String priceErrorMessage) {
	    this.priceErrorMessage = priceErrorMessage;
	}
	public String getQuantityErrorMessage() {
	    return quantityErrorMessage;
	}
	public void setQuantityErrorMessage(String quantityErrorMessage) {
	    this.quantityErrorMessage = quantityErrorMessage;
	}
	public String getLineID() {
	    return lineID;
	}
	public void setLineID(String lineID) {
	    this.lineID = lineID;
	}
	public boolean isAttributes() {
	    return attributes;
	}
	public void setAttributes(boolean attributes) {
	    this.attributes = attributes;
	}
	public boolean isShipping() {
	    return shipping;
	}
	public void setShipping(boolean shipping) {
	    this.shipping = shipping;
	}
	public String getProductDescription() {
	    return productDescription;
	}
	public void setProductDescription(String productDescription) {
	    this.productDescription = productDescription;
	}
	public String getPriceFormated() {
	    return priceFormated;
	}
	public void setPriceFormated(String priceFormated) {
	    this.priceFormated = priceFormated;
	}
	public String getProductImage() {
	    return productImage;
	}
	public void setProductImage(String productImage) {
	    this.productImage = productImage;
	}
	public String getPriceText() {
	    return priceText;
	}	
	public void setPriceText(String priceText) {
	    this.priceText = priceText;
	}
	public String getCostText() {
	    return costText;
	}
	public void setCostText(String costText) {
	    this.costText = costText;
	}
	public String getAttributesLine() {
	    return attributesLine;
	}
	public void setAttributesLine(String attributesLine) {
	    this.attributesLine = attributesLine;
	}
	public String getQuantityText() {
	    return quantityText;
	}
	public void setQuantityText(String quantityText) {
	    this.quantityText = quantityText;
	}
	public BigDecimal getAttributeAdditionalCost() {
	    return attributeAdditionalCost;
	}
	public void setAttributeAdditionalCost(BigDecimal attributeAdditionalCost) {
	    this.attributeAdditionalCost = attributeAdditionalCost;
	}
	public int getMerchantId() {
	    return merchantId;
	}
	public void setMerchantId(int merchantId) {
	    this.merchantId = merchantId;
	}
	
	
	public Order getOrder() {
	    return order;
	}
	
	public void setOrder(Order order) {
	    this.order = order;
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
	
}
