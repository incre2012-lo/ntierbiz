package com.xl.cm.core.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanPredicate;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Transformer;
import org.apache.commons.collections.functors.EqualPredicate;

import com.xl.cm.core.entity.Permotion;
import com.xl.cm.core.entity.PermotionMgr;
import com.xl.cm.core.entity.Product;
import com.xl.cm.core.entity.ProductMgr;
import com.xl.cm.core.entity.ProductPermotionAssign;
import com.xl.cm.core.entity.RelationMgr;
import com.xl.cm.core.mgr.PermotionMgrFactory;
import com.xl.cm.core.mgr.ProductMgrFactory;
import com.xl.cm.core.mgr.RelationMgrFactory;


public class PermotionDAO {
	private PermotionMgr mgr;	
	private RelationMgr relmgr;
	private ProductMgr productmgr;
	
	public PermotionDAO(){
			mgr =PermotionMgrFactory.getInstance().getMgr();
			relmgr=RelationMgrFactory.getInstance().getMgr();
			productmgr=ProductMgrFactory.getInstance().getMgr();
	}
	
	public List<Permotion> getAllPermotions(){
		return mgr.getPermotions();
	}
	public void persist(){
		PermotionMgrFactory.getInstance().persist();
	}
	
	public void addPermotion(Permotion permotion){	
		if(!mgr.isPermotion(permotion.getPermotionID()))
			mgr.addPermotion(permotion);
	}	
	
	public Permotion getPermotion(String permotionID ){
		if(!mgr.isPermotion(permotionID))		
			return mgr.createPermotion(permotionID);
		else{
			return mgr.findPermotion(permotionID);
		}			
	}
	
	
	
public List<Product> getPermotionProducts(String permotionID) {
	List<Product> list=new ArrayList<Product>();
	if(relmgr==null){
		return list;				
	}		
	EqualPredicate nameEqlPredicate = new EqualPredicate(permotionID);
	BeanPredicate beanPredicate = new BeanPredicate("permotionID", nameEqlPredicate);		
	List <ProductPermotionAssign> productPermotionAssign=(List<ProductPermotionAssign>) CollectionUtils.select(relmgr.getProductPermotionsAssign(), beanPredicate);		
	  Transformer transformer = new Transformer( ) {
		  public Object transform(Object object) {
			  ProductPermotionAssign  assign = (ProductPermotionAssign) object;
			  return productmgr.findProduct(assign.getProductID());
          }
	  };
	  CollectionUtils.collect(productPermotionAssign, transformer,list);
	return list;
}

public void assignPermotionToProduct(Permotion permotion,Product product){
	relmgr.assignProductPermotion(product.getProductID(), permotion.getPermotionID());
	RelationMgrFactory.getInstance().persist();
}	
	static class PermotionDAOHolder{
		private static final PermotionDAO _instance=new PermotionDAO();
	}
	
	public static PermotionDAO getInstance(){
		return PermotionDAOHolder._instance;
	}
}
