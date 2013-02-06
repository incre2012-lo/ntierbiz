package com.xl.order.core.service;

import org.springframework.dao.DataAccessException;

import com.xl.order.core.entity.Order;
import com.xl.system.core.exception.EntityNotFoundException;


public interface OrderService {

    void saveOrder(Order order) throws DataAccessException;    
    Order findOrderByTrackID(String trackID) throws DataAccessException, EntityNotFoundException;
}
