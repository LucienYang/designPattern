package com.lucien.factory;

/**
 * Created by Lucien on 2017/3/28.
 * 描述：一个工厂制造不同产品，多个产品实现一个抽象类
 */
public interface CameraFactory {
    public <T extends Camera> T  createCamera(Class<T> clazz);
}
