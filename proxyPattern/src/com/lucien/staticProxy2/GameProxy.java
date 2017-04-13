package com.lucien.staticProxy2;

/**
 * Created by Lucien on 2017/4/13.
 */
public class GameProxy implements IGamePlayer {

    private IGamePlayer gamePlayer;

    public GameProxy(String name) throws Exception {
        this.gamePlayer = new GamePlayer(this, name);
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
}
