package com.example.ddd.Service;

import com.example.ddd.order_1.Order;
import com.example.ddd.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class CancelOrderService {

    private OrderRepository orderRepository;

    public CancelOrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    @Transactional
    public void cancelOrder(String orderId){
        Order order = findOrderById(orderId);
        if(order == null) throw new OrderNotFoundException(orderId);
        order.cancel();
    }
    public void cancel(OrderNumber number){
        Order order = orderRepository.findByNumber(number);
        if(order == null) throw new NoOrderException(number);
        order.cancel();
    }

}
