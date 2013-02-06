package com.xl.system.core.dao.jpa;


import com.xl.system.core.dao.AbstractJpaDAO;
import com.xl.system.core.dao.IGenericDAO;
import com.xl.system.core.domain.DomainObject;

public class GenericJpaDAO< T extends DomainObject > extends AbstractJpaDAO< T > implements IGenericDAO< T >{

}
