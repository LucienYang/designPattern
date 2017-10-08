package com.lucien.iteratorPattern;

import java.util.Iterator;

/**
 * Created by Lucien on 2017/4/28.
 */
public interface IProject {
    public void addProject(String name, int memberNum, int cost);
    public void getProjectInfo();
    public Iterator iterator();
}
