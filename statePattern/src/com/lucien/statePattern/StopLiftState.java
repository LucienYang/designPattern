package com.lucien.statePattern;

/**
 * Created by Lucien on 2017/8/18.
 */
public class StopLiftState extends LiftState {
    @Override
    public void open() {
        super.context.setLiftState(Context.openLiftState);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        super.context.setLiftState(Context.runLiftState);
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止运行");
    }
}
