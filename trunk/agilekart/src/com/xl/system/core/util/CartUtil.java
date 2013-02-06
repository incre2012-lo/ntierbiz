package com.xl.system.core.util;

import java.math.BigDecimal;

import java.util.Collection;
import java.util.Date;



import com.xl.cm.core.dao.ProductDAO;
import com.xl.cm.core.entity.Product;
import com.xl.order.core.entity.Order;
import com.xl.order.core.entity.OrderProduct;
import com.xl.order.core.entity.ShoppingCartProduct;
import com.xl.profile.core.entity.Customer;
import com.xl.system.core.email.MailProvider;
import com.xl.system.core.service.ServiceFactory;

public class CartUtil {


	
	public static int  getProductCount(Collection<ShoppingCartProduct> products){
		int sum=0;
		for(ShoppingCartProduct product:products){
			sum=sum+ product.getQuantity();
		}
		return sum;		
	}
	
	public static BigDecimal  getTotalAmount(Collection<ShoppingCartProduct> products){
		BigDecimal sum =new BigDecimal(0);
		for(ShoppingCartProduct product:products){
			sum=sum.add(product.getPrice().multiply(new BigDecimal(product.getQuantity())));
		}
		return sum;		
	}
	
	public static ShoppingCartProduct  getShoppingProduct(String productID ,int quantity){
			Product product=ProductDAO.getInstance().getProduct(productID);
			ShoppingCartProduct cartProduct=new ShoppingCartProduct();
			cartProduct.setProductName(product.getTitle());
			cartProduct.setQuantity(quantity);
			cartProduct.setImage(product.getProductImage());
			cartProduct.setProductID(productID);
			cartProduct.setPriceText(product.getFormatHTMLProductPrice());
			cartProduct.setPrice(product.getProductPrice());
			cartProduct.setMainCartLine("INR "+String.valueOf(product.getProductPrice().multiply(new BigDecimal(quantity))));
			return cartProduct;
	}

	public static ShoppingCartProduct  updateShoppingProduct(ShoppingCartProduct cartProduct,String productID ,int quantity){
		Product product=ProductDAO.getInstance().getProduct(productID);
		cartProduct.setProductName(product.getTitle());
		cartProduct.setQuantity(quantity);
		cartProduct.setImage(product.getProductImage());
		cartProduct.setProductID(productID);
		cartProduct.setPriceText(product.getFormatHTMLProductPrice());
		cartProduct.setPrice(product.getProductPrice());
		cartProduct.setMainCartLine("INR "+String.valueOf(product.getProductPrice().multiply(new BigDecimal(quantity))));
		return cartProduct;
	}
	
	public static OrderProduct  getOrderProduct(ShoppingCartProduct cartProduct){
		OrderProduct orderProduct=new OrderProduct();
		orderProduct.setProductID(cartProduct.getProductID());
		orderProduct.setProductQuantity(cartProduct.getQuantity());
		orderProduct.setProductImage(cartProduct.getImage());
		orderProduct.setProductName(cartProduct.getProductName());
		orderProduct.setPriceFormated(cartProduct.getPriceText());
		orderProduct.setPriceText(cartProduct.getMainCartLine());
		orderProduct.setProductPrice(cartProduct.getPrice());
		orderProduct.setFinalPrice(cartProduct.getPrice());
		return orderProduct;
	}
	
	public static  void  createOrder(Order order, Customer user){
	    ServiceFactory serviceFactory=(ServiceFactory)SpringUtil.getBean("serviceFactory");
	    order.setTrackID("OSP"+(new Date()).getTime());
	    order.setOrderStatus(1);
	    serviceFactory.getUserService().addOrder(user, order);
	    MailProvider mailProvider=(MailProvider)SpringUtil.getBean("mailProvider");
	    mailProvider.sendMail("info@onshopp.com", user.getEmail(), "Onshopp.com: Your Order", "Dear " + user.getFirstName()
	                + " "+user.getLastName()
	                + ", thank you for placing order. Your order number is "
	                + order.getTrackID());
	}
}

