package com.lucien.singleton.lazySingleton;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Lucien on 2017/3/25.
 */
public class TestLazy {
    public static void main(String[] args) {
        for(int i = 0;i< 10; i++){
            LazySingleton lazy = LazySingleton.getInstance();
            lazy.say();
        }
    }
}
