package com.example.ddd.dao;

import com.example.ddd.order_2.Order;
import com.example.ddd.spec.Specification;

public class OrdererSpec implements Specification<Order> {
    private String ordererId;

    public OrdererSpec(String ordererId){
        this.ordererId = ordererId;
    }

    @Override
    public boolean isSatisfiedBy(Order agg) {
        return agg.getOrdererId().getMemeberid().getId().equals(ordererId);
    }
}
