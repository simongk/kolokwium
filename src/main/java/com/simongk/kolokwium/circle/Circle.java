package com.simongk.kolokwium.circle;

import com.simongk.kolokwium.point.Point;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Groobaz on 2017-04-25.
 */
public class Circle {

    private double radius;
    private Point point;
    private int howMany;

    public List<Point> getPointsOfCircle(int howMany, double radius, Point center){
        List<Point> circlePoints = new ArrayList<>();
        double slice = 2 * 3.14 / howMany;
        for (int i = 0; i < howMany; i++)
        {
            double angle = slice * i;
            int newX = (int)(center.getX() + radius * Math.cos(angle));
            int newY = (int)(center.getY() + radius * Math.sin(angle));
            Point p = new Point(newX, newY);
            circlePoints.add(p);
        }
        return circlePoints;
    }




}
