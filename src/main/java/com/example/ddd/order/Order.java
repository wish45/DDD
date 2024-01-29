package com.example.ddd.order;

public class Order {
    private OrderState state;
    private ShippingInfo shippingInfo;

    public void changeShippingInfo(ShippingInfo newShippingInfo){
        if(!state.isShippingChangeable()){
            throw new IllegalStateException("배송상태 변경 불가" + state);
        }
        this.shippingInfo = newShippingInfo;

    }
    
}
