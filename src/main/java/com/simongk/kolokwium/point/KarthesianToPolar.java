package com.simongk.kolokwium.point;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Groobaz on 2017-04-25.
 */
public class KarthesianToPolar {

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
