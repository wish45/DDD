package com.example.ddd.order_1;

import java.util.List;

public class Order {
    private List<OrderLine> orderLines;
    private Money totalAmounts;

    public Order(List<OrderLine> orderLines) {
        if(orderLines == null || orderLines.isEmpty()){
            throw new IllegalArgumentException("no OrderLine");
        }
        this.orderLines = orderLines;
        int sum = orderLines.stream()
                .mapToInt(x -> x.getAmounts())
                .sum();
        this.totalAmounts = new Money(sum);
    }

    public void changeShipped(){}
    public void changeShippingInfo(ShippingInfo newShipping){}
    public void cancel(){}
    public void completePayment(){}
}
