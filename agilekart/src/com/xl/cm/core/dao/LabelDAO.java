package com.xl.cm.core.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanPredicate;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Transformer;
import org.apache.commons.collections.functors.EqualPredicate;
import org.apache.commons.collections.functors.NotPredicate;

import com.xl.cm.core.entity.Label;
import com.xl.cm.core.entity.LabelMgr;
import com.xl.cm.core.entity.Product;
import com.xl.cm.core.entity.ProductLabelAssign;
import com.xl.cm.core.entity.ProductMgr;



import com.xl.cm.core.entity.RelationMgr;
import com.xl.cm.core.mgr.LabelMgrFactory;
import com.xl.cm.core.mgr.ProductMgrFactory;
import com.xl.cm.core.mgr.RelationMgrFactory;


public class LabelDAO {
	private LabelMgr mgr;	
	private RelationMgr relmgr;
	private ProductMgr productmgr;

	public LabelDAO(){
			mgr =LabelMgrFactory.getInstance().getMgr();
			relmgr=RelationMgrFactory.getInstance().getMgr();
			productmgr=ProductMgrFactory.getInstance().getMgr();
	}
	
	public List<Label> getAllLabels(){
		return mgr.getLabels();
	}
	public void persist(){
		LabelMgrFactory.getInstance().persist();
	}
	
	public void addLabel(Label label){	
		if(!mgr.isLabel(label.getLabelID()))
			mgr.addLabel(label);
	}	
	
	public Label getLabel(String labelID ){
		if(!mgr.isLabel(labelID))		
			return mgr.createLabel(labelID);
		else{
			return mgr.findLabel(labelID);
		}			
	}
	
	public List<Product> getLabelProducts(String labelID) {
		List<Product> list=new ArrayList<Product>();
		if(relmgr==null){
			return list;				
		}		
		EqualPredicate nameEqlPredicate = new EqualPredicate(labelID);
		BeanPredicate beanPredicate = new BeanPredicate("labelID", nameEqlPredicate);		
		List <ProductLabelAssign> productLabelAssign=(List<ProductLabelAssign>) CollectionUtils.select(relmgr.getProductLabelsAssign(), beanPredicate);		
		  Transformer transformer = new Transformer( ) {
			  public Object transform(Object object) {
				  ProductLabelAssign  assign = (ProductLabelAssign) object;
				  return productmgr.findProduct(assign.getProductID());
              }
		  };
		  CollectionUtils.collect(productLabelAssign, transformer,list);
		  return (List<Product>)CollectionUtils.select( list,new BeanPredicate("typecode", new NotPredicate(new EqualPredicate("6"))));
	}
	
	
	public void assignLabelToProduct(Label label,Product product){
		relmgr.assignProductLabel(product.getProductID(), label.getLabelID());
		RelationMgrFactory.getInstance().persist();
	}	
	static class LabelDAOHolder{
		private static final LabelDAO _instance=new LabelDAO();
	}
	
	public static LabelDAO getInstance(){
		return LabelDAOHolder._instance;
	}
}
