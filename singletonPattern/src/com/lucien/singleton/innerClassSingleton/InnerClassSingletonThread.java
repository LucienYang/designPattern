package com.lucien.singleton.innerClassSingleton;

/**
 * Created by Lucien on 2017/3/26.
 */
public class InnerClassSingletonThread implements Runnable {
    @Override
    public void run() {
        InnerClassSingleton instance = InnerClassSingleton.getInstance();
        instance.say();
    }
}
