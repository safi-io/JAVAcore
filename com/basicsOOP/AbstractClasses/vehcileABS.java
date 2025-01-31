package com.basicsOOP.AbstractClasses;

abstract class Vehicle {
    void display() {
        System.out.println("I am Vehicle Display");
    }

    abstract void realDisplay();
}

class Car extends Vehicle {
    void realDisplay() {
        System.out.println("real display");
    }

}

public class vehcileABS{
    public static void vehcileABS(String[] args) {
        Car c1 = new Car();
        c1.realDisplay();
        c1.display();
    }

}

