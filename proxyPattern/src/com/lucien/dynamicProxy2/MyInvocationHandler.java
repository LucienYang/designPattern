package com.lucien.dynamicProxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Lucien on 2017/4/13.
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object object;

    public MyInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.object, args);
        return result;
    }
}
