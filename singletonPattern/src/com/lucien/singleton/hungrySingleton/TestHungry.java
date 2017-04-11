package com.lucien.singleton.hungrySingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Lucien on 2017/3/25.
 */
public class TestHungry {
    public static void main(String[] args) {
        for(int i = 0;i< 10; i++){
            HungrySingleton hungry = HungrySingleton.getInstance();
            hungry.say();
        }

        try {
            Class clazz = Class.forName("com.lucien.singleton.hungrySingleton.HungrySingleton");
            Constructor constructor = clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            HungrySingleton hungrySingleton = (HungrySingleton) constructor.newInstance();
            System.out.println(hungrySingleton.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
