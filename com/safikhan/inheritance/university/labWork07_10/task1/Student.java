package com.safikhan.inheritance.university.labWork07_10.task1;

public class Student extends Person {
    private String status;

    public Student(String name, String address, String phoneNumber, String emailAddress, String status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Status: " + status);
    }
}
