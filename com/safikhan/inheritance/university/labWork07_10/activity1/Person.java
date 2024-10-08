package com.safikhan.inheritance.university.labWork07_10.activity1;

public class Person {
    protected String name;
    protected String id;
    protected double phone;

    public Person() {
        name ="John Doe";
        id = "1234";
        phone = 98765;
    }

    public Person(String name, String id, double phone) {
        this.name = name;
        this.id = id;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void display() {
        System.out.println(name + " " + id + " " + phone);
    }
}
