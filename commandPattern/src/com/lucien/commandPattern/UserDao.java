package com.lucien.commandPattern;

/**
 * Created by Lucien on 2017/4/16.
 */
public class UserDao extends BeanDao {
    @Override
    public void find(String name) {
        System.out.println("find user "+name);
    }

    @Override
    public void insert(String name) {
        System.out.println("insert user "+name);
    }

    @Override
    public void update(String name) {
        System.out.println("update user "+name);
    }

    @Override
    public void delete(String name) {
        System.out.println("delete user "+name);
    }
}
