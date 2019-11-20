package ru.job4j.loop;

public class Factorial {
    public int calc(int n) {
        int result = 1;

        for (int k = 1; k <= n; k++) {
            result = result * k;
        }
        return result;
    }
}
