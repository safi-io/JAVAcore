package com.basicsOOP.inheritance.university.labWork30_09;

class ParentData {
    protected String Name;
    protected int age;
    protected void speak() {
        System.out.println("Parent is Speaking...");
    }
}

class ChildData extends ParentData {
    protected boolean isGoingToSchool;
    protected void speak() {
        System.out.println("Child is Speaking...");
    }

}

class Parent {
    public static void main(String[] args) {
        ParentData p1 = new ParentData();
        System.out.println(p1.age);

        ChildData c1 = new ChildData();
        System.out.println(c1.isGoingToSchool);
    }
}
