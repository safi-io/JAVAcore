package Lab3;

class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double CalculateCircumference() {
        double ccf = 3.14 * radius * radius;
        return ccf;
    }
}

public class circleData {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(102.123);
        System.out.println(c1.getRadius());
        System.out.println(c1.CalculateCircumference());
    }
}
