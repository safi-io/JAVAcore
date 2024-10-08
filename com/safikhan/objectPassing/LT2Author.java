package com.safikhan.objectPassing;

class Book {
    private String author;
    private String[] chapterNames = new String[100];

    public Book() {
        this.author = null;
        this.chapterNames = null;
    }

    public Book(String author, String[] chapterNames) {
        this.author = author;
        if (chapterNames.length <= 100) {
            System.arraycopy(chapterNames, 0, this.chapterNames, 0, chapterNames.length);
        } else {
            System.out.println("Only the first 100 chapters will be stored.");
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String[] getChapterNames() {
        return chapterNames;
    }

    public void setChapterNames(String[] chapterNames) {
        if (chapterNames.length <= 100) {
            System.arraycopy(chapterNames, 0, this.chapterNames, 0, chapterNames.length);
        } else {
            System.out.println("Only the first 100 chapters will be stored.");
        }
    }

    // Method to compare authors of two books
    public boolean compareBooks(Book other) {
        return this.author.equals(other.getAuthor());
    }

    // Method to compare chapters of two books and return the book with more chapters
    public Book compareChapterNames(Book other) {
        int thisBookChapters = countChapters();
        int otherBookChapters = other.countChapters();

        if (thisBookChapters > otherBookChapters) {
            return this;
        } else {
            return other;
        }
    }

    private int countChapters() {
        int count = 0;
        for (String chapter : chapterNames) {
            if (chapter != null) {
                count++;
            }
        }
        return count;
    }

    public void displayBookInfo() {
        System.out.println("Author: " + author);
        System.out.println("Chapters: ");
        for (String chapter : chapterNames) {
            if (chapter != null) {
                System.out.println(chapter);
            }
        }
    }
}

public class LT2Author {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setAuthor("John Doe");
        String[] chapters1 = {
                "Introduction", "Chapter 1: Java Basics", "Chapter 2: OOP Concepts"
        };
        book1.setChapterNames(chapters1);

        String[] chapters2 = {
                "Preface", "Chapter 1: Getting Started", "Chapter 2: Advanced Java", "Chapter 3: Data Structures"
        };
        Book book2 = new Book("Jone Doe", chapters2);

        // Compare the authors of the two books
        boolean sameAuthor = book1.compareBooks(book2);
        System.out.println("Do both books have the same author? " + sameAuthor);

        // Compare the chapters and display the author of the book with more chapters
        Book largerBook = book1.compareChapterNames(book2);
        System.out.println("The author of the book with more chapters is: " + largerBook.getAuthor());
    }
}

