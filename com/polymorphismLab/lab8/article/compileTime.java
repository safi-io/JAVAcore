package com.polymorphismLab.lab8.article;

abstract class Calculator{
    public static void add(int a, int b) {
        System.out.println(a+b);
    }
    public static void add(int a, int b, int c) {
        System.out.println(a+b+c);
    }
    public static void add(String a, String b) {
        System.out.println(a+b);
    }
    public static void add(double a, double b) {
        System.out.println(a+b);
    }

}

public class compileTime {
    public static void main(String[] args) {
        Calculator.add(1,2);
        Calculator.add(1,2,3);
        Calculator.add("Hello ", "World");
        Calculator.add(1.23, 6.57);
    }
}
