package com.example.ddd.repository;

import com.example.ddd.order_2.Order;

public interface OrderRepository {
    Order findByNumber(OrderNumber number);
    void save(Order order);
    void delete(Order order);
}
