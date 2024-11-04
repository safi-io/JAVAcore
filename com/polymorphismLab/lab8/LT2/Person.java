package com.polymorphismLab.lab8.LT2;

abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract  protected boolean isOutstanding();
}
