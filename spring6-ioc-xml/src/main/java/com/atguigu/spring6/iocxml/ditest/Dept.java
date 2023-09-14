package com.atguigu.spring6.iocxml.ditest;

import java.util.List;

public class Dept {

    private List<Emp> empList;

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }
    private String dname;

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }


    public void info(){
        System.out.println("Department name: " + dname);

        for(Emp emp:empList){
            System.out.println(emp.getEname());
        }
    }
}
