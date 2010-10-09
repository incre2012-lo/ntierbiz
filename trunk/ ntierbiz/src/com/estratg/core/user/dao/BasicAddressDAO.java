package com.estratg.core.user.dao;

import org.hibernate.Session;

import com.estratg.core.orm.dao.GenericDAO;
import com.estratg.core.user.model.BasicAddressPO;



public interface BasicAddressDAO extends GenericDAO<BasicAddressPO, Long> {
	public void setSession(Session s) ;
}
