package com.lucien.staticProxy;

/**
 * Created by Lucien on 2017/4/12.
 */
public class HouseProxy implements House,ProxyCount {

    private House house;

    public HouseProxy(House house) {
        this.house = house;
    }

    @Override
    public void cook() {
        this.startCount();
        this.house.cook();
        this.endCount();
    }

    @Override
    public void clean() {
        this.startCount();
        this.house.clean();
        this.endCount();
    }

    @Override
    public void startCount(){
        System.out.println("开始计费");
    }

    @Override
    public void endCount(){
        System.out.println("计费结束");
        this.totalCount();
    }

    @Override
    public void totalCount() {
        System.out.println("共计消费："+100+"元");
    }
}
