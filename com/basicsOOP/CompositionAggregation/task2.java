package com.basicsOOP.CompositionAggregation;

class Book {
    private Person author;
    private String bookName;
    private String bookPublisher;

    public Book(Person author, String bookName, String bookPublisher) {
        this.author = author;
        this.bookName = bookName;
        this.bookPublisher = bookPublisher;
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }
}

public class task2 {
    public static void main(String[] args) {
        Person p1 = new Person("Ali", 20, new Address(10,20,"Lahore", 37300));

        Book b1 = new Book(p1, "Atomic Habits", "New Rise Publications");

        System.out.println(b1.getAuthor().getAddress().getCity()); // Lahore

        b1.getAuthor().getAddress().setCity("Miami");

        System.out.print(b1.getAuthor().getAddress().getCity()); // Miami

    }
}
