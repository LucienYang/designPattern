package com.lucien.forceStaticProxy;


/**
 * Created by Lucien on 2017/4/13.
 */
public class GamePlayer implements IGamePlayer {

    private String name;
    private IGamePlayer gameProxy;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login() {
        if(this.hasProxy()){
            System.out.println(this.name+"上线");
        }else{
            System.out.println("请使用代理访问");
        }
    }

    @Override
    public void killBoss() {
        if(this.hasProxy()){
            System.out.println(this.name+"打怪");
        }else{
            System.out.println("请使用代理访问");
        }
    }

    @Override
    public void upgrade() {
        if(this.hasProxy()){
            System.out.println(this.name+"升级了！！！");
        }else{
            System.out.println("请使用代理访问");
        }
    }

    @Override
    public IGamePlayer getProxy() {
        this.gameProxy = new GameProxy(this);
        return this.gameProxy;
    }

    private boolean hasProxy(){
        if(this.gameProxy != null){
            return true;
        }
        return false;
    }
}
