package com.basicsOOP.inheritance.university.labWork07_10.task1;
import java.util.Date;

public class Employee extends Person{
    private String office;
    private double salary;
    private Date dateHired;

    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary, Date dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Office: " + office);
        System.out.println("Salary: $" + salary);
        System.out.println("Date Hired: " + dateHired.toString());
    }
}
