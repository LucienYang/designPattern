package com.lucien.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by Lucien on 2017/4/13.
 */
public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("zhangsan");
        InvocationHandler hander = new GamePlayerInvocationHandler(player);
        ClassLoader classLoader = player.getClass().getClassLoader();
        Class<?> [] interfaces = player.getClass().getInterfaces();
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(classLoader, interfaces, hander);
        proxy.login();
        proxy.killBoss();
        proxy.upgrade();
    }
}
