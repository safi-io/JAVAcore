package com.safikhan.inheritance.university.labWork07_10.activity2;

public class Runner {
    public static void main(String[] args) {
        Regular regEmp = new Regular("ALI", "1234", "Faisalabad", 12, 30000);
        regEmp.display();

        Adhoc adhEmp = new Adhoc("AHMED", "4545", "Lahore", 32, 65000, 25, 10000);
        adhEmp.display();

    }
}
