package com.lucien.observerPattern;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Lucien on 2017/10/8.
 */
public class Teacher implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg.toString());
    }
}
