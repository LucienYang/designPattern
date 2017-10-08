package com.lucien.visitorPattern;

/**
 * Created by Lucien on 2017/8/18.
 */
public class ManagerEmployee extends Employee {

    protected String performance;

    public ManagerEmployee() {
    }

    public ManagerEmployee(String name, String sex, int salary, String performance) {
        super.name = name;
        super.sex = sex;
        super.salary = salary;
        this.performance = performance;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    @Override
    protected void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
