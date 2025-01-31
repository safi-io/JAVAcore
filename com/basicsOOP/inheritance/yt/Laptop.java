package com.basicsOOP.inheritance.yt;

public class Laptop extends Electronics {

    Laptop(String str) {
        super("Laptop");
        System.out.println("LAPTOP CALLED BY " + str);
    }
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void sayName() {
        System.out.println("I am a Laptop");
    }
}
