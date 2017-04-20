package com.lucien.dynamicWithCglib;

/**
 * Created by Lucien on 2017/4/20.
 */
public class Client {
    public static void main(String[] args) {
        DynamicProxy dynamicProxy = new DynamicProxy();
        Car carproxy = (Car) dynamicProxy.getProxy(Car.class);
        carproxy.haveGoodLook();
        carproxy.haveGoodPower();
    }
}
