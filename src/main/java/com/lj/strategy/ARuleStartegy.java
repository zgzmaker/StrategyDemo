package com.lj.strategy;

import org.springframework.stereotype.Component;

@Component
public class ARuleStartegy implements IRuleStrategy {
    public void executeRule() {
        System.out.println("A rule execute");
    }
}
