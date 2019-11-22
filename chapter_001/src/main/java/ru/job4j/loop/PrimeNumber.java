package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        for (int x = 2; x <= finish; x++) {
            for (int m = 2; m <= finish; m++) {
                if (x % m == 0) {
                    if (x == m) {
                        count++;
                    }
                    break;
                }
            }
        }
        return count;
    }
}
