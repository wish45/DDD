package com.example.ddd.Service;

import com.example.ddd.order_1.Order;
import org.springframework.stereotype.Service;

@Service
public class CancelOrderService {

    @Transactional
    public void cancelOrder(String orderId){
        Order order = findOrderById(orderId);
        if(order == null) throw new OrderNotFoundException(orderId);
        order.cancel();
    }

}
