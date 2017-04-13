package com.lucien.staticProxy2;

/**
 * Created by Lucien on 2017/4/13.
 */
public class GamePlayer implements IGamePlayer{

    private String name;

    public GamePlayer(IGamePlayer gamePlayer, String name) throws Exception {
        if(gamePlayer == null || !this.classNameHasProxy(gamePlayer.getClass())){
            throw new Exception("不能创建真实类");
        }else{
            this.name = name;
        }
    }

    private boolean classNameHasProxy(Class<? extends IGamePlayer> clazz){
        if (clazz.getSimpleName().indexOf("proxy") > 0
                || clazz.getSimpleName().indexOf("Proxy") > 0
                || clazz.getSimpleName().indexOf("PROXY") > 0) {
            return true;
        }
        return false;
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
