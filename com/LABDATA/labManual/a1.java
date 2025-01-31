package com.LABDATA.labManual;

interface RegisterForExams {
    public void register();
}

class EmployeeTask implements RegisterForExams {
    private String name;
    private String date;
    private int salary;

    public EmployeeTask() {
        name = null;
        date = null;
        salary = 0;
    }

    public EmployeeTask(String name, String date, int salary) {
        this.name = name;
        this.date = date;
        this.salary = salary;
    }

    @Override
    public void register() {
        System.out.println("Employee is registered " + " Name " + name + " Salary " + salary + " Date" + date);
    }
}

class StudentTask implements RegisterForExams {
    private String name;
    private int age;
    private double gpa;

    public StudentTask() {
        name = null;
        age = 0;
        gpa = 0;
    }

    public StudentTask(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    @Override
    public void register() {
        System.out.println("Student is registered " + "Student name " + name + " gpa " + gpa);
    }
}


public class a1 {
    public static void main(String[] args) {

        EmployeeTask e = new EmployeeTask("Ahmed", "11,02,2001", 20000);
        StudentTask s = new StudentTask("Ali", 22, 3.5);
        e.register();
        s.register();
    }
}
