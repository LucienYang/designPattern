package com.lucien.statePattern;

/**
 * Created by Lucien on 2017/8/18.
 */
public class Context {
    public static final LiftState openLiftState = new OpenLiftState();
    public static final LiftState closeLiftState = new CloseLiftState();
    public static final LiftState runLiftState = new RunLiftState();
    public static final LiftState stopLiftState = new StopLiftState();

    protected LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void open(){
        this.liftState.open();
    }

    public void close(){
        this.liftState.close();
    }

    public void run(){
        this.liftState.run();
    }

    public void stop(){
        this.liftState.stop();
    }
}
