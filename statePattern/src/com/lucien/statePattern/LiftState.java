package com.lucien.statePattern;

/**
 * Created by Lucien on 2017/8/18.
 */
public abstract class LiftState {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();


}
