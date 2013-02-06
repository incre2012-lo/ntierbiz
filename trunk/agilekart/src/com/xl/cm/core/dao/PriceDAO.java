package com.xl.cm.core.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanPredicate;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Transformer;
import org.apache.commons.collections.functors.EqualPredicate;

import com.xl.cm.core.entity.Price;
import com.xl.cm.core.entity.PriceMgr;



import com.xl.cm.core.entity.RelationMgr;
import com.xl.cm.core.mgr.PriceMgrFactory;
import com.xl.cm.core.mgr.RelationMgrFactory;


public class PriceDAO {
	private PriceMgr mgr;	
	private RelationMgr relmgr;
	
	public PriceDAO(){
			mgr =PriceMgrFactory.getInstance().getMgr();
			relmgr=RelationMgrFactory.getInstance().getMgr();
			
	}
	
	public List<Price> getAllPrices(){
		return mgr.getPrices();
	}
	public void persist(){
		PriceMgrFactory.getInstance().persist();
	}
	
	public void addPrice(Price price){	
		if(!mgr.isPrice(price.getPriceID()))
			mgr.addPrice(price);
	}	
	
	public Price getPrice(String priceID ){
		if(!mgr.isPrice(priceID))		
			return mgr.createPrice(priceID);
		else{
			return mgr.findPrice(priceID);
		}			
	}
	
		
	static class PriceDAOHolder{
		private static final PriceDAO _instance=new PriceDAO();
	}
	
	public static PriceDAO getInstance(){
		return PriceDAOHolder._instance;
	}
}
