package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int num) {
        boolean prime = false;
        for (int m = 2; m <= num; m++) {
            if ((num % m == 0) && (m != num)) {
                break;
            } else if (m == num) {
                prime = true;
            }
        }
        return prime;
    }
}
