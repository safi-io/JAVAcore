package com.LABDATA.lab8.LT1;

public class Runner {
    public static void main(String[] args) {
        Package p1 = new Package("Safi", "Pakistan", "Raj", "India",120, 5);
        System.out.println(p1.calculateCost());

        Package p2 = new TwoDayPackage("Safi", "Pakistan", "Raj", "India", 120, 5, 100);

        System.out.println(p2.calculateCost());

        Package p3 = new OverNightPackage("Safi", "Pakistan", "Raj", "India", 120, 5, 200);

        System.out.println(p3.calculateCost());

    }
}
