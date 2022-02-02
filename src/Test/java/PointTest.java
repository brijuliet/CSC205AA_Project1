import com.csc205.project1.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {

    final Point p1 = new Point(0.0, 0.0);
    final Point p2 = new Point(6.0, 8.0);

    @Test
    void distance() {

        double expected = 10.0;

        double actual = p1.distance(p2);

        assertEquals(expected, actual);

    }

    @Test
    void shiftX() {

        double shiftXVal = 3.0;

        p1.shiftX(shiftXVal);

        double expected = 3.0;

        double actual = p1.getX();

        assertEquals(expected, actual);

    }

    @Test
    void shiftY() {

        double shiftYVal = -7.0;

        p2.shiftY(shiftYVal);

        double expected = 1.0;

        double actual = p2.getY();

        assertEquals(expected, actual);

    }

    @Test
    void rotate() {

        double rotation = Math.PI;

        p2.rotate(rotation);

        double expectedX = -6.000000000000001;

        double actualX = p2.getX();

        double expectedY = -8.0;

        double actualY = p2.getY();

        assertEquals(expectedX, actualX);

        assertEquals(expectedY, actualY);

    }
}