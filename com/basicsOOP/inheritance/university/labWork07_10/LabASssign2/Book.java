package com.basicsOOP.inheritance.university.labWork07_10.LabASssign2;

class BookData {
    private String author_name;
    private String[] chapterNames = new String[100];

    BookData(String author_name, String[] chapterNames) {
        this.author_name = author_name;
        System.arraycopy(chapterNames, 0, this.chapterNames, 0, chapterNames.length);
    }

    public String getAuthor() {
        return author_name;
    }

    public void setAuthor(String author_name) {
        this.author_name = author_name;
    }

    public String[] getChapterNames() {
        return chapterNames;
    }

    public void setChapterNames(String[] chapterNames) {
        System.arraycopy(chapterNames, 0, this.chapterNames, 0, chapterNames.length);
    }

    public boolean compareAuthor(BookData other) {
        if (this.author_name == other.author_name) {
            return true;
        }
        return false;
    }

    public int getChapterNo() {
        int count = 0;
        for (int i = 0; i < this.getChapterNames().length; i++) {
            if (this.getChapterNames()[i] == null) {
                break;
            }
            count++;
        }
        return count;
    }

    public void compareChapters(BookData other) {

        // Printing Result
        if(this.getChapterNo() == other.getChapterNo()) {
            System.out.println("BOTH HAVE SAME NUMBER OF CHAPTERS");}

        String result = (this.getChapterNo() > other.getChapterNo()) ? this.author_name + " Highest" : other.author_name + " Highest";

        System.out.println(result);
    }

    public void display() {
        System.out.println(author_name + " " + chapterNames);
    }
}

public class Book {
    public static void main(String[] args) {
        String[] chpArray = {"Hello Pakistan", "Atomic Lessons"};
        String[] chpArray2 = {"Hello World", "Atomic Habits", "DUMB GUYS", "IDIOTS", "NERD"};

        BookData b1 = new BookData("John Doe", chpArray);
        BookData b2 = new BookData("Jone Doe", chpArray2);

        if (b1.compareAuthor(b2)) {
            System.out.println("Authors are same");
        } else {
            System.out.println("Authors are not same");
        }

        b1.compareChapters(b2);
    }
}