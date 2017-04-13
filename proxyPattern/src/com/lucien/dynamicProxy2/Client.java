package com.lucien.dynamicProxy2;

/**
 * Created by Lucien on 2017/4/13.
 */
public class Client {
    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayer("xiaoming");
        IGamePlayer proxy = DynamicProxy.createProxyInstance(gamePlayer);
        proxy.login();
        proxy.killBoss();
        proxy.upgrade();
    }
}
