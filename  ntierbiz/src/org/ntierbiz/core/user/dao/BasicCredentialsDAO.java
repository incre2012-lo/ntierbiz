package org.ntierbiz.core.user.dao;

import org.hibernate.Session;
import org.ntierbiz.core.orm.dao.GenericDAO;
import org.ntierbiz.core.user.model.BasicCredentialsPO;




public interface BasicCredentialsDAO extends GenericDAO<BasicCredentialsPO, Long>{
	public void setSession(Session s) ;
}
