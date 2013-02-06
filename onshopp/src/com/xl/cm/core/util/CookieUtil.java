package com.xl.cm.core.util;

import java.util.Date;

import org.tuckey.web.filters.urlrewrite.utils.StringUtils;

import com.google.gson.Gson;
import com.xl.order.core.entity.Order;
import com.xl.order.core.entity.OrderProduct;
import com.xl.order.core.entity.ShoppingCart;
import com.xl.order.core.entity.ShoppingCartProduct;
import com.xl.profile.core.entity.Customer;
import com.xl.system.core.json.GjsonProvider;
import com.xl.system.core.json.GsonExclusionStrategy;
import com.xl.system.core.service.ServiceFactory;
import com.xl.system.core.util.CartUtil;
import com.xl.system.core.util.SpringUtil;

public class CookieUtil {

	public static String getJSONString(Object cart){
		Gson gson =GjsonProvider.createGsonFromBuilder( new GsonExclusionStrategy(null));
		return gson.toJson(cart);
	}
	
	public static ShoppingCart getShoppingCart(String cartJSONString){
		Gson gson = GjsonProvider.createGsonFromBuilder( new GsonExclusionStrategy(null));
		if(StringUtils.isBlank(cartJSONString)){
			return new ShoppingCart();
		}
		return gson.fromJson(cartJSONString, ShoppingCart.class);
	}
	
	public static Order getOrder(String cartJSONString){
		Gson gson = GjsonProvider.createGsonFromBuilder(new GsonExclusionStrategy(null));
		if(StringUtils.isBlank(cartJSONString)){
			return new Order();
		}
		return gson.fromJson(cartJSONString, Order.class);
	}
	
	public static void fillAddress(Order order){
		order.setBillingCity(order.getCustomerCity());
		order.setBillingCountry(order.getBillingCompany());
		order.setBillingEmailAddress(order.getCustomerEmailAddress());
		order.setBillingFirstName(order.getCustomerFirstName());
		order.setBillingLastName(order.getCustomerLastName());
		order.setBillingMobile(order.getCustomerMobile());
		order.setBillingPostcode(order.getCustomerPostcode());
		order.setBillingState(order.getCustomerState());
		order.setBillingStreetAddress(order.getCustomerStreetAddress());
		order.setBillingSuburb(order.getCustomerSuburb());
		order.setBillingTelephone(order.getCustomerTelephone());
		order.setDeliveryCity(order.getCustomerCity());
		order.setDeliveryCountry(order.getDeliveryCompany());
		order.setDeliveryEmailAddress(order.getCustomerEmailAddress());
		order.setDeliveryFirstName(order.getCustomerFirstName());
		order.setDeliveryLastName(order.getCustomerLastName());
		order.setDeliveryMobile(order.getCustomerMobile());
		order.setDeliveryPostcode(order.getCustomerPostcode());
		order.setDeliveryState(order.getCustomerState());
		order.setDeliveryStreetAddress(order.getCustomerStreetAddress());
		order.setDeliverySuburb(order.getCustomerSuburb());
		order.setDeliveryTelephone(order.getCustomerTelephone());
	}

	public static void fillCartProduct(Order order, ShoppingCart shoppingCart) {
	    order.getOrderProducts().clear();
	    for(ShoppingCartProduct product:shoppingCart.getProducts().values()){
		OrderProduct orderProduct=CartUtil.getOrderProduct(product);
		orderProduct.setOrder(order);
		order.getOrderProducts().add(orderProduct);
	    }
	    order.setTotal( CartUtil.getTotalAmount(shoppingCart.getProducts().values()));
	    order.setCurrency("INR ");
	    order.setDatePurchased(new Date());
	}

	public static void doUserRegistration(Order order) {
	    ServiceFactory serviceFactory=(ServiceFactory)SpringUtil.getBean("serviceFactory");
	    Customer user =new Customer();
	    user.setCity(order.getCustomerCity());
	    user.setCountry(order.getBillingCountry());
	    user.setEmail(order.getCustomerEmailAddress());
	    user.setFirstName(order.getCustomerFirstName());
	    user.setLastName(order.getCustomerLastName());
	    user.setMobile(order.getCustomerMobile());
	    user.setPostcode(order.getCustomerPostcode());
	    user.setState(order.getCustomerState());
	    user.setStreetAddress(order.getCustomerStreetAddress());
	    user.setSuburb(order.getCustomerSuburb());
	    user.setTelephone(order.getCustomerTelephone());
	    serviceFactory.getUserService().saveUser(user);
	    
	}
	
	public static void fillOrder(Customer user,Order order) {
	    order.setCustomerCity(user.getCity());
	    order.setCustomerCountry(user.getCountry());
	    order.setCustomerEmailAddress(user.getEmail());
	    order.setCustomerFirstName(user.getFirstName());
	    order.setCustomerLastName(user.getLastName());
	    order.setCustomerMobile(user.getMobile());
	    order.setCustomerPostcode(user.getPostcode());
	    order.setCustomerState(user.getState());
	    order.setCustomerStreetAddress(user.getStreetAddress());
	    order.setCustomerSuburb(user.getSuburb());
	    order.setCustomerTelephone(user.getTelephone());
	    fillAddress(order);
	}
}
