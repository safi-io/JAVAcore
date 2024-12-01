package com.ObjectStreaming;

import java.io.*;

public class reading {
    public static void main(String[] args) {
        String filePath = "/media/safi-khan/NOT UBUNTU/JAVA PRACTICE/com/ObjectStreaming/Data.dat";
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Student safi = (Student) ois.readObject();
            Student asad = (Student) ois.readObject();
            System.out.println(safi);
            System.out.println(asad);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
