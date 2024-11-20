interface ecoFriendly {
    void showEcoRating();
}

abstract class Vehicle {
    protected String name;
    protected int id;
    protected double distance;

    abstract void start();

    abstract double calculateFare(double Distance);

    Vehicle(String name, int id, double distance) {
        this.name = name;
        this.id = id;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}

class Car extends Vehicle {

    Car(String name, int id, double distance) {
        super(name, id, distance);
    }

    @Override
    void start() {
        System.out.println("CAR STARTING");
    }

    @Override
    double calculateFare(double Distance) {
        return 0;
    }
}

class Bike extends Vehicle implements ecoFriendly {
    private int rating;

    Bike(String name, int id, double distance, int rating) {
        super(name, id, distance);
        this.rating = rating;
    }

    @Override
    void start() {
        System.out.println("BIKE STARTING");
    }

    @Override
    double calculateFare(double Distance) {
        return distance;
    }


    @Override
    public void showEcoRating() {
        if (rating > 5) {
            System.out.println("It is eco-friendly because rating is " + rating);
        } else {
            System.out.println("It is not eco-friendly because rating is " + rating);
        }
    }
}

class ElectricScooter extends Vehicle implements ecoFriendly {

    private int rating;

    ElectricScooter(String name, int id,double distance, int rating) {
        super(name, id,distance);
        this.rating = rating;
    }

    @Override
    void start() {
        System.out.println("ELECTRIC SCOOTER STARTING");
    }

    @Override
    double calculateFare(double Distance) {
        return 0;
    }

    @Override
    public void showEcoRating() {
        if (rating > 5) {
            System.out.println("It is eco-friendly because rating is " + rating);
        } else {
            System.out.println("It is not eco-friendly because rating is " + rating);
        }
    }
}

public class Runner {
    public static void main(String[] args) {
        Vehicle v1 = new Car("SUZUKI", 101, 20);
        System.out.println(v1.getName() + " " + v1.getId());
        System.out.println("Distance is: " + v1.getDistance());
        System.out.println();

        Vehicle v2 = new Bike("HONDA", 102, 70, 7);
        System.out.println(v2.getName() + " " + v2.getId());
        ((Bike) v2).showEcoRating();
        System.out.println("Distance is: " + v2.getDistance());
        System.out.println();


        Vehicle v3 = new ElectricScooter("JOLT", 103, 50, 4);
        System.out.println(v3.getName() + " " + v3.getId());
        System.out.println("Distance is: " + v3.getDistance());
        ((ElectricScooter) v3).showEcoRating();
    }
}
