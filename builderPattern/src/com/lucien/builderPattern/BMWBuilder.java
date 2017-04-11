package com.lucien.builderPattern;

import java.util.List;

/**
 * Created by Lucien on 2017/4/11.
 */
public class BMWBuilder implements CarBuilder {
    private BMWCar bmwCar = new BMWCar();

    @Override
    public void setActions(List<String> actions) {
        this.bmwCar.setActions(actions);
    }

    @Override
    public BMWCar getCar() {
        return this.bmwCar;
    }
}
