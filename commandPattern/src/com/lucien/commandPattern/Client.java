package com.lucien.commandPattern;

/**
 * Created by Lucien on 2017/4/16.
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        invoker.setCommand(new SaveUserCommand());
        invoker.save();
    }
}
