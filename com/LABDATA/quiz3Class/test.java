package com.LABDATA.quiz3Class;

class UniversityUser {
    protected int id;
    protected String name;

    public UniversityUser(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println(id + " " + name);
    }
}

class Student extends UniversityUser {
    private String dept;

    public Student(int id, String name, String dept) {
        super(id, name);
        this.dept = dept;
    }

    public void display() {
        super.display();
        System.out.println(dept);
    }
}

public class test {
    public static void main(String[] args) {
        UniversityUser u1 = new Student(101, "safi", "cs");
        u1.display();
    }
}
