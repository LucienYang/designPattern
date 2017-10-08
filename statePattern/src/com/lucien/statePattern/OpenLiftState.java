package com.lucien.statePattern;

/**
 * Created by Lucien on 2017/8/18.
 */
public class OpenLiftState extends LiftState {
    @Override
    public void open() {
        System.out.println("电梯门开了");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.closeLiftState);
        super.context.getLiftState().close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
