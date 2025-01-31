package com.basicsOOP.CompositionAggregation;

class Address {
    private int streetNo;
    private int houseNo;
    private String city;
    private int code;

    public Address(int streetNo, int houseNo, String city, int code) {
        this.streetNo = streetNo;
        this.houseNo = houseNo;
        this.city = city;
        this.code = code;
    }

    public int getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(int streetNo) {
        this.streetNo = streetNo;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}

class Person {
    private String name;
    private int age;
    private Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

public class task1 {
    public static void main(String[] args) {
        Address a1 = new Address(10, 50, "Faisalabad", 101);
        Person p1 = new Person("Safi", 19, a1);

        System.out.println("Old City: " + p1.getAddress().getCity()); // Faisalabad
        p1.getAddress().setCity("Lahore"); // Lahore
        System.out.println("New City: " + p1.getAddress().getCity()); // Lahore
    }
}