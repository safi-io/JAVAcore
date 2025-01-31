package com.basicsOOP.reference;

class BoxData {
    double l;
    double h;
    double w;

    public BoxData(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
}

class BoxWeight extends BoxData {
    double weight;

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }
}

public class Box {
    public static void main(String[] args) {
        BoxData b1 = new BoxWeight(1,2,3,4);
        // Weight cant be accessed because reference type determines what to include
//        System.out.println(b1.weight);
        System.out.println(b1.h);
    }
}

