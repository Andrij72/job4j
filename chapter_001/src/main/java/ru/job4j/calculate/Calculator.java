package ru.job4j.calculate;

/**
 * Class   for calculating  arithmetic operations + - *
 *
 * @author Andrey Kulynych
 * @version 1.0
 * @since 12.10.2019
 */
public class Calculator {
    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }

    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + " / " + second + " = " + result);

    }

    /**
     * Method multiply.
     *
     * @param first
     * @param second
     */
    public static void multiply(double first, double second) {
        double result = first / second;
        System.out.println(first + " * " + second + " = " + result);


    }

    public static void subtract(double first, double second) {
        double result = first / second;
        System.out.println(first + " - " + second + " = " + result);


    }

    /**
     * Main.
     *
     * @param args
     */
    public static void main(String[] args) {
        add(1, 1);
        div(6, 2);
        multiply(2, 1);
        subtract(10, 5);
    }
}
