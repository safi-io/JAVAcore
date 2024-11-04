package com.classAssignments.a3;

class Employee {
    private int id;
    private String name;
    private String position;
    private double salary;
    private long bankDetails;

    public Employee(int id, String name, String position, double salary, long bankDetails) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.bankDetails = bankDetails;
    }

    public void changeSalary(double salary, String Password) {
        boolean isAuthorized = checkAuth(Password);
        if(!isAuthorized) {
            System.out.println("Only Authorized Persons can do.");
            return;
        }
        this.salary = salary;
        System.out.println("Salary has been Updated.");
    }

    private boolean checkAuth(String Password) {
        String secretKey = "hash";
        return Password.equals(secretKey);
    }

    public void display() {
        System.out.println(id + " " + name + " " + position + " " + salary + " " + bankDetails);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public long getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(long bankDetails) {
        this.bankDetails = bankDetails;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

public class PayRoll {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"safi", "hr", 101, 31321);
        e1.display(); // Previous Salary

        e1.changeSalary(102, "hash"); // Updating Salary
        e1.display(); // Printing New Salary

        System.out.println("\n\nMuhammad Safiullah Khan");
        System.out.println("FA23-BCS-273");
    }
}
