package com.lucien.forceStaticProxy;

/**
 * Created by Lucien on 2017/4/13.
 */
public interface IGamePlayer {
    public void login();
    public void killBoss();
    public void upgrade();
    public IGamePlayer getProxy();
}
