package com.estratg.core.user.dao;

import org.hibernate.Session;

import com.estratg.core.orm.dao.GenericDAO;
import com.estratg.core.user.model.BasicProfilePO;

public interface BasicProfileDAO extends GenericDAO<BasicProfilePO, Long> {
	public void setSession(Session s) ;
}
