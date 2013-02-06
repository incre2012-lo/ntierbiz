package com.xl.cm.core.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanPredicate;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Transformer;
import org.apache.commons.collections.functors.EqualPredicate;

import com.xl.cm.core.entity.${BigEntity};
import com.xl.cm.core.entity.${BigEntity}Mgr;



import com.xl.cm.core.entity.RelationMgr;
import com.xl.cm.core.mgr.${BigEntity}MgrFactory;
import com.xl.cm.core.mgr.RelationMgrFactory;


public class ${BigEntity}DAO {
	private ${BigEntity}Mgr mgr;	
	private RelationMgr relmgr;
	
	public ${BigEntity}DAO(){
			mgr =${BigEntity}MgrFactory.getInstance().getMgr();
			relmgr=RelationMgrFactory.getInstance().getMgr();
			
	}
	
	public List<${BigEntity}> getAll${BigEntities}(){
		return mgr.get${BigEntities}();
	}
	public void persist(){
		${BigEntity}MgrFactory.getInstance().persist();
	}
	
	public void add${BigEntity}(${BigEntity} ${Entity}){	
		if(!mgr.is${BigEntity}(${Entity}.get${BigEntity}ID()))
			mgr.add${BigEntity}(${Entity});
	}	
	
	public ${BigEntity} get${BigEntity}(String ${Entity}ID ){
		if(!mgr.is${BigEntity}(${Entity}ID))		
			return mgr.create${BigEntity}(${Entity}ID);
		else{
			return mgr.find${BigEntity}(${Entity}ID);
		}			
	}
	
		
	static class ${BigEntity}DAOHolder{
		private static final ${BigEntity}DAO _instance=new ${BigEntity}DAO();
	}
	
	public static ${BigEntity}DAO getInstance(){
		return ${BigEntity}DAOHolder._instance;
	}
}
