package com.xl.cm.core.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.beanutils.BeanPredicate;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.functors.EqualPredicate;

@XmlRootElement(name = "prices")
@XmlAccessorType(XmlAccessType.FIELD)
public class PriceMgr {

	 @XmlElement(name = "price")
	 protected List<Price> prices;

	public List<Price> getPrices() {
		return prices;
	}

	public void setPrices(List<Price> prices) {
		this.prices = prices;
	}
	 
	public void addPrice(Price price){
		this.prices.add(price);
	}
	 
	public Price createPrice(String id) {
		Price price=new Price();
		price.setPriceID(id);
		return price;
	}
	
	public Price findPrice(String priceID) {
		EqualPredicate nameEqlPredicate = new EqualPredicate(priceID);
		BeanPredicate beanPredicate = new BeanPredicate("priceID", nameEqlPredicate);
		return (Price)CollectionUtils.find(getPrices(), beanPredicate);
	}
	
	public boolean isPrice(String priceID) {
		EqualPredicate nameEqlPredicate = new EqualPredicate(priceID);
		BeanPredicate beanPredicate = new BeanPredicate("priceID", nameEqlPredicate);
		return CollectionUtils.exists(getPrices(), beanPredicate);
	}
}
