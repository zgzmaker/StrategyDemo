package com.lj.strategy;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class StrategyContext {


    /**
     * 通过spring注解 自动注入所有实现了IRuleStategy接口的类（类也必须通过spring注入）
     * key为实现类的类名，eg：ARuleStrategy.class.getSimpleName();
     */
    @Autowired
    private Map<String, IRuleStrategy> context = new HashMap<String, IRuleStrategy>();

    public Map<String, IRuleStrategy> getContext() {
        return context;
    }

    public void setContext(Map<String, IRuleStrategy> context) {
        this.context = context;
    }

    public void executeRule(String strategy){
        if (context.containsKey(strategy)){
            context.get(strategy).executeRule();
        }
    }

}
