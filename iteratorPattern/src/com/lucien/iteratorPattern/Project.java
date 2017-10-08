package com.lucien.iteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Lucien on 2017/4/28.
 */
public class Project implements IProject {

    List<IProject> list = new ArrayList<>();
    private String name;
    private int memberNum;
    private int cost;

    public Project() {
    }

    private Project(String name, int memberNum, int cost) {
        this.name = name;
        this.memberNum = memberNum;
        this.cost = cost;
    }

    @Override
    public void addProject(String name, int memberNum, int cost) {
        this.list.add(new Project(name,memberNum,cost));
    }

    @Override
    public void getProjectInfo() {
        System.out.println(this.name+"\t"+this.memberNum+"\t"+this.cost);
    }

    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(this.list);
    }
}
