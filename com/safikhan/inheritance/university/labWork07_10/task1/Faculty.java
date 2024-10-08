package com.safikhan.inheritance.university.labWork07_10.task1;
import java.util.Date;

public class Faculty extends Employee{
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary, Date dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Office Hours: " + officeHours);
        System.out.println("Rank: " + rank);
    }
}
