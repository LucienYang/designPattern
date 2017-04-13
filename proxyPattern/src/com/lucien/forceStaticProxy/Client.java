package com.lucien.forceStaticProxy;

/**
 * Created by Lucien on 2017/4/13.
 */
public class Client {
    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayer("xiaoming");
        gamePlayer.login();
        gamePlayer.killBoss();
        gamePlayer.upgrade();
        System.out.println("----------------------------------");
        IGamePlayer gamePlayer2 = new GamePlayer("xiaoming");
        IGamePlayer gameProxy = new GameProxy(gamePlayer2);
        gameProxy.login();
        gameProxy.killBoss();
        gameProxy.upgrade();
        System.out.println("----------------------------------");
        IGamePlayer gamePlayer3 = new GamePlayer("xiaoming");
        IGamePlayer gameProxy3 = gamePlayer3.getProxy();
        gameProxy3.login();
        gameProxy3.killBoss();
        gameProxy3.upgrade();
    }
}
