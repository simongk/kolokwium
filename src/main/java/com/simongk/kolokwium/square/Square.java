package com.simongk.kolokwium.square;

import com.simongk.kolokwium.point.Point;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Groobaz on 2017-04-25.
 */
public class Square{

    public List<Point> getPointsOfSquare(int length, Point startingPoint) {
        Point p1 = new Point(startingPoint.getX()+length, startingPoint.getY());
        Point p2 = new Point(startingPoint.getX()+length, startingPoint.getY()+length);
        Point p3 = new Point(startingPoint.getX(), startingPoint.getY()+length);
        return Arrays.asList(startingPoint,p1,p2,p3);
    }

    public void draw(List<Point> listOfPoints){
        listOfPoints.forEach(System.out::println);
    }

    public List<Point> changeToPolar(List<Point> list) {
        List<Point> polarPoints = new ArrayList<>();
        list.forEach( e -> {
            double r = Math.sqrt(e.getX()*e.getX() + e.getY()*e.getY());
            double theta= Math.atan2(e.getY(),e.getX());
            Point newPoint = new Point(r,theta);
            polarPoints.add(newPoint);
        });

        return polarPoints;
    }
}
