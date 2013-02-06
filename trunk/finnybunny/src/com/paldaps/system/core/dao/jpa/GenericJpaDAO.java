package com.paldaps.system.core.dao.jpa;

import com.paldaps.system.core.dao.AbstractJpaDAO;
import com.paldaps.system.core.dao.IGenericDAO;
import com.paldaps.system.core.domain.DomainObject;




public class GenericJpaDAO< T extends DomainObject > extends AbstractJpaDAO< T > implements IGenericDAO< T >{

}
