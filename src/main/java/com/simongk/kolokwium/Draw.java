package com.simongk.kolokwium;

import com.simongk.kolokwium.point.Point;

import java.util.List;

/**
 * Created by Groobaz on 2017-04-25.
 */
public class Draw {

    public void draw(List<Point> listOfPoints){
        listOfPoints.forEach(System.out::println);
    }
}
