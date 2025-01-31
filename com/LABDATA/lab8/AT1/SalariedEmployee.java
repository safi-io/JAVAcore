package com.LABDATA.lab8.AT1;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double
            salary) {
        super(firstName, lastName, socialSecurityNumber);
        weeklySalary = salary;
    }

    @Override
    public double earnings() {
        return weeklySalary;
    }
}