package com.AbstractClasses;

abstract class Employee {
    protected String name = "Generic Employee";

    public Employee(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println(name + " is working.");
    }

    public abstract void report();

    public static void companyPolicy() {
        System.out.println("Employee must adhere to company policy.");
    }
}

class Developer extends Employee {
    protected static String name = "Developer";

    public Developer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(super.name + " is writing code.");
    }

    @Override
    public void report() {
        System.out.println(super.name + " submits daily progress report.");
    }

    public static void companyPolicy() {
        System.out.println(name + " follows agile practices.");
    }
}

class Manager extends Employee {
    protected String name = "Manager";

    public Manager(String name) {
        super(name);
    }

    @Override
    public void report() {
        System.out.println(super.name + " sends weekly team reports.");
    }
}

public class CorporateHierarchy {
    public static void main(String[] args) {
        Employee e1 = new Developer("Alice");
        Employee e2 = new Manager("Bob");

        e1.work();
        e1.report();

        e2.work();
        e2.report();
//
//        System.out.println("----");
//
//        Developer dev = new Developer("Charlie");
//        Manager mgr = new Manager("David");
//
//        dev.work();
//        dev.report();
//        dev.companyPolicy();
//        System.out.println("----");
//
//        mgr.work();
//        mgr.report();
//        mgr.companyPolicy();
//
//        System.out.println("----");
//
//        Employee.companyPolicy();
//        dev.companyPolicy();
    }
}