package com.example.ddd.dao;

import com.example.ddd.order_2.Order;
import com.example.ddd.repository.OrderRepository;
import com.example.ddd.spec.Specification;

public class MemoryOrderRepository implements OrderRepository {

    public List<Order> findAll(Specification<Order> spec){
        List<Order> allOrders = findAll();
        return allOrders.stream().filter(order -> spec.isStisfiedBy(order)).toList();
    }
}
