package com.xl.cm.core.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanPredicate;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Transformer;
import org.apache.commons.collections.functors.EqualPredicate;

import com.xl.cm.core.entity.Attribute;
import com.xl.cm.core.entity.AttributeMgr;
import com.xl.cm.core.entity.Product;
import com.xl.cm.core.entity.ProductAttributeAssign;
import com.xl.cm.core.entity.ProductMgr;



import com.xl.cm.core.entity.RelationMgr;
import com.xl.cm.core.mgr.AttributeMgrFactory;
import com.xl.cm.core.mgr.ProductMgrFactory;
import com.xl.cm.core.mgr.RelationMgrFactory;


public class AttributeDAO {
	private AttributeMgr mgr;	
	private RelationMgr relmgr;
	private ProductMgr productmgr;
	
	public AttributeDAO(){
			mgr =AttributeMgrFactory.getInstance().getMgr();
			relmgr=RelationMgrFactory.getInstance().getMgr();
			productmgr=ProductMgrFactory.getInstance().getMgr();
	}
	
	public List<Attribute> getAllAttributes(){
		return mgr.getAttributes();
	}
	public void persist(){
		AttributeMgrFactory.getInstance().persist();
	}
	
	public void addAttribute(Attribute attribute){	
		if(!mgr.isAttribute(attribute.getAttributeID()))
			mgr.addAttribute(attribute);
	}	
	
	public Attribute getAttribute(String attributeID ){
		if(!mgr.isAttribute(attributeID))		
			return mgr.createAttribute(attributeID);
		else{
			return mgr.findAttribute(attributeID);
		}			
	}
	
	
	
	
public List<Product> getAttributeProducts(String attributeID) {
	List<Product> list=new ArrayList<Product>();
	if(relmgr==null){
		return list;				
	}		
	EqualPredicate nameEqlPredicate = new EqualPredicate(attributeID);
	BeanPredicate beanPredicate = new BeanPredicate("attributeID", nameEqlPredicate);		
	List <ProductAttributeAssign> productAttributeAssign=(List<ProductAttributeAssign>) CollectionUtils.select(relmgr.getProductAttributesAssign(), beanPredicate);		
	  Transformer transformer = new Transformer( ) {
		  public Object transform(Object object) {
			  ProductAttributeAssign  assign = (ProductAttributeAssign) object;
			  return productmgr.findProduct(assign.getProductID());
          }
	  };
	  CollectionUtils.collect(productAttributeAssign, transformer,list);
	return list;
}

public void assignAttributeToProduct(Attribute attribute,Product product){
	relmgr.assignProductAttribute(product.getProductID(), attribute.getAttributeID());
	RelationMgrFactory.getInstance().persist();
}
	
	static class AttributeDAOHolder{
		private static final AttributeDAO _instance=new AttributeDAO();
	}
	
	public static AttributeDAO getInstance(){
		return AttributeDAOHolder._instance;
	}
}
