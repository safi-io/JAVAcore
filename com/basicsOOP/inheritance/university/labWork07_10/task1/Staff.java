package com.basicsOOP.inheritance.university.labWork07_10.task1;
import java.util.Date;

public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary, Date dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Title: " + title);
    }
}
