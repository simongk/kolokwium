package com.simongk.kolokwium.square;

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

    @Before
    public void setup(){
        square = new Square();
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

    @Test
    public void shouldChangeFromKarthesianToPolar(){
        //given
        List<Point> list = square.getPointsOfSquare(1,new Point(0,1));

        //when
        int r = square.changeToPolar(list).get(1).getX();
        int theta = square.changeToPolar(list).get(1).getY();
        //then
        Assert.assertEquals(r,1);
        Assert.assertEquals(theta,0);


    }

}
