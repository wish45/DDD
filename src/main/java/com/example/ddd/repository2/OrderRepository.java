package com.example.ddd.repository2;

import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface OrderRepository extends Repository<Order, OrderNo> {
    Optional<Order> findById(OrderNo id);
    void save(Order order);
}
