package com.lucien.mediationPattern;

/**
 * Created by Lucien on 2017/4/15.
 */
public class Warehouse {
    private int WAREHOUSE_COUNT = 100;

    public int getWAREHOUSE_COUNT() {
        return WAREHOUSE_COUNT;
    }

    public void setWAREHOUSE_COUNT(int WAREHOUSE_COUNT) {
        this.WAREHOUSE_COUNT = WAREHOUSE_COUNT;
    }

    public void increase(int num){
        this.setWAREHOUSE_COUNT(this.getWAREHOUSE_COUNT()+num);
    }

    public void decrease(int num){
        this.setWAREHOUSE_COUNT(this.getWAREHOUSE_COUNT()-num);
    }

    public void count(){
        System.out.println("当前库存"+this.getWAREHOUSE_COUNT());
    }
}
