package com.lucien.singleton.hungrySingleton;

/**
 * Created by Lucien on 2017/3/25.
 */
public class HungrySingleton {
    private static HungrySingleton hungry = new HungrySingleton();

    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return hungry;
    }

    public static void say(){
        System.out.println(hungry.toString());
    }
}
