package com.lucien.staticProxy2;

/**
 * Created by Lucien on 2017/4/13.
 */
public class Client {
    public static void main(String[] args) {
        try {
            IGamePlayer gamePlayer = new GameProxy("xiaoming");
            gamePlayer.login();
            gamePlayer.killBoss();
            gamePlayer.upgrade();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
