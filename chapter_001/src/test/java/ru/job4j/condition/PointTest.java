package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class PointTest {

    @Test
    public void distance() {
        Point first = new Point(1, 1);
        Point second = new Point(3, 3);
        int expected = 2;
        int delta = 828;
        double out = first.distance(second);
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    public void distance3d() {
        Point first = new Point(1, 1, 1);
        Point second = new Point(4, 4, 4);
        double result = first.distance3d(second);
        Assert.assertThat(result, is(3.00));
    }
}
