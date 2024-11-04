package com.classAssignments.a3;

class UniversityUser {
    protected int userId;
    protected String userName;
    protected String userEmail;

    public UniversityUser(int userId, String userName, String userEmail) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
    }

    public void displayInformation() {
        System.out.println("User Information");
        System.out.println("\tID: " + this.userId);
        System.out.println("\tName: " + this.userName);
        System.out.println("\tEmail: " + this.userEmail);
    }
}

class Student extends UniversityUser {
    private String stdMajor;
    private int stdYearOfStudy;

    public Student(int userId, String userName, String userEmail, String stdMajor, int stdYearOfStudy) {
        super(userId, userName, userEmail);
        this.stdMajor = stdMajor;
        this.stdYearOfStudy = stdYearOfStudy;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Student Information");
        System.out.println("\tMajor: " + this.stdMajor);
        System.out.println("\tYear of Study: " + this.stdYearOfStudy);
        System.out.println();
    }
}

class Professor extends UniversityUser {
    private String profDepartment;
    private String profResearchArea;

    public Professor(int userId, String userName, String userEmail, String profDepartment, String profResearchArea) {
        super(userId, userName, userEmail);
        this.profDepartment = profDepartment;
        this.profResearchArea = profResearchArea;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Professor Information");
        System.out.println("\tDepartment: " + this.profDepartment);
        System.out.println("\tResearch Area: " + this.profResearchArea);
        System.out.println();
    }
}

class Administrator extends UniversityUser {
    private String admRole;
    private String admOfficeLocation;

    public Administrator(int userId, String userName, String userEmail, String admRole, String admOfficeLocation) {
        super(userId, userName, userEmail);
        this.admRole = admRole;
        this.admOfficeLocation = admOfficeLocation;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Administrator Information");
        System.out.println("\tRole: " + this.admRole);
        System.out.println("\tOffice Location: " + this.admOfficeLocation);
        System.out.println();
    }
}

public class University {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student(1, "John Doe", "john.doe@university.com", "Computer Science", 3);
        student.displayInformation();

        // Create a Professor object
        Professor professor = new Professor(2, "Dr. Jane", "jane.smith@university.com", "Physics", "Quantum Mechanics");
        professor.displayInformation();

        // Create an Administrator object
        Administrator admin = new Administrator(3, "Mr. Admin", "admin@university.com", "Registrar", "Room 101");
        admin.displayInformation();
    }
}