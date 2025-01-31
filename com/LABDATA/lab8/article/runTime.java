package com.LABDATA.lab8.article;

class Vehicle {
    protected void Sound() {
        System.out.println("I am Vehicle");
    }
}

class Bike extends Vehicle {
    @Override
    public void Sound() {
        System.out.println("I am Bike");
    }
}

class Car extends Vehicle {
    @Override
    public void Sound() {
        System.out.println("I am Car");
    }
}

public class runTime {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Bike();
        Vehicle v3 = new Car();
        v1.Sound();
        v2.Sound();
        v3.Sound();
    }
}
