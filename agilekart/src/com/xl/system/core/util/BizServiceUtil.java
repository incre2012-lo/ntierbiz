package com.xl.system.core.util;

import java.math.BigDecimal;

import org.apache.commons.lang.StringUtils;

import com.xl.profile.core.entity.Customer;
import com.xl.profile.core.entity.PriceBid;
import com.xl.system.core.service.ServiceFactory;

public class BizServiceUtil {

    public static  boolean checkForCOD(String pincode){
	if(pincode.startsWith("11"))
	    return true;
	else 
	    return false;
    }
    
    public static  boolean checkForHomeSelling(String pincode){
	if(pincode.startsWith("11"))
	    return true;
	else 
	    return false;
    }

    public static String makeBidPriceEntry(Customer user, String bidprice, String productID,String comments) {
	String msg="Our executive contact you soon with more applicable price.";
	try {
	    BigDecimal price=new BigDecimal(bidprice);
	    if(StringUtils.isBlank(productID))
		return "sorry for inconvience caused.There are some technical problem.Please try again some other time";
	   PriceBid pricebidz=new PriceBid();
	   pricebidz.setBidPrice(price);
	   pricebidz.setComments(comments);
	   pricebidz.setProductID(productID);
	   user.getBidPrices().add(pricebidz);
	   ServiceFactory serviceFactory=(ServiceFactory)SpringUtil.getBean("serviceFactory");
	   serviceFactory.getUserService().updateUser(user);  
	} catch (Exception e) {
	    msg="Your Price is not valid";
	}
	return msg;
    }
    
   
}
