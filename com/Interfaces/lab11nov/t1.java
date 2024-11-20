package com.Interfaces.lab11nov;

interface Shape {
    void getArea();
}

class Circle implements Shape {
    @Override
    public void getArea() {
        System.out.println("CIRCLE");
    }
}

class Rectangle implements Shape {
    @Override
    public void getArea() {
        System.out.println("RECTANGLE");
    }
}


public class t1 {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        s1.getArea();
        s2.getArea();
    }
}
