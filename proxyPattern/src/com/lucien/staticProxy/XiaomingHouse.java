package com.lucien.staticProxy;

/**
 * Created by Lucien on 2017/4/12.
 */
public class XiaomingHouse implements House {
    private String name;
    public XiaomingHouse(String name) {
        this.name = name;
    }

    @Override
    public void cook() {
        System.out.println(this.name+"在厨房做饭");
    }

    @Override
    public void clean() {
        System.out.println(this.name+"打扫卫生");
    }
}
