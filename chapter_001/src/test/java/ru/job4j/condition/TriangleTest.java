package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        Point first = new Point(0, 0);
        Point second = new Point(1, 0);
        Point third = new Point(0, 1);
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        boolean result = Triangle.exist(a, b, c);
        assertThat(result, is(true));
    }

    @Test
    public void whenInexist() {
        Point first = new Point(0, 0);
        Point second = new Point(1, 0);
        Point third = new Point(0, 0);
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        boolean result = Triangle.exist(a, b, c);
        assertThat(result, is(false));
    }

    @Test
    public void whenTwoTwoForHaveFor() {
        Point first = new Point(0, 0);
        Point second = new Point(2, 0);
        Point third = new Point(3, 3);
        Triangle triangle = new Triangle(first, second, third);
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double result = triangle.period(a, b, c);
        assertThat(result, is(4.702459173643832));
    }

    @Test
    public void area() {
        Point first1 = new Point(0, 0);
        Point second2 = new Point(1, 0);
        Point third3 = new Point(0, 1);
        Triangle triangle = new Triangle(first1, second2, third3);
        double result = triangle.area();
        assertThat(result, is(0.49999999999999983));
    }
}
