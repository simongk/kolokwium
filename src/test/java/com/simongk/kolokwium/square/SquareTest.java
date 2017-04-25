package com.simongk.kolokwium.square;

import com.simongk.kolokwium.point.KarthesianToPolar;
import com.simongk.kolokwium.point.Point;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Groobaz on 2017-04-25.
 */
public class SquareTest {

    private Square square;
    private Point point;
    private KarthesianToPolar karthesianToPolar;

    @Before
    public void setup(){
        square = new Square();
        karthesianToPolar = new KarthesianToPolar();
    }

    @Test
    public void shouldDrawSquare(){
        //given
        int length = 1;
        point = new Point(0,0);
        List<Point> points = Arrays.asList(new Point(0, 0),
                new Point(1, 0), new Point(1, 1), new Point(0, 1));

        //when
        List<Point> listOfPoints = square.getPointsOfSquare(length, point);

        //then
        listOfPoints.forEach(e -> System.out.println(e.toString()));
        points.forEach(e -> System.out.println(e.toString()));

        Assert.assertEquals(listOfPoints.get(1).toString(), points.get(1).toString());
    }



}
