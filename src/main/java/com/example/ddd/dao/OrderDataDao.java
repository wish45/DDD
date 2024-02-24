package com.example.ddd.dao;

import com.example.ddd.order_2.Order;

public interface OrderDataDao {
    Optional<OrderData> findById(OrderNo id);
    List<Order> findByOrderer(Srtring ordererId, Date fromDate, Date toDate);

}
