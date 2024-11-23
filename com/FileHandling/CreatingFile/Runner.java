package com.FileHandling.CreatingFile;
import java.io.*;

public class Runner {
    public static void main(String[] args) throws IOException {
        File f = new File("//media//safi-khan//NOT UBUNTU//JAVA PRACTICE//com//FileHandling//CreatingFile//firstFile.txt");

        if(f.createNewFile()) {
            System.out.println("File Successfully Created..");
        }else {
            System.out.println("File Unable to be Created..");
        }
    }
}
