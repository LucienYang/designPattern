package com.lucien.iteratorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lucien on 2017/4/28.
 */
public class ProjectIterator implements IProjectIterator {
    List<IProject> list = new ArrayList<>();
    private int currentProjectIndex = 0;

    public ProjectIterator(List<IProject> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        boolean hasNext = true;
        if(this.currentProjectIndex >= this.list.size() || list.get(this.currentProjectIndex) == null){
            return false;
        }
        return hasNext;
    }

    @Override
    public IProject next() {
        return this.list.get(this.currentProjectIndex++);
    }
}
