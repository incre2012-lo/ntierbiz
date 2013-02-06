package com.xl.cm.core.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanPredicate;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Transformer;
import org.apache.commons.collections.functors.EqualPredicate;

import com.xl.cm.core.entity.Content;
import com.xl.cm.core.entity.ContentMgr;
import com.xl.cm.core.entity.Product;
import com.xl.cm.core.entity.ProductContentAssign;
import com.xl.cm.core.entity.ProductMgr;



import com.xl.cm.core.entity.RelationMgr;
import com.xl.cm.core.mgr.ContentMgrFactory;
import com.xl.cm.core.mgr.ProductMgrFactory;
import com.xl.cm.core.mgr.RelationMgrFactory;


public class ContentDAO {
	private ContentMgr mgr;	
	private RelationMgr relmgr;
	private ProductMgr productmgr;
	
	public ContentDAO(){
			mgr =ContentMgrFactory.getInstance().getMgr();
			relmgr=RelationMgrFactory.getInstance().getMgr();
			productmgr=ProductMgrFactory.getInstance().getMgr();
	}
	
	public List<Content> getAllContents(){
		return mgr.getContents();
	}
	public void persist(){
		ContentMgrFactory.getInstance().persist();
	}
	
	public void addContent(Content content){	
		if(!mgr.isContent(content.getContentID()))
			mgr.addContent(content);
	}	
	
	public Content getContent(String contentID ){
		if(!mgr.isContent(contentID))		
			return mgr.createContent(contentID);
		else{
			return mgr.findContent(contentID);
		}			
	}
	
	public Content getContentOrNull(String contentID ){
		if(!mgr.isContent(contentID))		
			return null;
		else{
			return mgr.findContent(contentID);
		}			
	}
	public List<Product> getContentProducts(String contentID) {
		List<Product> list=new ArrayList<Product>();
		if(relmgr==null){
			return list;				
		}		
		EqualPredicate nameEqlPredicate = new EqualPredicate(contentID);
		BeanPredicate beanPredicate = new BeanPredicate("contentID", nameEqlPredicate);		
		List <ProductContentAssign> productContentAssign=(List<ProductContentAssign>) CollectionUtils.select(relmgr.getProductContentsAssign(), beanPredicate);		
		  Transformer transformer = new Transformer( ) {
			  public Object transform(Object object) {
				  ProductContentAssign  assign = (ProductContentAssign) object;
				  return productmgr.findProduct(assign.getProductID());
              }
		  };
		  CollectionUtils.collect(productContentAssign, transformer,list);
		return list;
	}
	
	public void assignContentToProduct(Content content,Product product){
		relmgr.assignProductContent(product.getProductID(), content.getContentID());
		RelationMgrFactory.getInstance().persist();
	}
		
	static class ContentDAOHolder{
		private static final ContentDAO _instance=new ContentDAO();
	}
	
	public static ContentDAO getInstance(){
		return ContentDAOHolder._instance;
	}
}
