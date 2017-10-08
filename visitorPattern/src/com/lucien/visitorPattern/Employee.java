package com.lucien.visitorPattern;

/**
 * Created by Lucien on 2017/8/18.
 */
public abstract class Employee {
    protected String name;
    protected String sex;
    protected int salary;
    protected abstract void accept(IVisitor visitor);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
