package com.basicsOOP.CompositionAggregation;

class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = checkMonth(month);
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void display() {
        System.out.println(day + " " + month + " " + year);
    }

    private int checkMonth(int testMonth) {
        if (testMonth > 0 && testMonth <= 12) {
            return testMonth;
        } else {
            System.out.println("Invalid month " + testMonth + ". Set to 1");
            return 1;
        }
    }



}

class employee {
    private String name;
    private String fName;
    private Date birthdate;
    private Date hiredate;

    public employee(String name, String fName, Date birthdate, Date hiredate) {
        this.name = name;
        this.fName = fName;
        this.birthdate = birthdate;
        this.hiredate = hiredate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public void display() {
        System.out.println("Name: " + name + " Father Name:" + fName);
        birthdate.display();
        hiredate.display();
    }
}

public class activity2 {
    public static void main(String[] args) {
        Date d1 = new Date(5,10,2009);
        Date d2 = new Date(10,20,2019);

        employee e1 = new employee("John", "Doe", d1, d1 );

        e1.display();
    }
}
