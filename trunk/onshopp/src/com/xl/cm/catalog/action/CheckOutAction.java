package com.xl.cm.catalog.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ModelDriven;
import com.xl.cm.core.action.BaseAction;
import com.xl.cm.core.common.Contants;
import com.xl.cm.core.cookie.CookieBean;
import com.xl.cm.core.util.CookieUtil;
import com.xl.order.core.entity.Order;
import com.xl.profile.core.entity.Customer;
import com.xl.system.core.util.CartUtil;

public class CheckOutAction extends BaseAction implements ModelDriven<Order>{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private Order order;
    private String paymentMethod;
    
    public Order getOrder() {
        return order;
    }


    public void setOrder(Order order) {
        this.order = order;
    }

    	public String show(){
	   session.remove(Contants.USERCHECKOUT);
	   Customer user=(Customer)session.get(Contants.USER);
	       if(user==null)
		   return INPUT;
	       else{
		  CookieUtil.fillOrder(user, order);
		   return SUCCESS;
	       } 
//	    return SUCCESS;	
	}
	public String register(){
	    session.remove(Contants.USERCHECKOUT);
	    return SUCCESS;	
	}

	public String address(){
	    session.remove(Contants.USERCHECKOUT);	
//	    CookieUtil.doUserRegistration(order);
//	    CookieUtil.fillAddress(order);
	    return SUCCESS;	
	}
	
	public String confirm(){
	    session.remove(Contants.USERCHECKOUT);
	    CookieUtil.fillCartProduct(order,shoppingCart);
	    return SUCCESS;	
	}
	
	public String payment(){
	   if(paymentMethod==null)
	       return INPUT;
	    session.remove(Contants.USERCHECKOUT);
	    Customer user=(Customer)session.get(Contants.USER);
	    CartUtil.createOrder(order,user);
	    shoppingCart.clear();
	    return SUCCESS;	
	}
	
	public void prepareShow() throws Exception {
	    String OrderString=(String)session.get(Contants.USERCHECKOUT);
	    setOrder(CookieUtil.getOrder(OrderString));	    
	}
	
	public void prepareRegister() throws Exception {
	    String OrderString=(String)session.get(Contants.USERCHECKOUT);
	    setOrder(CookieUtil.getOrder(OrderString));
	    
	}
	
	public void prepareAddress() throws Exception {
	    String OrderString=(String)session.get(Contants.USERCHECKOUT);
	    setOrder(CookieUtil.getOrder(OrderString));		    
	}

	
	public void prepareConfirm(){
	    String OrderString=(String)session.get(Contants.USERCHECKOUT);
	    setOrder(CookieUtil.getOrder(OrderString));	
	}
	
	public void preparePayment(){
	    String OrderString=(String)session.get(Contants.USERCHECKOUT);
	    setOrder(CookieUtil.getOrder(OrderString));	
	}
	
	@Override
	public Order getModel() {
	    return order;
	}
	
	
	public String getPaymentMethod() {
	    return paymentMethod;
	}


	public void setPaymentMethod(String paymentMethod) {
	    this.paymentMethod = paymentMethod;
	}


	public List<CookieBean> getCookies() {
		session.put(Contants.USERCART, CookieUtil.getJSONString(shoppingCart));
		session.put(Contants.USERCHECKOUT, CookieUtil.getJSONString(order));
		List<CookieBean> cookies = new ArrayList<CookieBean>();
		CookieBean cookie = new CookieBean();
		cookie.setCookieName(Contants.USERCART);
		cookie.setCookieValue(CookieUtil.getJSONString(shoppingCart)); 
		cookie.setPath("/");
		cookies.add(cookie);  
		return cookies;
	}
	
		
	
	
}
