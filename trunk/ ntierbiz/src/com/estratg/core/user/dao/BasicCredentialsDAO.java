package com.estratg.core.user.dao;

import org.hibernate.Session;

import com.estratg.core.orm.dao.GenericDAO;
import com.estratg.core.user.model.BasicCredentialsPO;



public interface BasicCredentialsDAO extends GenericDAO<BasicCredentialsPO, Long>{
	public void setSession(Session s) ;
}
