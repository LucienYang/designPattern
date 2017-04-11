package com.lucien.builderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lucien on 2017/4/11.
 */
public class Director {
    private List<String> actions = new ArrayList<String>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    public BenzCar getBenz(){
        this.actions.clear();
        this.actions.add("start");
        this.actions.add("alarm");
        this.actions.add("stop");
        this.benzBuilder.setActions(actions);
        return this.benzBuilder.getCar();
    }

    public BMWCar getBMW(){
        this.actions.clear();
        this.actions.add("start");
        this.actions.add("engineBoom");
        this.actions.add("stop");
        this.bmwBuilder.setActions(actions);
        return this.bmwBuilder.getCar();
    }
}
