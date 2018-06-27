package com.lj.service;

import com.lj.strategy.BRuleStartegy;
import com.lj.strategy.StrategyContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 实际项目中executeRule的参数可以是一个枚举，每个枚举值都是一个规则策略的类名。
 */
public class Demo {

    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.start();
        StrategyContext strategyContext = (StrategyContext)context.getBean("strategyContext");
        strategyContext.executeRule(BRuleStartegy.class.getSimpleName());
    }
}
