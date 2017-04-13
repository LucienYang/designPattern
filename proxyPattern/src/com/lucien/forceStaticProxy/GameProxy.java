package com.lucien.forceStaticProxy;


/**
 * Created by Lucien on 2017/4/13.
 */
public class GameProxy implements IGamePlayer {

    private IGamePlayer gamePlayer;

    public GameProxy(IGamePlayer gamePlayer){
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login() {
        this.gamePlayer.login();
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }

    @Override
    public IGamePlayer getProxy() {
        return this;
    }
}
