package com.lucien.singleton.mutilSingleton;

/**
 * Created by Lucien on 2017/3/28.
 */
public class TestMutilSingleton {
    public static void main(String[] args) {
        MutilSingleton m1 = MutilSingleton.getInstance(0);
        m1.say();
        MutilSingleton m2 = MutilSingleton.getInstance(1);
        m2.say();
        MutilSingleton m3 = MutilSingleton.getInstance(2);
        m3.say();
        MutilSingleton m11 = MutilSingleton.getInstance(0);
        m11.say();
        MutilSingleton m22 = MutilSingleton.getInstance(1);
        m22.say();
        MutilSingleton m33 = MutilSingleton.getInstance(2);
        m33.say();
    }
}
