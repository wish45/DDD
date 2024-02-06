package com.example.ddd.order_2;

import com.example.ddd.order_1.ShippingInfo;

public class Order {
    //주문 도메인 모델의 데이터
    //주문 도메인 모델의 엔티티는 데이터와 함께 도메인 기능을 함께 제공함.
    private OrderNo number;
    private Orderer orderer;
    private ShippingInfo shippingInfo;

    //데이터와 함께 기능을 제공하는 객체.
    public void changeShippingInfo(ShippingInfo newShippingInfo){
        checkShippingInfoChangeable(); //배송지 변경 가능 여부 확인
        this.shippingInfo = newShippingInfo;
        setShippingInfo(newShippingInfo);
    }

    private void checkShippingInfoChangeable() {
        //배송지 정보를 변경할 수 있는지 여부를 확인하는 도메인 규칙 구현..
    }

    private void setShippingInfo(ShippingInfo newShippingInfo){
        if(newShippingInfo == null) throw new IllegalArgumentException();
        //벨류 타입의 데이터를 변경할 때는 새로운 객체로 교체한다.
        this.shippingInfo = newShippingInfo;
    }
    
}
