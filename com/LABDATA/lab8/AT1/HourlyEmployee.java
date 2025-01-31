package com.LABDATA.lab8.AT1;

public class HourlyEmployee extends Employee
{
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    public double earnings()
    {
        if (hours <= 40 )
            return wage * hours ;
        else
            return 40 * wage + (hours - 40 ) * wage * 1.5;
    } }