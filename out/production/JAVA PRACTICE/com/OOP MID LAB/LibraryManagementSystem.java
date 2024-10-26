class Resource {
    protected String title;
    protected int publicationYear;
    protected boolean availability;
    private Librarian Admin;

    public Resource(String title, int publicationYear, boolean availability, Librarian Admin) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.availability = availability;
        this.Admin = Admin;
    }

    public Librarian getAdmin() {
        return Admin;
    }

    public void setAdmin(Librarian admin) {
        Admin = admin;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}

class Book extends Resource {
    private int ISBN;

    public Book(String title, int publicationYear, boolean availability, int ISBN, Librarian Admin) {
        super(title, publicationYear, availability, Admin);
        this.ISBN = ISBN;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
}

class DVD extends Resource {
    public DVD(String title, int publicationYear, boolean availability, Librarian Admin) {
        super(title, publicationYear, availability, Admin);
    }

    public void play() {
        System.out.println("DVD Start Playing.");
    }
}

class Magazine extends Resource {
    public Magazine(String title, int publicationYear, boolean availability, Librarian Admin) {
        super(title, publicationYear, availability, Admin);
    }


}

class Librarian {
    private int emp_id;
    private String name;

    public Librarian(int emp_id, String name) {
        this.emp_id = emp_id;
        this.name = name;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Librarian l1 = new Librarian(1000, "Ahmed");

        Resource r1 = new Book("Atomic Habits", 1995, true, 101, l1);

        // Librarian Name through Resource
        System.out.println("Librarian Name: "+r1.getAdmin().getName());

        // Librarian ID
        System.out.println("Librarian ID: "+r1.getAdmin().getEmp_id());

        // Changing and Displaying Book Information
        r1.setTitle("Think and Grow Rich");
        System.out.println("Book Title: "+r1.getTitle());

        Resource r2 = new DVD("National Songs", 2012, false, l1);

        // Changing and Displaying DVD Information
        r2.setTitle("POP SONGS");
        System.out.println("DVD Title: "+r2.getTitle());



    }
}
