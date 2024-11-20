package com.Interfaces.lab11nov;


interface A1 {
    default void show() {
        System.out.println("Show of A1");
    }

}

interface A2 {
    default void show() {
        System.out.println("Show of A2");
    }

}


public class testing implements A1, A2 {

    public void show() {
        A1.super.show();
    }

    public static void main(String[] args) {
        testing t1 = new testing();
        t1.show();
    }

}
