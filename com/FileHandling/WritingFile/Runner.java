package com.FileHandling.WritingFile;

import java.io.FileWriter;
import java.io.IOException;

public class Runner {
    public static void main(String[] args) {
        String filePath = "/media/safi-khan/NOT UBUNTU/JAVA PRACTICE/com/FileHandling/CreatingFile/firstFile.txt";
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write("\nI study in COMSATS.");
            System.out.println("File is written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
