package com.lucien.factory;

/**
 * Created by Lucien on 2017/3/28.
 */
public class Lucien {
    public static void main(String[] args) {
        CameraFactory cameraFactory = new CameraFactoryImpl();
        Camera c1 = cameraFactory.createCamera(Canon.class);
        c1.zoom();
        c1.takePhotos();
        Camera c2 = cameraFactory.createCamera(Nikon.class);
        c2.zoom();
        c2.takePhotos();
    }
}
