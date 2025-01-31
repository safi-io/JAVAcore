package com.LABDATA.lab8.LT2;

public class Runner {
    public static void main(String[] args) {
        Person persons[] = new Person[4];

        persons[0] = new Student("SAFI", 3.95);
        persons[1] = new Student("ALI", 3.00);

        persons[2] = new Professor("AINA", 55);
        persons[3] = new Professor("AHMED", 10);

        for(int i=0; i< persons.length; i++) {
            System.out.println(persons[i].isOutstanding());
        }
    }
}
