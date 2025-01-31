package com.LABDATA.midLabExam;

class Vehicle {
    private String make;
    private int model;
    private int year;
    private double mileage;
    private Mechanic mech;

    public Vehicle(String make, int model, int year, double mileage, Mechanic mech) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.mech = mech;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public Mechanic getMechanic() {
        return mech;
    }

    public void displayInfo() {
        System.out.println("Vehicle Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);
        System.out.println("Mechanic Name: " + mech.getName());
        System.out.println("Mechanic ID: " + mech.getID());
    }


}

class Car extends Vehicle {

    public Car(String make, int model, int year, double mileage, Mechanic mech) {
        super(make, model, year, mileage, mech);
    }

    public void calculateFuel() {
        System.out.println("Calculating Fuel Efficiency.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("It is car");
    }
}

class Truck extends Vehicle {
    public Truck(String make, int model, int year, double mileage, Mechanic mech) {
        super(make, model, year, mileage, mech);
    }

    public void loadCargo() {
        System.out.println("Calculating Loaded Cargo");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("It is Truck");
    }
}

class Mechanic {
    private String name;
    private int ID;

    public Mechanic(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}


public class VMS {
    public static void main(String[] args) {
        Mechanic mech = new Mechanic("Ali", 101);
        Vehicle v1 = new Car("Honda", 2022, 10, 10.65 , mech);
        v1.displayInfo();
        v1.getMechanic().setName("Ahmed");
        System.out.println("----");
        v1.displayInfo();
    }
}
