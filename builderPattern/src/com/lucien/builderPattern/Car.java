package com.lucien.builderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lucien on 2017/4/11.
 */
public abstract class Car {
    List<String> actions = new ArrayList<String>();
    protected abstract void start();
    protected abstract void engineBoom();
    protected abstract void alarm();
    protected abstract void stop();
    public void run(){
        for(String action : actions){
            if("start".equals(action)){
                this.start();
            }else if("engineBoom".equals(action)){
                this.engineBoom();
            }else if("alarm".equals(action)){
                this.alarm();
            }else if("stop".equals(action)){
                this.stop();
            }
        }
    };
    final public void setActions(List<String> actions){
        this.actions = actions;
    };
}
