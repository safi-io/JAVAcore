package com.FileHandling.ReadingFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Runner {
    public static void main(String[] args) {
        String filePath = "/media/safi-khan/NOT UBUNTU/JAVA PRACTICE/com/FileHandling/CreatingFile/firstFile.txt";


        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
