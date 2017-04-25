package com.simongk.kolokwium;

import com.simongk.kolokwium.point.Point;
import com.simongk.kolokwium.square.Square;

/**
 * Created by Groobaz on 2017-04-25.
 */
public class Application {

    public static void main(String[] args) {
        Draw draw = new Draw();
        draw.draw(new Square().getPointsOfSquare(10, new Point(5,5)));
    }

}
