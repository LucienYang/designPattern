package com.lucien.builderPattern;

import java.util.List;

/**
 * Created by Lucien on 2017/4/11.
 */
public class BenzBuilder implements CarBuilder{
    private BenzCar benzCar = new BenzCar();
    @Override
    public void setActions(List<String> actions) {
        this.benzCar.setActions(actions);
    }

    @Override
    public BenzCar getCar() {
        return this.benzCar;
    }
}
