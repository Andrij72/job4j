package ru.job4j.condition;

import static java.lang.StrictMath.pow;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

        public double distance(Point that) {
        return Math.sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point first = new Point(0, 0);
        Point second = new Point(2, 0);
        Point third = new Point(3, 3);
        double result1 = first.distance(second);
        double result2 = first.distance(third);
        double result3 = second.distance(third);
        System.out.printf("result (0, 0) to (2, 0) :  %.2f%n", result1);
        System.out.printf("result (0, 0) to (3, 3) :  %.2f%n", result2);
        System.out.printf("result (2, 0) to (3, 3) :  %.2f%n", result3);
    }
}
