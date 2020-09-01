package ru.job4j;

public class Fact {
    public static void main(String[] args) {
    }

    public int calc(int n) {
        if (n < 1) {
            throw new IllegalArgumentException(" Illegal number, please take N > 1 !");
        }
        int rsl = 1;
        for (int index = 1; index != n; index++) {
            rsl += index;
        }
        return rsl;
    }
}
