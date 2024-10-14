package com.lab5;

class studentRecord {
    private String degree;

    public void setDegree(String deg) {
        degree = deg;
    }

    public String getDegree() {
        return degree;
    }
}

class employeeRecord {
    private int emp_id;
    private double salary;

    public void setEmp_id(int id) {
        emp_id = id;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setSalary(int sal) {
        salary = sal;
    }


    public double getSalary() {
        return salary;
    }
}

class Manager {
    private String title;
    private double dues;
    private employeeRecord emp;
    private studentRecord stu;

    public Manager(String title, double dues, employeeRecord emp, studentRecord stu) {
        this.title = title;
        this.dues = dues;
        this.emp = emp;
        this.stu = stu;
    }

    public void display() {
        System.out.println("Title is : " + title);
        System.out.println("Dues are : " + dues);
        System.out.println();
        System.out.println("Employee record is as under:");
        System.out.println("EmployeeId is : " + emp.getEmp_id());
        System.out.println("EmployeeId is : " + emp.getSalary());
        System.out.println();
        System.out.println("Student record is as under: ");
        System.out.println("Degree is : " + stu.getDegree());
    }
}

public class activity1 {
    public static void main(String args[]) {
        studentRecord st = new studentRecord();
        st.setDegree("LLB");

        employeeRecord ep = new employeeRecord();
        ep.setEmp_id(101);
        ep.setSalary(3500);

        Manager mg = new Manager("Head of Department", 5000, ep, st);
        mg.display();
    }
}