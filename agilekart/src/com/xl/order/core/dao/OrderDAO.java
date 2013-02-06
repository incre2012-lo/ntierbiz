package com.xl.order.core.dao;

import com.xl.order.core.entity.Order;
import com.xl.system.core.dao.IGenericDAO;
import com.xl.system.core.exception.EntityNotFoundException;

public interface OrderDAO extends IGenericDAO<Order>{

    Order findOrderByTrackID(String trackID) throws EntityNotFoundException;

}
