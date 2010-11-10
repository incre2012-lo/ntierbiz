package org.ntierbiz.core.orm.dao;

import org.hibernate.Session;
import org.ntierbiz.core.orm.util.HibernateUtil;
import org.ntierbiz.core.user.dao.BasicAddressDAO;
import org.ntierbiz.core.user.dao.BasicAddressDAOImpl;
import org.ntierbiz.core.user.dao.BasicCredentialsDAO;
import org.ntierbiz.core.user.dao.BasicCredentialsDAOImpl;
import org.ntierbiz.core.user.dao.BasicProfileDAO;
import org.ntierbiz.core.user.dao.BasicProfileDAOImpl;
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

public class HibernateDAOFactory extends DAOFactory {

	public BasicAddressDAO getBasicAddressDAO() {
		return (BasicAddressDAO) instantiateDAO(BasicAddressDAOImpl.class);
	}

	public BasicCredentialsDAO getBasicCredentialsDAO() {
		return (BasicCredentialsDAO) instantiateDAO(BasicCredentialsDAOImpl.class);
	}

	public BasicProfileDAO getBasicProfileDAO() {
		return (BasicProfileDAO) instantiateDAO(BasicProfileDAOImpl.class);
	}

	public ProductDAO getProductDAO() {
		return (ProductDAO) instantiateDAO(ProductDAOImpl.class);
	}

	public PartyDAO getPartyDAO() {
		return (PartyDAO) instantiateDAO(PartyDAOImpl.class);
	}

	public PartyContentDAO getPartyContentDAO() {
		return (PartyContentDAO) instantiateDAO(PartyContentDAOImpl.class);
	}

	public PartyAttributeDAO getPartyAttributeDAO() {
		return (PartyAttributeDAO) instantiateDAO(PartyAttributeDAOImpl.class);
	}

	public PartyTypeDAO getPartyTypeDAO() {
		return (PartyTypeDAO) instantiateDAO(PartyTypeDAOImpl.class);
	}

	public ProductCategoryDAO getProductCategoryDAO() {
		return (ProductCategoryDAO) instantiateDAO(ProductCategoryDAOImpl.class);
	}

	public CategoryContentDAO getCategoryContentDAO() {
		return (CategoryContentDAO) instantiateDAO(CategoryContentDAOImpl.class);
	}

	public CategoryAttributeDAO getCategoryAttributeDAO() {
		return (CategoryAttributeDAO) instantiateDAO(CategoryAttributeDAOImpl.class);
	}

	public CategoryTypeDAO getCategoryTypeDAO() {
		return (CategoryTypeDAO) instantiateDAO(CategoryTypeDAOImpl.class);
	}
	
	private GenericHibernateDAO instantiateDAO(Class daoClass) {
		try {
			GenericHibernateDAO dao = (GenericHibernateDAO) daoClass
					.newInstance();
			// dao.setSession(getCurrentSession());
			return dao;
		} catch (Exception ex) {
			throw new RuntimeException("Can not instantiate DAO: " + daoClass,
					ex);
		}
	}

	// You could override this if you don't want HibernateUtil for lookup
	protected Session getCurrentSession() {
		return HibernateUtil.getSessionFactory().getCurrentSession();
	}

	// Inline concrete DAO implementations with no business-related data access
	// methods.
	// If we use public static nested classes, we can centralize all of them in
	// one source file.

}
