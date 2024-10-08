package com.safikhan.inheritance.university.labWork07_10.activity2;

public class Employee {
    protected String name;
    protected String phone;
    protected String address;
    protected int allowance;

    public Employee(String name, String phone, String address, int allowance) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.allowance = allowance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAllowance() {
        return allowance;
    }

    public void setAllowance(int allowance) {
        this.allowance = allowance;
    }
}
