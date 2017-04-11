package com.lucien.abstractFactory;

/**
 * Created by Lucien on 2017/3/29.
 */
public class ProductBClass2 extends AbstractProductB{
    @Override
    public void doSomething() {
        System.out.println("我是产品B的【第二个】类型,我能2222222222222");
    }

    @Override
    public void doOthorThing() {
        System.out.println("我是产品B的【第二个】类型,我还能2~~~~~~~~~~");
    }
}
