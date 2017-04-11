package com.lucien.factory;

/**
 * Created by Lucien on 2017/3/28.
 */
public class CameraFactoryImpl implements CameraFactory {

    @Override
    public <T extends Camera> T createCamera(Class<T> clazz) {
        T object = null;
        try {
            object = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return object;
    }
}
