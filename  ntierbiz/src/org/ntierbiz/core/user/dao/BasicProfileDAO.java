package org.ntierbiz.core.user.dao;

import org.hibernate.Session;
import org.ntierbiz.core.orm.dao.GenericDAO;
import org.ntierbiz.core.user.model.BasicProfilePO;


public interface BasicProfileDAO extends GenericDAO<BasicProfilePO, Long> {
	public void setSession(Session s) ;
}
