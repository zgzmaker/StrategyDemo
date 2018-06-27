package com.lj.strategy;

import org.springframework.stereotype.Component;

@Component
public class BRuleStartegy implements IRuleStrategy {
    public void executeRule() {
        System.out.println("B rule execute");
    }
}
