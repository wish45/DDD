package com.example.ddd.order_1;

import java.util.List;
import java.util.Objects;

public class Order {
    private List<OrderLine> orderLines;
    private ShippingInfo shippingInfo;
    private Money totalAmounts;
    private OrderState state;

    public Order(List<OrderLine> orderLines) {
        setOrderLines(orderLines);
        setShippingInfo(shippingInfo);
    }

    private void setShippingInfo(ShippingInfo shippingInfo) {
        if(shippingInfo == null)
            throw new IllegalArgumentException("no shippingInfo");
        this.shippingInfo = shippingInfo;
    }

    private void setOrderLines(List<OrderLine> orderLines) {
        verifyAtLeastOneOrMoreOrderLines(orderLines);
        this.orderLines = orderLines;
        calculateTotalAmounts();
    }

    private void verifyAtLeastOneOrMoreOrderLines(List<OrderLine> orderLines) {
        if(Objects.requireNonNull(orderLines).isEmpty()){
            throw new IllegalArgumentException("no OrderLine");
        }
    }

    private void calculateTotalAmounts() {
        int sum = orderLines.stream()
                .mapToInt(x -> x.getAmounts())
                .sum();
        this.totalAmounts = new Money(sum);
    }


    public void changeShippingInfo(ShippingInfo newShipping){
        verifyNotYetShipped();
        setShippingInfo(newShippingInfo);
    }
    public void cancel(){
        verifyNotYestShipped();
        this.state = OrderState.CANCELED;
    }
    private void verifyNotYetShipped() {
        if(state != OrderState.PAYMENT_WAITING && state !=OrderState.PREPARING){
            throw new IllegalStateException("already shipped");
        }
    }

    public void changeShipped(){}
    public void completePayment(){}


}
