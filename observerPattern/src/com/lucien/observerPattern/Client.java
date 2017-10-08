package com.lucien.observerPattern;

/**
 * Created by Lucien on 2017/10/8.
 */
public class Client {
    public static void main(String[] args) {
        Xiaoming xiaoming = new Xiaoming();
        xiaoming.addObserver(new Teacher());
        xiaoming.study();
        xiaoming.play();
    }
}
