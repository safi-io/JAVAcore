package com.basicsOOP.inheritance.university.labWork07_10.task1;
import java.util.Date;

public class Main {
        public static void main(String[] args) {
            Person person = new Person("Alice", "123 Main St", "555-1234", "alice@example.com");
            Student student = new Student("Bob", "456 Elm St", "555-5678", "bob@example.com", "Senior");
            Employee employee = new Employee("Charlie", "789 Oak St", "555-9012", "charlie@example.com", "HR", 60000, new Date());
            Faculty faculty = new Faculty("David", "321 Pine St", "555-3456", "david@example.com", "Math Dept", 75000, new Date(), "10-2", "Professor");
            Staff staff = new Staff("Eva", "654 Cedar St", "555-7890", "eva@example.com", "Admin", 50000, new Date(), "Assistant");

            System.out.println("\nPerson Info:");
            person.display();

            System.out.println("\nStudent Info:");
            student.display();

            System.out.println("\nEmployee Info:");
            employee.display();

            System.out.println("\nFaculty Info:");
            faculty.display();

            System.out.println("\nStaff Info:");
            staff.display();
        }
}
