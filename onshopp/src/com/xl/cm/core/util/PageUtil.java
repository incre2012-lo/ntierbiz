package com.xl.cm.core.util;

import com.xl.cm.core.entity.Category;
import com.xl.cm.core.service.CatalogService;

public class PageUtil {

    public static String getCategoryDisplayName(String categoryID){
	Category category =CatalogService.getInstance().getCategory(categoryID);
	if(category==null)
	return categoryID;
	else
	   return category.getTitle(); 
    }
}
