package com.lucien.singleton.innerClassSingleton;

/**
 * Created by Lucien on 2017/3/26.
 */
public class TestInnerClassSingleton {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            Thread t1 = new Thread(new InnerClassSingletonThread());
            Thread t2 = new Thread(new InnerClassSingletonThread());
            t1.start();
            t2.start();
        }
    }
}
