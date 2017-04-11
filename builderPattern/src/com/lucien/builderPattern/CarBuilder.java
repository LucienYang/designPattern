package com.lucien.builderPattern;

import java.util.List;

/**
 * Created by Lucien on 2017/4/11.
 */
public interface CarBuilder {
    public void setActions(List<String> actions);
    public Car getCar();
}
