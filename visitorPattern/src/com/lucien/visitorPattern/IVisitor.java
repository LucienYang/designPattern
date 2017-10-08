package com.lucien.visitorPattern;

/**
 * Created by Lucien on 2017/8/18.
 */
public interface IVisitor {
    public void visit(CommonEmployee employee);
    public void visit(ManagerEmployee employee);
}
