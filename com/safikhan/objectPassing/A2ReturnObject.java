package com.safikhan.objectPassing;

class Complex {
    private double real;
    private double imag;

    public Complex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

    public void show() {
        System.out.println(this.real + " + " + this.imag + "i");
    }
}

public class A2ReturnObject {
    public static void main(String[] args) {

        Complex c1 = new Complex(11, 2.3);
        Complex c2 = new Complex(9, 2.3);

        Complex c3 = c1.add(c2);

        c3.show();
    }
}
