package com.xl.order.core.dao.hibernate;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xl.order.core.dao.OrderDAO;
import com.xl.order.core.entity.Order;
import com.xl.system.core.dao.hibernate.GenericHibernateDAO;
import com.xl.system.core.exception.EntityNotFoundException;

@Repository(value = "orderDao")
public class OrderHibernateDAO extends GenericHibernateDAO<Order> implements OrderDAO{

    @Autowired
    public OrderHibernateDAO(SessionFactory sessionFactory) {
	super(sessionFactory);
	this.clazz=Order.class;
    }

  
    public Order findOrderByTrackID(String trackID) throws EntityNotFoundException {
	List<Order> orders=this.getCurrentSession().createQuery("from " + clazz.getName()+" where trackID = ?").setString(0, trackID).list();
	 if (orders == null || orders.size() <= 0)
	            throw new EntityNotFoundException("Not order with tracid " + trackID + " found");
	        return orders.get(0);	
    }

}
