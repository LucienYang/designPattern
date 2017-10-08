package com.lucien.strategyPattern;

/**
 * Created by Lucien on 2017/4/26.
 */
public class Client {
    public static void main(String[] args) {
        Girl xiaohong = new Girl("小红");
        Context context = new Context(new PlanA());
        context.operate(xiaohong);
        context = new Context(new PlanB());
        context.operate(xiaohong);
        context = new Context(new PlanC());
        context.operate(xiaohong);
    }
}
