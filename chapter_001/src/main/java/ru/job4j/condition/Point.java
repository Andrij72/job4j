package ru.job4j.condition;

import static java.lang.StrictMath.pow;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(Point first, Point second) {
        return Math.sqrt(pow(second.x - first.x, 2) + pow(second.y - first.y, 2));
    }

    public static void main(String[] args) {
        double result1 = distance(new Point(0, 0), new Point(0, 2));
        double result2 = distance(new Point(1, 1), new Point(3, 3));
        double result3 = distance(new Point(1, 0), new Point(5, 0));
        System.out.println("result (0, 0) to (2, 0) " + result1);
        System.out.println("result (1, 1) to (3, 3) " + result2);
        System.out.println("result (1, 0) to (5, 0) " + result3);
    }
}
