package com.lucien.singleton.lazySingleton;

/**
 * Created by Lucien on 2017/3/25.
 */
public class TestLazyThread {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            Thread t1 = new Thread(new LazySingletonThread());
            Thread t2 = new Thread(new LazySingletonThread());
            Runnable r = () -> {
                LazySingleton lazy = LazySingleton.getInstance();
                lazy.say();
            };
            t1.start();
            t2.start();
        }
    }
}
