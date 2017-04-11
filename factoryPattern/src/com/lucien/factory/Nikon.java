package com.lucien.factory;

/**
 * Created by Lucien on 2017/3/28.
 */
public class Nikon implements Camera {
    @Override
    public void zoom() {
        System.out.println("尼康相机对焦");
    }

    @Override
    public void takePhotos() {
        System.out.println("尼康相机拍照");
    }
}
