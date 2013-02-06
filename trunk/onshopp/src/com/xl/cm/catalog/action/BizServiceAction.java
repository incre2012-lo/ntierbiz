package com.xl.cm.catalog.action;

import com.xl.cm.core.action.BaseAction;
import com.xl.cm.core.common.Contants;

import com.xl.profile.core.entity.Customer;
import com.xl.system.core.util.BizServiceUtil;


public class BizServiceAction extends BaseAction{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String pincode;

    private String bidprice;
    private String comments;
    private String productID;
    

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
    
  

    public String getBidprice() {
        return bidprice;
    }

    public void setBidprice(String bidprice) {
        this.bidprice = bidprice;
    }

   
    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String input(){
	return INPUT;
    }
    
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String cod(){
	boolean flag =BizServiceUtil.checkForCOD(pincode);
	 if(flag){
	     addActionMessage("Cash on delivery is available to your address.");  
	     return SUCCESS;
	 }else{
	     addActionMessage("Sorry . Cash on delivery is not available to your address.");  
	     return SUCCESS; 
	 }
	  
    }
    public String homesell(){
	boolean flag =BizServiceUtil.checkForHomeSelling(pincode);
	 if(flag){
	     addActionMessage("Home selling executive service is available to your address.");  
	     return SUCCESS;
	 }else{
	     addActionMessage("Sorry . Home selling executive service is not available to your address.");  
	     return SUCCESS; 
	 }
	  
    }
    
    public String bidpriceInput(){
	Customer user=(Customer)session.get(Contants.USER);	
	 if(user==null){
	     addActionMessage("To get the benefit this service, You need to login or registeration");  
	     return ERROR;
	 }else{
	     return INPUT; 
	 }	  
    }
    public String bidprice(){
	Customer user=(Customer)session.get(Contants.USER);	
	 if(user==null){
	     addActionMessage("To get the benefit this service, You need to login or registeration");  
	     return ERROR;
	 }else{
	    String msg= BizServiceUtil.makeBidPriceEntry(user,bidprice,productID,comments);
	    addActionMessage(msg);
	     return SUCCESS; 
	 }	  
    }
}
