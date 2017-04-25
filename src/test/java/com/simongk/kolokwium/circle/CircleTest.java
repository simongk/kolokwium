package com.simongk.kolokwium.circle;

import com.simongk.kolokwium.point.Point;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by Groobaz on 2017-04-25.
 */
public class CircleTest {

     private Circle circle;

     @Before
    public void setup(){
        circle = new Circle();
    }

    @Test
    public void shouldReturnPointsOfCircle(){
        //given
        Point center = new Point(0,0);

        //when
        List<Point> pointList = circle.getPointsOfCircle(10,center);

        //then
        Assert.assertEquals(pointList.get(1).toString(),"Point: (7.0,7.0)");
    }

}
