package com.lucien.singleton.factorySingleton;

/**
 * Created by Lucien on 2017/3/28.
 */
public class TestSingletonFactory {
    public static void main(String[] args) {
        Singleton s = SingletonFactory.getInstance();
        s.say();
    }
}
