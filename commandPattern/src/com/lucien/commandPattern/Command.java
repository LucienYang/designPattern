package com.lucien.commandPattern;

/**
 * Created by Lucien on 2017/4/16.
 */
public abstract class Command {
    protected final BeanDao beanDao;

    public Command(BeanDao beanDao) {
        this.beanDao = beanDao;
    }

    public abstract void save();
    public abstract void update();
    public abstract void delete();
    public abstract void select();
}
