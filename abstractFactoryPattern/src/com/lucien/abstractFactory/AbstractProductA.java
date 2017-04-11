package com.lucien.abstractFactory;

/**
 * Created by Lucien on 2017/3/29.
 */
public abstract class AbstractProductA implements Product{
    @Override
    public void say() {
        System.out.println("我是产品A");
    }
}
