package com.classAssignments.a2;

class Employee {
    private int empId;
    private String empName;
    private String empPosition;
    private double empSalary;
    private long empBankAcc;

    // Parametrized Constructor
    public Employee(int empId, String empName, String empPosition, double empSalary, long empBankAcc) {
        this.empId = empId;
        this.empName = empName;
        this.empPosition = empPosition;
        this.empSalary = empSalary;
        this.empBankAcc = empBankAcc;
    }

    // Setters and Getters

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpPosition() {
        return empPosition;
    }

    public void setEmpPosition(String empPosition) {
        this.empPosition = empPosition;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void getSalary(String authorizationCode) {
        if(authorize(authorizationCode)) {
            System.out.println("Salary is: " + this.empSalary);
            return;
        }
        System.out.println("Unauthorized Access");
    }

    // Method for Validation
    private boolean authorize(String authorizationCode) {
        // Here we can add our complex authorization code
        return authorizationCode.equals("Hello World");
    }

    // Updated Salary Method (Simulates Authorization)
    public void updateSalary(double empNewSalary, int empId, String authorizationCode) {
        if(empId != this.empId || !authorize(authorizationCode)) {
            System.out.println("Unauthorized Access!");
            return;
        }
        this.empSalary = empNewSalary;
        displayInformation();
    }

    // Can only be called by Authorized Person
    private void displayInformation() {
        System.out.println("Employee Information");
        System.out.println("\tID: " + this.empId);
        System.out.println("\tName: " + this.empName);
        System.out.println("\tPosition: " + this.empPosition);
        System.out.println("\tSalary: " + this.empSalary);
        System.out.println("\tBank Acc: " + this.empBankAcc);
    }
}

public class EmployeeData {
    public static void main(String[] args) {
        Employee e1 = new Employee(101,"Safi", "HR", 56754, 12345);
        e1.updateSalary(2000, 101, "Hello World");
        e1.getSalary("Hello World");
    }
}