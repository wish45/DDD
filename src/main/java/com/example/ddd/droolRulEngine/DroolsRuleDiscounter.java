package com.example.ddd.droolRulEngine;

import com.example.ddd.order_1.Money;
import com.example.ddd.order_1.OrderLine;

import java.nio.file.Path;
import java.util.List;

public class DroolsRuleDiscounter implements RuleDiscounter{

    private KieContainer kContainer;

    public DroolsRuleEngine(){
        KieService ks = KieServices.Factory.get();
        kContainer = ks.getKieClasspathContainer();
    }

    @Override
    public Money applyRules(Customer customer, List<OrderLine> orderLines) {
        KieSession kSession = kContainer.newKieSession("discountSession");
        try{
            kSession.fireAllRules();
        }finally {
            kSession.dispose();
        }
        return money.toImmutableMoney();
    }
}
