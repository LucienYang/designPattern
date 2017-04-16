package com.lucien.commandPattern;

/**
 * Created by Lucien on 2017/4/16.
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void save(){
        this.command.save();
    }

    public void delete(){
        this.command.delete();
    }
    public void update(){
        this.command.update();
    }
    public void select(){
        this.command.select();
    }

}
