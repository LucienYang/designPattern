package com.lucien.abstractFactory;

/**
 * Created by Lucien on 2017/3/29.
 */
public abstract class AbstractProductB implements Product{
    @Override
    public void say() {
        System.out.println("我是产品B");
    }
}
