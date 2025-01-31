package com.basicsOOP.inheritance.yt;

public class Electronics {

    Electronics(String str) {
        System.out.println("ELECTRONICS CALLED BY " +str);
    }
    private String name;
    private boolean isBlack;

    public boolean isBlack() {
        return isBlack;
    }

    public void setBlack(boolean black) {
        isBlack = black;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayName() {
        System.out.println("I am a default Electronics device.");
    }

}
