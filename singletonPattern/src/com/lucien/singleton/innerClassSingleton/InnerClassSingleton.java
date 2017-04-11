package com.lucien.singleton.innerClassSingleton;

/**
 * Created by Lucien on 2017/3/26.
 */
public class InnerClassSingleton {

    private InnerClassSingleton(){};

    public static final InnerClassSingleton getInstance(){
        return InnerSingleton.INSTANCE;
    }

    private static class InnerSingleton{
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
        private static void say(){
            System.out.println(INSTANCE.toString());
        }
    }

    public void say(){
        InnerSingleton.say();
    }
}
