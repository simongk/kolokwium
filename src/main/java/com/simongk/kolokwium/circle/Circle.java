package com.simongk.kolokwium.circle;

import com.simongk.kolokwium.point.Point;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Groobaz on 2017-04-25.
 */
public class Circle {

    public List<Point> getPointsOfCircle(double radius, Point center){
        List<Point> circlePoints = new ArrayList<>();
        double slice = 2 * 3.14 / 8;
        for (int i = 0; i < 8; i++)
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
