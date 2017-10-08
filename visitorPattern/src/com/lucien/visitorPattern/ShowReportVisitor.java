package com.lucien.visitorPattern;

/**
 * Created by Lucien on 2017/8/18.
 */
public class ShowReportVisitor extends IShowReportVisitor {
    private String info;

    @Override
    public String getReport() {
        return this.info;
    }

    @Override
    public void visit(CommonEmployee employee) {
        this.info += this.getBaseInfo(employee)+"\t工作："+employee.getJob()+"\n";
    }

    @Override
    public void visit(ManagerEmployee employee) {
        this.info += this.getBaseInfo(employee)+"\t业绩："+employee.getPerformance()+"\n";
    }

    private String getBaseInfo(Employee employee){
        return "姓名："+employee.getName()+"\t性别："+employee.getSex()+"\t薪水："+employee.getSalary();
    }
}
