package com.lucien.builderPattern;

/**
 * Created by Lucien on 2017/4/11.
 */
public class BenzCar extends Car {
    @Override
    protected void start() {
        System.out.println("奔驰启动");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰发动机轰鸣~~~~");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰按喇叭");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰刹车");
    }
}
