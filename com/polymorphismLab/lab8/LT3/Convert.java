package com.polymorphismLab.lab8.LT3;

abstract class Convert {
    protected double presentValue;
    protected double convertedValue;

    public Convert(double presentValue) {
        this.presentValue = presentValue;
        this.convertedValue = 0;
    }

    abstract void calculate();
}
