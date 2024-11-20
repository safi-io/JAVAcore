package Lab3;

class Point {
    private int x;
    private int y;

    public Point() {
        x=10;
        y=20;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void display() {
        System.out.println("x coordinate = " + x
                + " y coordinate = " + y);
    }

    public void movePoint(int a, int b) {
        x = x + a;
        y = y + b;
    }
}

public class pointData {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.display();
    }
}