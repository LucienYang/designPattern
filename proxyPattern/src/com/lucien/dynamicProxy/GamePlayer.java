package com.lucien.dynamicProxy;


/**
 * Created by Lucien on 2017/4/13.
 */
public class GamePlayer implements IGamePlayer {
    private  String name;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login() {
        System.out.println(this.name+"上线");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name+"打怪");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name+"升级了！！！");
    }
}
