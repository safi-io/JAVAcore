package com.safikhan.objectPassing;

class Distance {
    private int feet;
    private int inches;

    public Distance() {
        this.feet = 0;
        this.inches = 0;
    }

    public Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }


    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public void display() {
        System.out.println(this.feet + " " + this.inches);
    }

    public Distance add(Distance d1, Distance d2) {
        int feetTotal = d1.feet + d2.feet;
        int inchTotal = d1.inches + d2.inches;
        return new Distance(feetTotal, inchTotal);
    }
}

public class LT1Distance {
    public static void main(String[] args) {
        Distance d1 =  new Distance(20,30);
        Distance d2 =  new Distance(50,60);

        Distance test =  new Distance();

        test = test.add(d1,d2);
        test.display();
    }
}
