//class Resource {
//    protected String title;
//    protected int publicationYear;
//    protected boolean availability;
//
//    public Resource(String title, int publicationYear, boolean availability) {
//        this.title = title;
//        this.publicationYear = publicationYear;
//        this.availability = availability;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public int getPublicationYear() {
//        return publicationYear;
//    }
//
//    public void setPublicationYear(int publicationYear) {
//        this.publicationYear = publicationYear;
//    }
//
//    public boolean isAvailability() {
//        return availability;
//    }
//
//    public void setAvailability(boolean availability) {
//        this.availability = availability;
//    }
//}
//
//class Book extends Resource {
//    private int ISBN;
//
//    public Book(String title, int publicationYear, boolean availability, int ISBN) {
//        super(title, publicationYear, availability);
//        this.ISBN = ISBN;
//    }
//
//    public int getISBN() {
//        return ISBN;
//    }
//
//    public void setISBN(int ISBN) {
//        this.ISBN = ISBN;
//    }
//}
//
//class DVD extends Resource {
//    public DVD(String title, int publicationYear, boolean availability) {
//        super(title, publicationYear, availability);
//    }
//
//    public void play() {
//        System.out.println("DVD PLAYING");
//    }
//}
//
//class Magazine extends Resource {
//    public Magazine(String title, int publicationYear, boolean availability) {
//        super(title, publicationYear, availability);
//    }
//}
//
//class Librarian {
//    private String name;
//    private int id;
//    private Book b1;
//    private DVD d1;
//    private Magazine m1;
//
//    public Librarian(String name, int id, Book b1, DVD d1, Magazine m1) {
//        this.name = name;
//        this.id = id;
//        this.b1 = b1;
//        this.d1 = d1;
//        this.m1 = m1;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public Book getB1() {
//        return b1;
//    }
//
//    public void setB1(Book b1) {
//        this.b1 = b1;
//    }
//
//    public DVD getD1() {
//        return d1;
//    }
//
//    public void setD1(DVD d1) {
//        this.d1 = d1;
//    }
//
//    public Magazine getM1() {
//        return m1;
//    }
//
//    public void setM1(Magazine m1) {
//        this.m1 = m1;
//    }
//}
//
//public class myAttempt{
//    public static void main(String[] args) {
//        Book b1 = new Book("Atomic Habits", 2022, true, 101);
//        DVD d1 = new DVD("National Songs", 2012, false);
//        Magazine m1 = new Magazine("Pakistani Clothes", 2005, true);
//
//        Librarian l1 = new Librarian("SAFI", 150, b1, d1, m1);
//
//        // DVD Playing Through Librarian
//        l1.getD1().play();
//
//        // Librarian Changing Book Names
//        System.out.println(l1.getB1().getTitle());
//        l1.getB1().setTitle("Money Matters");
//        System.out.println(l1.getB1().getTitle());
//    }
//}
