package com.paldaps.system.core.dao.hibernate;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.paldaps.system.core.dao.AbstractHibernateDAO;
import com.paldaps.system.core.dao.IGenericDAO;
import com.paldaps.system.core.domain.DomainObject;

@Repository
public class GenericHibernateDAO<T extends DomainObject> extends AbstractHibernateDAO< T > implements IGenericDAO< T > {
    @Autowired
    public GenericHibernateDAO(SessionFactory sessionFactory) {
	super(sessionFactory);
    }

  
}
