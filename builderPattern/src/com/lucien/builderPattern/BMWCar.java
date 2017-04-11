package com.lucien.builderPattern;

/**
 * Created by Lucien on 2017/4/11.
 */
public class BMWCar extends Car {
    @Override
    protected void start() {
        System.out.println("宝马启动");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马发动机轰鸣~~~~");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马按喇叭");
    }

    @Override
    protected void stop() {
        System.out.println("宝马刹车");
    }
}
