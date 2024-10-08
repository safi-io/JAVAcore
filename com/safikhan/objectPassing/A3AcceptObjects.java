package com.safikhan.objectPassing;


class Point {
    private int X;
    private int Y;

    public Point() {
        X = 5;
        Y = 6;
    }
    public Point(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }
    public void setX(int X) {
        this.X = X;
    }
    public void setY(int Y) {
        this.Y = Y;
    }
    public int getX() {
        return X;
    }
    public int getY() {
        return Y;
    }
    public Point Add(Point Pa, Point Pb) {
        Point p_new = new Point(this.X + Pa.X + Pb.X, this.Y + Pa.Y + Pb.Y);
        return p_new;
    }
    public void display() {
        System.out.println(X);
        System.out.println(Y);
    }
}

public class A3AcceptObjects {
    public static void main(String[] args) {

        Point p1 = new Point(10, 20);
        Point p2 = new Point(30, 40);
        Point p3 = new Point();
        Point p4 = p1.Add(p2, p3);
        p4.display();
    }
}
