package com.xl.order.core.dao.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xl.order.core.dao.OrderProductDAO;
import com.xl.order.core.entity.OrderProduct;
import com.xl.system.core.dao.hibernate.GenericHibernateDAO;

@Repository(value = "orderProductDao")
public class OrderProductHibernateDAO extends GenericHibernateDAO<OrderProduct> implements OrderProductDAO{

    @Autowired
    public OrderProductHibernateDAO(SessionFactory sessionFactory) {
	super(sessionFactory);
	this.clazz=OrderProduct.class;
    }

}
