package com.lucien.builderPattern;

/**
 * Created by Lucien on 2017/4/11.
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        director.getBenz().run();
        director.getBMW().run();
    }
}
