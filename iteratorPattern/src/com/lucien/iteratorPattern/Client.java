package com.lucien.iteratorPattern;

/**
 * Created by Lucien on 2017/4/28.
 */
public class Client {
    public static void main(String[] args) {
        IProject project = new Project();
        project.addProject("项目1",12, 10000);
        project.addProject("项目2",222, 50000);
        project.addProject("项目3",234, 120000);
        IProjectIterator projectIterator = (IProjectIterator) project.iterator();
        while(projectIterator.hasNext()){
            IProject p= (IProject) projectIterator.next();
            p.getProjectInfo();
        }

    }
}
