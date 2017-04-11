package com.lucien.singleton.lazySingleton;

/**
 * Created by Lucien on 2017/3/25.
 */
public class LazySingletonThread implements Runnable{
    @Override
    public void run() {
        LazySingleton lazy = LazySingleton.getInstance();
        lazy.say();
    }
}
