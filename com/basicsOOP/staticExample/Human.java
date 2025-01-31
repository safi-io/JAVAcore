package com.basicsOOP.staticExample;

public class Human {
    static int humanCount  = 20 ;
    int age;
    String name;
    boolean isMarried;

    Human(int age, String name, boolean isMarried) {
        Human.humanCount++;
        this.age = age;
        this.name = name;
        this.isMarried = isMarried;
    }

    void display() {
        System.out.println(age + " " + name + " " + isMarried);
    }

}
