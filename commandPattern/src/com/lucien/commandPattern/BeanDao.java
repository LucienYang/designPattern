package com.lucien.commandPattern;

/**
 * Created by Lucien on 2017/4/16.
 */
public abstract class BeanDao {
    public abstract void find(String name);
    public abstract void insert(String name);
    public abstract void update(String name);
    public abstract void delete(String name);
}
