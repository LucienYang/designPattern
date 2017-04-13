package com.lucien.dynamicProxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by Lucien on 2017/4/13.
 */
public class DynamicProxy {

    public static <T> T createProxyInstance(T subject){
        InvocationHandler handler = new MyInvocationHandler(subject);
        T proxy = (T) Proxy.newProxyInstance(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),handler);
        return proxy;
    }
}
