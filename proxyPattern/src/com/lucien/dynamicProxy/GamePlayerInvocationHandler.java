package com.lucien.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Lucien on 2017/4/13.
 */
public class GamePlayerInvocationHandler implements InvocationHandler {
    private Object object;//被代理的对象

    public GamePlayerInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.object, args);
        if("upgrade".equals(method.getName())){
            System.out.println("升级费用：100元");
        }
        return result;
    }
}
