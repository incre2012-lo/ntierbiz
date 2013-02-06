package com.xl.cm.catalog.action;

import com.xl.cm.core.action.BaseAction;
import com.xl.cm.core.entity.Content;
import com.xl.system.core.util.ContentUtil;

public class ContentAction  extends BaseAction{
    private String contentID;
    private Content content;
    
    public String getContentID() {
        return contentID;
    }

    
    public void setContentID(String contentID) {
        this.contentID = contentID;
    }
    
    
    public Content getContent() {
        return content;
    }


    public void setContent(Content content) {
        this.content = content;
    }
   
   

    public String details(){
	this.content=ContentUtil.getContent(contentID);
	if(content==null)
	    return INPUT;	
	else    
	    return SUCCESS;	
    }
}
