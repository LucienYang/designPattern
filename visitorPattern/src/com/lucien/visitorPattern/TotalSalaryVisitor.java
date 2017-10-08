package com.lucien.visitorPattern;

/**
 * Created by Lucien on 2017/8/18.
 */
public class TotalSalaryVisitor extends ITotalSalaryVisitor {

    private int totalSalary;

    @Override
    public void visit(CommonEmployee employee) {
        totalSalary += employee.getSalary();
    }

    @Override
    public void visit(ManagerEmployee employee) {
        totalSalary += employee.getSalary();
    }

    @Override
    public int getTotalSalary() {
        return this.totalSalary;
    }
}
