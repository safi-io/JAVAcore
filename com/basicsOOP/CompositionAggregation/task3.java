package com.basicsOOP.CompositionAggregation;


class Point {
    private int xCord;
    private int yCord;

    public Point(int xCord, int yCord) {
        this.xCord = xCord;
        this.yCord = yCord;
    }

    public int getxCord() {
        return xCord;
    }

    public void setxCord(int xCord) {
        this.xCord = xCord;
    }

    public int getyCord() {
        return yCord;
    }

    public void setyCord(int yCord) {
        this.yCord = yCord;
    }

    public void display() {
        System.out.println(xCord + " " + yCord);
    }
}

class Line {
    private Point startPoint;
    private Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double findDistance() {
        return Math.sqrt(Math.pow(startPoint.getyCord() - startPoint.getxCord(), 2) + Math.pow(endPoint.getyCord() - endPoint.getxCord(), 2));
    }
}

public class task3 {
    public static void main(String[] args) {
        Line l1 = new Line(new Point(1,2), new Point(3,4));
        System.out.println("Line Distance is: " + l1.findDistance());

        Line l2 = new Line(new Point(10,20), new Point(5,8));
        System.out.println("Line Distance is: " + l2.findDistance());
    }
}
