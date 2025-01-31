package com.basicsOOP.singleton;

public class Runner {
    public static void main(String[] args) {
        singleClassExample t1 = singleClassExample.getInstance();
        System.out.println(t1);

        singleClassExample t2 = singleClassExample.getInstance();
        System.out.println(t2);

        singleClassExample t3 = singleClassExample.getInstance();
        System.out.println(t3);

        singleClassExample t4 = singleClassExample.getInstance();
        System.out.println(t4);
    }
}
