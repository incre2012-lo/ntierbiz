package com.xl.system.core.dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.xl.system.core.domain.DomainObject;



public abstract class AbstractHibernateDAO<T extends DomainObject> {

    protected Class< T > clazz;
    
 
    protected SessionFactory sessionFactory;
    
    public void setClazz( final Class< T > clazzToSet ){
       this.clazz = clazzToSet;
    }
    
    public T getById( final String id ){
       return (T) getCurrentSession().get( clazz, id );
    }
    public List< T > findAll(){
       return getCurrentSession().createQuery( "from " + clazz.getName() ).list();
    }
    
    public T load( final T entity ){
	return (T)getCurrentSession().load(clazz,entity.getUuid());	       
    }
    
    public void save( final T entity ){
       getCurrentSession().persist( entity );
    }
    
    public void update( final T entity ){
       getCurrentSession().merge( entity );
    }
    
    public void delete( final T entity ){
       getCurrentSession().delete( entity );
    }
    public void deleteById( final String entityId ){
       final T entity = getById( entityId );
       
       delete( entity );
    }
    
    @Autowired
    public AbstractHibernateDAO(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
    }

    protected Session getCurrentSession(){
       return sessionFactory.getCurrentSession();
    }

   
    
}
