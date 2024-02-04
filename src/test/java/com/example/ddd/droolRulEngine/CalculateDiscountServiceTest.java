package com.example.ddd.droolRulEngine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateDiscountServiceTest {

    @Test
    public void noCustomer_thenExceptionShouldBeThrown(){
        //테스트 목적의 대역 객체
        CustomerRepository stubRepo = mock(CustomerRepository.class);
        when(stubRepo.findById("noCustId")).thenReturn(null);

        RuleDiscounter stubRule = (cust, lines) -> null;

        //대응 객체를 주입받아 테스트 진행
        CalculateDiscountService calDisSvc = new CalculateDiscountService(stubRepo, stubRule);
        assertThrows(NoCustomerException.class, () -> calDisSvc.calculateDiscount(someLines, "noCustId"));
        
    }
}