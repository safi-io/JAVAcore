package com.basicsOOP.objectPassing;

class MyClass {
    int value;

    MyClass(int value) {
        this.value = value;
    }

    void changeValue(int newValue) {
        this.value = newValue;
    }
}

public class A1ValueChange {
    public static void main(String[] args) {
        MyClass obj = new MyClass(10);

        System.out.println("Original value: " + obj.value);

        obj.changeValue(20);

        System.out.println("Changed value: " + obj.value);
    }

}
