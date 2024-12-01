package com.ObjectStreaming;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private transient String password;

    public Student(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student Name: " + this.name + ".\nStudent Age: " + this.age + ".\nPassword is: " +  this.password + ".\n";
    }

}

public class writing {
    public static void main(String[] args) {
        Student s1 = new Student("Safi", 19, "random");
        Student s2 = new Student("Asad", 28, "random");

        System.out.println(s1);
        System.out.println(s2);

        String filePath = "/media/safi-khan/NOT UBUNTU/JAVA PRACTICE/com/ObjectStreaming/Data.dat";

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(s2);
            oos.writeObject(s1);
            System.out.print("Object Serialization Done.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

