package org.ntierbiz.core.user.dao;

import org.hibernate.Session;
import org.ntierbiz.core.orm.dao.GenericDAO;
import org.ntierbiz.core.user.model.BasicAddressPO;




public interface BasicAddressDAO extends GenericDAO<BasicAddressPO, Long> {
	public void setSession(Session s) ;
}
