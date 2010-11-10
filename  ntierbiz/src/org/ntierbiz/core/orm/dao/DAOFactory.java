package org.ntierbiz.core.orm.dao;

import org.ntierbiz.core.user.dao.BasicAddressDAO;
import org.ntierbiz.core.user.dao.BasicCredentialsDAO;
import org.ntierbiz.core.user.dao.BasicProfileDAO;
import org.ntierbiz.unit.category.dao.CategoryAttributeDAO;
import org.ntierbiz.unit.category.dao.CategoryAttributeDAOImpl;
import org.ntierbiz.unit.category.dao.CategoryContentDAO;
import org.ntierbiz.unit.category.dao.CategoryContentDAOImpl;
import org.ntierbiz.unit.category.dao.CategoryTypeDAO;
import org.ntierbiz.unit.category.dao.CategoryTypeDAOImpl;
import org.ntierbiz.unit.category.dao.ProductCategoryDAO;
import org.ntierbiz.unit.category.dao.ProductCategoryDAOImpl;
import org.ntierbiz.unit.party.dao.PartyAttributeDAO;
import org.ntierbiz.unit.party.dao.PartyAttributeDAOImpl;
import org.ntierbiz.unit.party.dao.PartyContentDAO;
import org.ntierbiz.unit.party.dao.PartyContentDAOImpl;
import org.ntierbiz.unit.party.dao.PartyDAO;
import org.ntierbiz.unit.party.dao.PartyDAOImpl;
import org.ntierbiz.unit.party.dao.PartyTypeDAO;
import org.ntierbiz.unit.party.dao.PartyTypeDAOImpl;
import org.ntierbiz.unit.product.dao.ProductDAO;
import org.ntierbiz.unit.product.dao.ProductDAOImpl;

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
    public abstract ProductDAO getProductDAO();
	public abstract PartyDAO getPartyDAO();
	public abstract PartyContentDAO getPartyContentDAO();
	public abstract PartyAttributeDAO getPartyAttributeDAO();
	public abstract PartyTypeDAO getPartyTypeDAO();
	public abstract ProductCategoryDAO getProductCategoryDAO();
	public abstract CategoryContentDAO getCategoryContentDAO();
	public abstract CategoryAttributeDAO getCategoryAttributeDAO();
	public abstract CategoryTypeDAO getCategoryTypeDAO();
 
}
