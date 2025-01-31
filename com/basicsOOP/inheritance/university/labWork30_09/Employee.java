package com.basicsOOP.inheritance.university.labWork30_09;

public class Employee {
    public static void main(String[] args) {
        EmployeeData p1 = new EmployeeData();
        System.out.println(p1.id);

        Developer c1 = new Developer();
        c1.work();
    }
}

class EmployeeData {
    protected String name;
    protected int id =2000;
    protected double salary;
    protected void work() {
        System.out.println("Employee is working..");
    }
}

class Developer extends EmployeeData {
    boolean isWebsiteDeveloper;
    protected void work() {
        System.out.println("Developer is coding...");
    }
}