package com.paldaps.system.core.dao;

import java.util.List;



public interface IGenericDAO<T> { 
    	   public void setClazz( final Class< T > clazzToSet ); 
	    public T getById( final String id );
	    public List< T > findAll();
	    public T load( final T entity ); 
	    public void save( final T entity ); 
	    public void update( final T entity ); 
	    public void delete( final T entity );
	    public void deleteById( final String entityId );
    
}
