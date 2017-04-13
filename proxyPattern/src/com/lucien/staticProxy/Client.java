package com.lucien.staticProxy;

/**
 * Created by Lucien on 2017/4/12.
 */
public class Client {
    public static void main(String[] args) {
        House xiaomingHouse = new XiaomingHouse("xiaoming");
        House houseProxy = new HouseProxy(xiaomingHouse);
        houseProxy.cook();
        houseProxy.clean();
    }
}
