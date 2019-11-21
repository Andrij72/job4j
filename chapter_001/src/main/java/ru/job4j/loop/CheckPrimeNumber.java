package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int num) {
        boolean prime = false;
        for (int m = 2; m <= num; m++) {
            if (m != num && (num % m == 0)) {
                break;
            }
            else prime = true;
        }
        return prime;
    }
}
