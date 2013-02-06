package com.paldaps.system.core.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.paldaps.system.core.domain.DomainObject;



public abstract class AbstractJpaDAO< T extends DomainObject > {
    
    protected Class< T > clazz;
    
    @PersistenceContext
    protected EntityManager entityManager;
    
    public void setClazz( final Class< T > clazzToSet ){
       this.clazz = clazzToSet;
    }
    
    public T getById( final String id ){
       return entityManager.find( clazz, id );
    }
    public List< T > findAll(){
       return entityManager.createQuery( "from " + clazz.getName() )
        .getResultList();
    }
    
    public T load( final T entity ){
	       return null;
    }
    
    public void save( final T entity ){
       entityManager.persist( entity );
    }
    
    public void update( final T entity ){
       entityManager.merge( entity );
    }
    
    public void delete( final T entity ){
       entityManager.remove( entity );
    }
    public void deleteById( final String entityId ){
       final T entity = getById( entityId );
       delete( entity );
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    
 }

