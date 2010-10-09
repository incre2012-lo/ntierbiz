package com.estratg.core.orm.dao;

import com.estratg.core.user.dao.BasicAddressDAO;
import com.estratg.core.user.dao.BasicCredentialsDAO;
import com.estratg.core.user.dao.BasicProfileDAO;

public abstract class DAOFactory {
	 
    /**
     * Creates a standalone DAOFactory that returns unmanaged DAO
     * beans for use in any environment Hibernate has been configured
     * for. Uses HibernateUtil/SessionFactory and Hibernate context
     * propagation (CurrentSessionContext), thread-bound or transaction-bound,
     * and transaction scoped.
     */
    public static final Class HIBERNATE = HibernateDAOFactory.class;
 
    /**
     * Factory method for instantiation of concrete factories.
     */
    public static DAOFactory instance(Class factory) {
        try {
            return (DAOFactory)factory.newInstance();
        } catch (Exception ex) {
            throw new RuntimeException("Couldn't create DAOFactory: " + factory);
        }
    }
 
    // Add your DAO interfaces here
    public abstract BasicAddressDAO getBasicAddressDAO();
    public abstract BasicCredentialsDAO getBasicCredentialsDAO();
    public abstract BasicProfileDAO getBasicProfileDAO();
  
 
}
