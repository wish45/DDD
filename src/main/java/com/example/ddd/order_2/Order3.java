package com.example.ddd.order_2;

import com.example.ddd.order_1.ShippingInfo;

public class Order3 {

    private Orderer orderer;

    public void changeShippingInfo(ShippingInfo newShippingInfo, boolean useNewShippingAddrAsMemberAddr){
        if(useNewShippingAddrAsMemberAddr){
            //한 애그리거트 내부에서 다른 애그리거트에 접근할 수 있으면, 구현이 쉬워진다는것때문에
            //다른 애그리거트의 상태를 변경하는 유혹에 빠지기 쉽다.
            orderer.getMember().changeAddress(newShippingInfo.getAddress());
        }
    }
}
