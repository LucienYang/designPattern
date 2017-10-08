package com.lucien.statePattern;

/**
 * Created by Lucien on 2017/8/18.
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(Context.runLiftState);
        context.open();
        context.stop();
        context.run();
        context.close();
    }
}
