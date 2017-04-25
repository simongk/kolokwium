package com.simongk.kolokwium.point;

/**
 * Created by Groobaz on 2017-04-25.
 */
public class Point {

    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }

    @Override
    public String toString() {
        return "Point: ("+x+","+y+")";
    }

    public double getY() {
        return y;
    }
}
