package com.xl.order.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xl.order.core.dao.OrderDAO;
import com.xl.order.core.entity.Order;
import com.xl.system.core.exception.EntityNotFoundException;

@Service(value = "orderService")
@Transactional
public class OrderServiceImpl implements OrderService {

  
    private OrderDAO orderDao;
    
    @Autowired
    public void setOrderDao(OrderDAO orderDao) {
        this.orderDao = orderDao;
    }


    public void saveOrder(Order order) throws DataAccessException {
	orderDao.update(order);
    }

    public Order findOrderByTrackID(String trackID) throws DataAccessException, EntityNotFoundException {
	return orderDao.findOrderByTrackID(trackID);
    }
    
}
