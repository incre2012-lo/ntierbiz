package com.xl.cm.catalog.action;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.opensymphony.xwork2.Preparable;
import com.xl.cm.core.action.BaseAction;
import com.xl.cm.core.common.Contants;
import com.xl.cm.core.cookie.CookieBean;
import com.xl.cm.core.cookie.CookieProvider;
import com.xl.cm.core.util.CookieUtil;
import com.xl.order.core.entity.ShoppingCart;
import com.xl.order.core.entity.ShoppingCartProduct;
import com.xl.system.core.util.CartUtil;

public class CartAction extends BaseAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String productID;
	private int quantity;
	private List<ShoppingCartProduct> cartProducts=new ArrayList<ShoppingCartProduct>();
        protected ShoppingCart shoppingCart;
        	
        	public ShoppingCart getShoppingCart() {
        		return shoppingCart;
        	}
        
        	public void setShoppingCart(ShoppingCart shoppingCart) {
        		this.shoppingCart = shoppingCart;
        	}
        	
	
	


	public List<ShoppingCartProduct> getCartProducts() {
		return cartProducts;
	}

	public void setCartProducts(List<ShoppingCartProduct> cartProducts) {
		this.cartProducts = cartProducts;
	}

	
	
	

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String update(){
	    Map<String,ShoppingCartProduct> products=shoppingCart.getProducts();
	    for(ShoppingCartProduct product:cartProducts){
		CartUtil.updateShoppingProduct(products.get(product.getProductID()),product.getProductID(), product.getQuantity());
	    }
	    shoppingCart.update();
	    cookie.remove(Contants.USERCART);
	    session.remove(Contants.USERCART);	
	    return SUCCESS;	
	}

	
	public String show(){
		return SUCCESS;	
	}
	
	public String json(){
		return SUCCESS;	
	}
	
	public String add(){
		Map<String,ShoppingCartProduct> products=shoppingCart.getProducts();
		if(products.containsKey(productID)){
			int quan=	products.get(productID).getQuantity();
			quan=quan+quantity;
			CartUtil.updateShoppingProduct(products.get(productID),productID, quan);
		}else{
			products.put(productID, CartUtil.getShoppingProduct(productID, quantity));
		}
		shoppingCart.update();
		cookie.remove(Contants.USERCART);
		session.remove(Contants.USERCART);
		return SUCCESS;	
	}
	
	public String remove(){
		shoppingCart.getProducts().remove(productID);
		cookie.remove(Contants.USERCART);
		shoppingCart.update();
		session.remove(Contants.USERCART);
		return SUCCESS;	
	}
	
	
	public void prepareUpdate() throws Exception {
		prepareCommon();
	}
	public void prepareAdd() throws Exception {
		prepareCommon();
	}
	public void prepareRemove() throws Exception {
		prepareCommon();
	}
	public void prepareShow() throws Exception {
		prepareCommon();
	}
	
	public void prepareJson() throws Exception {
		prepareCommon();
	}

	public void prepare() throws Exception {
	
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
	
	
	
}
