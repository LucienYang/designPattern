package com.lucien.dynamicWithCglib;

/**
 * Created by Lucien on 2017/4/20.
 */
public class Car implements Appearence, Power {

    @Override
    public void haveGoodPower() {
        System.out.println("外观好看");
    }

    @Override
    public void haveGoodLook() {
        System.out.println("动力充沛");
    }
}
