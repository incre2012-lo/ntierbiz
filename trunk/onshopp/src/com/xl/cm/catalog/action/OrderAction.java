package com.xl.cm.catalog.action;





import org.apache.commons.lang.StringUtils;

import com.xl.cm.core.action.BaseAction;
import com.xl.order.core.entity.Order;
import com.xl.system.core.util.OrderUtil;

public class OrderAction extends BaseAction{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String trackID;
    private Order order;
    
    
    public Order getOrder() {
        return order;
    }


    public void setOrder(Order order) {
        this.order = order;
    }


    public String getTrackID() {
        return trackID;
    }


    public void setTrackID(String trackID) {
        this.trackID = trackID;
    }


    public String status(){
	if(StringUtils.isBlank(trackID)){
	    	return INPUT;
	}
	this.order=OrderUtil.getOrder(trackID);
	if(order!=null){	  
	 String msg=order.getOrderStatus()==1?"Your order is in process":"Your order has been dispatched";
	 addActionMessage(msg);
	 	return SUCCESS;
	}else{
	    	return INPUT;
	}
    }
}
