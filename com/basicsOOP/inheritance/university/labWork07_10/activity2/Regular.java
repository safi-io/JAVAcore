package com.basicsOOP.inheritance.university.labWork07_10.activity2;

public class Regular extends Employee {
    private int basicPay;

    public Regular(String name, String phone, String address, int allowance, int basicPay) {
        super(name, phone, address, allowance);
        this.basicPay = basicPay;
    }

    public void display() {
        System.out.println("Name: " + name + " Phone Number: " + phone + " Address: " + address + " Allowance: " + allowance + " Basic Pay: " + basicPay);
    }


}
