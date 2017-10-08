package com.lucien.observerPattern;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Lucien on 2017/10/8.
 */
public class Xiaoming extends Observable {
    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }

    public void study(){
        System.out.println("学习ing");
        super.setChanged();
        super.notifyObservers("报告老师，小明在学习");
    }

    public void play(){
        System.out.println("玩耍ing");
        super.setChanged();
        super.notifyObservers("报告老师，小明在玩");
    }
}
