package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        for (int x = 2; x <= finish; x++) {
            if (new CheckPrimeNumber().check(x)) {
                count++;
            }
        }
        return count;
    }
}

