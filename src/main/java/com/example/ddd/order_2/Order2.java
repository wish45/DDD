package com.example.ddd.order_2;

import com.example.ddd.order.OrderState;
import com.example.ddd.order_1.ShippingInfo;

public class Order2 {

    private ShippingInfo shippingInfo;

    public void changeShippingInfo(ShippingInfo newShippingInfo){
        verifyNotYetShipped();
        setShippingInfo(newShippingInfo);
    }

    private void setShippingInfo(ShippingInfo newShippingInfo) {
        //벨류가 불변이면 새로운 객체를 할당해서 값을 변경해야한다.
        //불변이므로 this.shippingInfo.setAddress(newShippingInfo.getAddress())와 같은 코드를 사용할 수 없다.
        this.ShippingInfo = newShippingInfo;
    }

    private void verifyNotYetShipped() {
        if(state != OrderState.PAYMENT_WAITING && state != OrderState.PREPARING)
            throw new IllegalStateException("already shipped");
    }
}
