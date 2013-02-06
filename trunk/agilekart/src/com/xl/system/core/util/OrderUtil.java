package com.xl.system.core.util;

import com.xl.order.core.entity.Order;
import com.xl.system.core.service.ServiceFactory;

public class OrderUtil {

    public static Order getOrder(String trackId){
	 ServiceFactory serviceFactory=(ServiceFactory)SpringUtil.getBean("serviceFactory");
	 try {
	    return serviceFactory.getOrderService().findOrderByTrackID(trackId);
	} catch (Exception e) {	  
	}	
	return null;
    }
}
