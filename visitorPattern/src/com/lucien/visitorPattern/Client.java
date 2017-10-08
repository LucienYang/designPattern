package com.lucien.visitorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lucien on 2017/8/18.
 */
public class Client {
    private static List<Employee> mockEmployee(){
        List<Employee> list = new ArrayList<>();
        CommonEmployee employee1 = new CommonEmployee("张三","男",1000,"写bug");
        CommonEmployee employee2 = new CommonEmployee("李四","男",4000,"写代码");
        ManagerEmployee employee3 = new ManagerEmployee("王天霸","男",20000,"拍马屁");
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        return list;
    }

    public static void main(String[] args) {
        List<Employee> list = mockEmployee();
        ShowReportVisitor showReportVisitor = new ShowReportVisitor();
        TotalSalaryVisitor totalSalaryVisitor = new TotalSalaryVisitor();
        for(Employee e:list){
            e.accept(showReportVisitor);
            e.accept(totalSalaryVisitor);
        }
        System.out.println(showReportVisitor.getReport());
        System.out.println(totalSalaryVisitor.getTotalSalary());
    }
}
