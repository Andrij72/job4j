package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        CheckPrimeNumber checkNumber = new CheckPrimeNumber();
        for (int x = 2; x <= finish; x++) {
            if (checkNumber.check(x)) {
                count++;
            }
        }
        return count;
    }
}
