package com.xl.system.core.dao.hibernate;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xl.system.core.dao.AbstractHibernateDAO;
import com.xl.system.core.dao.IGenericDAO;
import com.xl.system.core.domain.DomainObject;

@Repository
public class GenericHibernateDAO<T extends DomainObject> extends AbstractHibernateDAO< T > implements IGenericDAO< T > {
    @Autowired
    public GenericHibernateDAO(SessionFactory sessionFactory) {
	super(sessionFactory);
    }

  
}
