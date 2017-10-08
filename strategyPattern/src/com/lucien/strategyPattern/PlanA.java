package com.lucien.strategyPattern;

/**
 * Created by Lucien on 2017/4/26.
 */
public class PlanA implements PursueGirlStrategy {
    @Override
    public void operate(Girl girl) {
        System.out.println("给"+girl.getName()+"送花");
    }
}
