package com.FileHandling.DisplayingInformation;

import java.io.*;

public class Runner {
    public static void main(String[] args) throws IOException {
        File f = new File("//media//safi-khan//NOT UBUNTU//JAVA PRACTICE//com//FileHandling//CreatingFile//firstFile.txt");

        if (f.exists()) {
            System.out.println("File Name: " + f.getName());
            System.out.println("Absolute Path: " + f.getAbsolutePath());
            System.out.println("File Can be Read: " + f.canRead());
            System.out.println("File Can be Written: " + f.canWrite());
            System.out.println("File Size: " + f.length());
        }
        else {
            System.out.println("File doest not exists.");
        }
    }
}
