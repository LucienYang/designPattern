package com.lucien.singleton.enumSingleton;

/**
 * Created by Lucien on 2017/3/26.
 */
public enum EnumSingleton {
    INSTANCE;

    public void say(){
        System.out.println(this.hashCode());
    }

    public static void main(String[] args) {
        EnumSingleton s1 = INSTANCE;
        EnumSingleton s2 = INSTANCE;
        s1.say();
        s2.say();
    }
}
