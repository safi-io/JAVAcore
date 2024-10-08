package com.safikhan.inheritance.university.labWork07_10.activity1;

public class Student extends Person {
    private String reg;
    private int marks;

    public Student() {
        super();
        reg = "FA23-BCS-273";
        marks = 97;
    }

    public Student(String name, String id, double phone, String reg, int marks) {
        super(name, id, phone);
        this.reg = reg;
        this.marks = marks;

    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void display() {
        super.display();
        System.out.println(reg + " " + marks);
    }
}
