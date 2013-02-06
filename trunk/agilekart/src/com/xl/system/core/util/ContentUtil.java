package com.xl.system.core.util;

import com.xl.cm.core.dao.ContentDAO;
import com.xl.cm.core.entity.Content;

public class ContentUtil {

    public static Content getContent(String contentID){
	ContentDAO contentdao =ContentDAO.getInstance();
	return contentdao.getContentOrNull(contentID);	
    }
}
