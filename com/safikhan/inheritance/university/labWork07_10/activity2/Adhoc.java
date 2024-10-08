package com.safikhan.inheritance.university.labWork07_10.activity2;

public class Adhoc extends Employee {
    private int numberOfWorkingDays;
    private int wage;

    public Adhoc(String name, String phone, String address, int allowance, int basicPay, int numberOfWorkingDays, int wage) {
        super(name, phone, address, allowance);
        this.numberOfWorkingDays = numberOfWorkingDays;
        this.wage = wage;
    }

    public void display() {
        System.out.println("Name: " + name + " Phone Number: " + phone + " Address: " + address + " Allowance: " + allowance + " Number Of Working Days: " + numberOfWorkingDays + " Wage: " + wage);
    }
}
