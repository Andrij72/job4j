package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int num) {
        boolean prime = false;
        for (int m = 1; m <= num; m++) {
            if ( m != num && (num % m == 0)) {
                if(m!=1) {
                    break;
                }
            } else prime = true;
        }
        return prime;
    }
}
