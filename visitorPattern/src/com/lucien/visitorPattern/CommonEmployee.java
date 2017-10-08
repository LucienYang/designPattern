package com.lucien.visitorPattern;

/**
 * Created by Lucien on 2017/8/18.
 */
public class CommonEmployee extends Employee {
    protected String job;

    public CommonEmployee() {
    }

    public CommonEmployee(String name, String sex, int salary, String job) {
        super.name = name;
        super.sex = sex;
        super.salary = salary;
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    protected void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
