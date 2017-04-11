package com.lucien.singleton.lazySingleton;

/**
 * Created by Lucien on 2017/3/25.
 */
public class LazySingleton {
    private static volatile LazySingleton lazy = null;

    public LazySingleton() {
    }

    public static LazySingleton getInstance(){
        if(lazy == null){
            try {
                Thread.sleep((long)Math.random()*10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (LazySingleton.class){
                if(lazy == null) {
                    lazy = new LazySingleton();
                }
            }

        }
        return lazy;
    }

    public static void say(){
        System.out.println(lazy.toString());
    }
}
