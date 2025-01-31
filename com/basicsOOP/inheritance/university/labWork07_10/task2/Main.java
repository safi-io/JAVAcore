package com.basicsOOP.inheritance.university.labWork07_10.task2;

import java.util.Scanner;

abstract class Publication {
    protected String title;
    protected double price;

    public void setPublication() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title: ");
        title = sc.nextLine();
        System.out.print("Enter price: ");
        price = sc.nextDouble();
    }

    abstract void display();
}

class Book extends Publication {
    private int pageCount;

    public void setBook() {
        setPublication();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter page count: ");
        pageCount = sc.nextInt();
    }
    public void display() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Price: $" + price);
        System.out.println("Page Count: " + pageCount);
    }
}

class Tape extends Publication {
    private double playingTime;

    public void setTape() {
        setPublication();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter playing time (in minutes): ");
        playingTime = sc.nextDouble();
    }

    public void display() {
        System.out.println("Tape Details:");
        System.out.println("Title: " + title);
        System.out.println("Price: $" + price);
        System.out.println("Playing Time: " + playingTime + " minutes");
    }
}

public class Main {
    public static void main(String[] args) {
        Book myBook = new Book();
        Tape myTape = new Tape();

        System.out.println("Enter details for the book:");
        myBook.setBook();
        System.out.println("\nDetails of the book:");
        myBook.display();

        System.out.println("\nEnter details for the tape:");
        myTape.setTape();
        System.out.println("\nDetails of the tape:");
        myTape.display();
    }
}
