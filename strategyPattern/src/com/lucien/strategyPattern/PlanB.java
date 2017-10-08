package com.lucien.strategyPattern;

/**
 * Created by Lucien on 2017/4/26.
 */
public class PlanB implements PursueGirlStrategy {
    @Override
    public void operate(Girl girl) {
        System.out.println("给"+girl.getName()+"女生唱情歌");
    }
}
