package com.example.ddd.droolRulEngine;

import com.example.ddd.order_1.Money;
import com.example.ddd.order_1.OrderLine;

import java.util.List;

public interface RuleDiscounter {
    Money applyRules(Customer customer, List<OrderLine> orderLines);
}
