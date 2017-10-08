package com.lucien.statePattern;

/**
 * Created by Lucien on 2017/8/18.
 */
public class RunLiftState extends LiftState {
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("电梯正在运行...");
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.stopLiftState);
        super.context.getLiftState().stop();
    }
}
