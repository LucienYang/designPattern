package com.lucien.strategyPattern;

/**
 * Created by Lucien on 2017/4/26.
 */
public class Context {
    private PursueGirlStrategy pursueGirlStrategy;

    public Context(PursueGirlStrategy pursueGirlStrategy) {
        this.pursueGirlStrategy = pursueGirlStrategy;
    }

    public void operate(Girl girl){
        this.pursueGirlStrategy.operate(girl);
    }
}
