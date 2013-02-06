package com.xl.cm.core.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.struts2.interceptor.CookiesAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import com.xl.cm.core.common.Contants;
import com.xl.cm.core.cookie.CookieBean;
import com.xl.cm.core.cookie.CookieProvider;
import com.xl.cm.core.util.CookieUtil;
import com.xl.order.core.entity.ShoppingCart;

public class BaseAction extends ActionSupport implements CookiesAware,SessionAware,RequestAware, Preparable,CookieProvider {
	protected Map<String, String> cookie;
	protected Map<String, Object> session;
	protected Map<String, Object> request;  
	protected ShoppingCart shoppingCart;
	
	
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	
	@Override
	public void setCookiesMap(Map<String, String> cookie) {
		this.cookie=cookie;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}
	
	
	
	

	@Override
	public void prepare() throws Exception {
	    prepareCommon() ;
	}
	
	public void prepareCommon() throws Exception {
		String userCartCookie="";
		if(cookie!=null){
		userCartCookie= cookie.get(Contants.USERCART);		
		}
		if(StringUtils.isBlank(userCartCookie))
			userCartCookie=(String)session.get(Contants.USERCART);
		setShoppingCart(CookieUtil.getShoppingCart(userCartCookie));
		
	}
	
	@Override
	public List<CookieBean> getCookies() {
		session.put(Contants.USERCART, CookieUtil.getJSONString(shoppingCart));
		List<CookieBean> cookies = new ArrayList<CookieBean>();
		CookieBean cookie = new CookieBean();
		cookie.setCookieName(Contants.USERCART);
		cookie.setCookieValue(CookieUtil.getJSONString(shoppingCart)); 
		cookie.setPath("/");
		cookies.add(cookie);  
		return cookies;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
	    this.request=request;
	}
	
	
}
