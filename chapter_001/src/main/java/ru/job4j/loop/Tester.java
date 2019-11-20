package ru.job4j.loop;

public class Tester {
    public int add(int start, int finish) {
        int sum = 0;
        for (int k = start; k <= finish; k++) {
            if (k % 2 == 0) {
                sum = sum + k;
            }
        }
        return sum;
    }
}
