package com.basicsOOP.objectPassing;

class Fraction {
    private int num;
    private int deno;
    public Fraction() {
        num = 0;
        deno = 1;
    }
    public Fraction(int num, int deno) {
        this.num = num;
        this.deno = deno;
    }

    public boolean equals(Fraction other) {
        return this.num * other.deno == this.deno * other.num;
    }

    public void display() {
        System.out.println(num + " " + deno);
    }
}

public class LT3Fraction {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(4,1);
        Fraction f2 = new Fraction(8,2);
        if (f1.equals(f2)) {
            System.out.println("The fractions are identical.");
        } else {
            System.out.println("The fractions are not identical.");
        }
    }
}
