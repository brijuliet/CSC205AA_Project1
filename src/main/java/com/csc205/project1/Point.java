package com.csc205.project1;

public class Point {

    private Double x;
    private Double y;

    public Point() {

    }

    public Point(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Double distance(Point p) {
        return Math.sqrt((this.getX() - p.getX()) * (this.getX() - p.getX()) + (this.getY() - p.getY()) * (this.getY() - p.getY()));
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public void setPoint(double v, double v1) {
        this.x = v;
        this.y = v1;
    }

    public void shiftX(double i) {
        this.x = x + i;
    }

    public void shiftY(double i) {
        this.y = y + i;
    }

    public void rotate(double rotation) {
        this.x = (x * Math.cos(rotation)) - (y * Math.sin(rotation));
        this.y = (x * Math.sin(rotation)) + (y * Math.cos(rotation));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x = " + x +
                ", y = " + y +
                '}';
    }
}
