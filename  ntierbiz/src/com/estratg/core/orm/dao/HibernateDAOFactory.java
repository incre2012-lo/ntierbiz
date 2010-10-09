package com.estratg.core.orm.dao;

import org.hibernate.Session;


import com.estratg.core.orm.util.HibernateUtil;
import com.estratg.core.user.dao.BasicAddressDAO;
import com.estratg.core.user.dao.BasicAddressDAOImpl;
import com.estratg.core.user.dao.BasicCredentialsDAO;
import com.estratg.core.user.dao.BasicCredentialsDAOImpl;
import com.estratg.core.user.dao.BasicProfileDAO;
import com.estratg.core.user.dao.BasicProfileDAOImpl;

public class HibernateDAOFactory extends DAOFactory {
	 
    public BasicAddressDAO getBasicAddressDAO() {
        return (BasicAddressDAO)instantiateDAO(BasicAddressDAOImpl.class);
    }
 
    public BasicCredentialsDAO getBasicCredentialsDAO() {
        return (BasicCredentialsDAO)instantiateDAO(BasicCredentialsDAOImpl.class);
    }
 
    public BasicProfileDAO getBasicProfileDAO() {
        return (BasicProfileDAO)instantiateDAO(BasicProfileDAOImpl.class);
    }
 
   
 
    private GenericHibernateDAO instantiateDAO(Class daoClass) {
        try {
            GenericHibernateDAO dao = (GenericHibernateDAO)daoClass.newInstance();
          //  dao.setSession(getCurrentSession());
            return dao;
        } catch (Exception ex) {
            throw new RuntimeException("Can not instantiate DAO: " + daoClass, ex);
        }
    }
 
    // You could override this if you don't want HibernateUtil for lookup
    protected Session getCurrentSession() {
        return HibernateUtil.getSessionFactory().getCurrentSession();
    }
 
    // Inline concrete DAO implementations with no business-related data access methods.
    // If we use public static nested classes, we can centralize all of them in one source file.
 
   
}
