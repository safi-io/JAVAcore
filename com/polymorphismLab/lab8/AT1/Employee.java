package com.polymorphismLab.lab8.AT1;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String toString() {
        return String.format(firstName + " " +  lastName + " " + socialSecurityNumber);
    }

    public abstract double earnings();
}