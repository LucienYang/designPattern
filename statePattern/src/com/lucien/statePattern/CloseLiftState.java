package com.lucien.statePattern;

/**
 * Created by Lucien on 2017/8/18.
 */
public class CloseLiftState extends LiftState {
    @Override
    public void open() {
        super.context.setLiftState(Context.openLiftState);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        System.out.println("电梯门关上了");
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.runLiftState);
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.stopLiftState);
        super.context.getLiftState().stop();
    }
}
