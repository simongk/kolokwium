package com.simongk.kolokwium.point;

import com.simongk.kolokwium.square.Square;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by Groobaz on 2017-04-25.
 */
public class KarthesianToPolarTest {
    private Square square;
    private KarthesianToPolar karthesianToPolar;

    @Before
    public void setup(){
        square = new Square();
        karthesianToPolar = new KarthesianToPolar();
    }

    @Test
    public void shouldChangeFromKarthesianToPolar(){
        //given
        List<Point> list = square.getPointsOfSquare(1,new Point(0,1));

        //when
        double r = karthesianToPolar.changeToPolar(list).get(1).getX();
        double theta = karthesianToPolar.changeToPolar(list).get(1).getY();
        //then

        Assert.assertEquals((int) r ,1);
        Assert.assertEquals((int) theta,0);


    }
}
