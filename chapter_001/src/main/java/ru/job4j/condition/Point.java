package ru.job4j.condition;

import static java.lang.StrictMath.pow;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result1 = distance(0, 0, 2, 0);
        double result2 = distance(1, 1, 3, 3);
        double result3 = distance(1, 0, 5, 0);

        System.out.println("result (0, 0) to (2, 0) " + result1);
        System.out.println("result (1, 1) to (3, 3) " + result2);
        System.out.println("result (1, 0) to (5, 0) " + result3);
    }
}
