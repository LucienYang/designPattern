package com.lucien.decoratorPattern;

/**
 * Created by Lucien on 2017/4/24.
 */
public class NewStar extends SuperStar {
    @Override
    public void singing() {
        System.out.println("明星唱歌");
    }

    @Override
    public void playMovie() {
        System.out.println("明星拍电影");
    }
}
