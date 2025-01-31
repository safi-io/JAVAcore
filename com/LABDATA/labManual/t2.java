package com.LABDATA.labManual;

interface Payable {
    double getPaymentAmount();
}

class Invoice implements Payable {
    @Override
    public double getPaymentAmount() {
        System.out.println("Invoice");
        return 0;
    }
}

class Employee implements Payable {
    @Override
    public double getPaymentAmount() {
        System.out.println("Employee");
        return 0;
    }
}

class SalariedEmployee extends Employee {
    private double weeklySalary;
}

public class t2 {
    public static void main(String[] args) {
        Payable p1 = new Invoice();
        Payable p2 = new Employee();
        Payable p3 = new SalariedEmployee();

        p1.getPaymentAmount();
        p2.getPaymentAmount();
        p3.getPaymentAmount();
    }
}
