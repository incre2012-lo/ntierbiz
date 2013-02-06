package com.xl.system.core.csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.apache.commons.lang.text.StrTokenizer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.xl.cm.core.dao.AttributeDAO;
import com.xl.cm.core.dao.CategoryDAO;
import com.xl.cm.core.dao.ContentDAO;
import com.xl.cm.core.dao.LabelDAO;
import com.xl.cm.core.dao.ProductDAO;
import com.xl.cm.core.entity.Attribute;
import com.xl.cm.core.entity.Category;
import com.xl.cm.core.entity.Product;


public class ProcessProductFromCSV {
    
   public static void updateProduct(){
       
   }
  
   public static void intialProduct(LinkedHashMap<String, String> map,int sorder){
       ProductDAO productDAO=ProductDAO.getInstance();
       final Random rnd = new Random(); 
       Product product= new Product();      
       Set rowheader = map.entrySet(); 
       Iterator rowheaderItr = rowheader.iterator(); 
	while(rowheaderItr.hasNext()){ 
		Map.Entry entry = (Map.Entry)rowheaderItr.next();
		String property=entry.getKey().toString();
		String value=entry.getValue().toString().replaceAll(",","").replaceAll("&","").replaceAll("\n","").replaceAll("\t","").replaceAll("\r","").replaceAll("\\b\\s{2,}\\b", " "); 
		if(property.equals("BRAND")){
		    AttributeDAO attrdao=AttributeDAO.getInstance();
		    Attribute attribute= attrdao.getAttribute("brand");
		    attrdao.addAttribute(attribute);
		    attrdao.persist();
		    ProductDAO.getInstance().assignProductToAttributeWithProperty(product, attribute,property,value);	
		}else if (property.equals("Product Code")){
		    product.setSku(value);		  
		    product.setProductID(value+getRandomValue(rnd,1,20));
		}else if (property.equals("Name")){
		  product.setProductImage(value.concat(".jpg"));
		  product.setTitle(value);
		}
		else if (property.equals("Color")){
		    AttributeDAO attrdao=AttributeDAO.getInstance();
		    Attribute attribute= attrdao.getAttribute("color");
		    attrdao.addAttribute(attribute);
		    attrdao.persist();
		    productDAO.assignProductToAttributeWithProperty(product, attribute,property,value);
		}else if (property.equals("Design")){
		    AttributeDAO attrdao=AttributeDAO.getInstance();
		    Attribute attribute= attrdao.getAttribute("design");
		    attrdao.addAttribute(attribute);
		    attrdao.persist();
		    productDAO.assignProductToAttributeWithProperty(product, attribute,property,value);
		}else if (property.equals("MRP")){
		    product.setMrp(new  BigDecimal(value));
		}else if (property.equals("VAT")){
		    product.setVatPercent(value);
		}else if (property.equals("Category")){
		    AttributeDAO attrdao=AttributeDAO.getInstance();
		    Attribute attribute= attrdao.getAttribute("category");
		    attrdao.addAttribute(attribute);
		    attrdao.persist();
		    productDAO.assignProductToAttributeWithProperty(product, attribute,property,value);
		    CategoryDAO catedao=CategoryDAO.getInstance();
		    Category category= catedao.getCategory(value.toLowerCase().replaceAll("\\b\\s{1,}\\b", "-"));
		    category.setParentCategoryID("kitchenware-accessories");
		    category.setTitle(value);
		    catedao.addCategory(category);
		    catedao.persist();
		    productDAO.assignProductToCategory(product, category);		    
		}else if (property.equals("Material")){    
		    AttributeDAO attrdao=AttributeDAO.getInstance();
		    Attribute attribute= attrdao.getAttribute("material");
		    attrdao.addAttribute(attribute);
		    attrdao.persist();
		    productDAO.assignProductToAttributeWithProperty(product, attribute,property,value);
		}else if (property.equals("CAPACITY")){    
		    AttributeDAO attrdao=AttributeDAO.getInstance();
		    Attribute attribute= attrdao.getAttribute("capacity");
		    attrdao.addAttribute(attribute);
		    attrdao.persist();
		    productDAO.assignProductToAttributeWithProperty(product, attribute,property,value);
		}else if (property.equals("Special Feature")){ 
		    AttributeDAO attrdao=AttributeDAO.getInstance();
		    Attribute attribute= attrdao.getAttribute("splfeature");
		    attrdao.addAttribute(attribute);
		    attrdao.persist();
		    productDAO.assignProductToAttributeWithProperty(product, attribute,property,value);
		}else if (property.equals("T/P")){
		    product.setSupplierPrice(new BigDecimal(value));
		}else if (property.equals("CONTENT")){ 
		    AttributeDAO attrdao=AttributeDAO.getInstance();
		    Attribute attribute= attrdao.getAttribute("content");
		    attrdao.addAttribute(attribute);
		    attrdao.persist();
		    productDAO.assignProductToAttributeWithProperty(product, attribute,property,value);
		}else if (property.equals("ITEMS IN CONTENTS")){ 
		    product.setShortDesc(value);
		}else if (property.equals("REMARKS")){ 
		    product.setDesc(value);		    
		}
	}	
	BigDecimal price=product.getSupplierPrice();
	product.setProductPrice(price.multiply(new BigDecimal(1.5),new MathContext(2,RoundingMode.HALF_UP)));
	product.setProductSortOrder(sorder);
	product.setProductStatus(true);
	productDAO.assignProductToLabel(product, LabelDAO.getInstance().getLabel("feature"));
	productDAO.assignProductToContent(product, ContentDAO.getInstance().getContent("ideal"));
	productDAO.addProduct(product);	
   }
   
    public static void execute(String filePath){     
      File importFile =  new File(filePath);
      List<String> header=new ArrayList<String>();
       BufferedReader r;
       try {
	   if (!importFile.exists()){
               throw new FileNotFoundException();
           }
	   r = new BufferedReader(new InputStreamReader(new FileInputStream(importFile)));
	   String line = r.readLine();
	   StrTokenizer strTokenizer = StrTokenizer.getCSVInstance(line);
	  
	        while(strTokenizer.hasNext()){
	            String nextToken = strTokenizer.nextToken();
	            header.add(nextToken);
	        }
	       int sortorder=0;
	       while((line = r.readLine()) != null){
	            LinkedHashMap<String, String> map=new LinkedHashMap<String, String>();
	            	strTokenizer.reset(line);
	            	 int i=0;
	            	 while(strTokenizer.hasNext()){
	 	            String nextToken = strTokenizer.nextToken();
	 	            map.put(header.get(i), nextToken); 
	 	            i++;
	 	        }
	            	  intialProduct(map,sortorder++);	            	
	        }
	        ProductDAO.getInstance().persist(); 
        } catch (Exception e) {
    	e.printStackTrace();
        }
   }
    
    public static String getRandomValue(final Random random, 
	    final int lowerBound, 
	    final int upperBound){ 
	 
	    if(lowerBound < 0 || upperBound <= lowerBound ){ 
	        throw new IllegalArgumentException("Put error message here"); 
	    } 
	 
	    final int dbl = 
	        ((random == null ? new Random() : random).nextInt() // 
	            % (upperBound - lowerBound)) 
	            + lowerBound; 
	    return String.valueOf(dbl); 
	 
	} 

    
    public static void main(String[] args){
	Resource resource = new ClassPathResource("daksh_import.csv"); 
	String xmlFileName;
	try {
		xmlFileName=resource.getFile().getAbsolutePath();
		execute(xmlFileName);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return;
	}
	ProductDAO.getInstance().getAllProducts();
	ProductDAO.getInstance().persist();
    }
    
}
