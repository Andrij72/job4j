package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int num) {
        boolean prime = false;
        for (int m = 2; m <= num; m++) {
            if ((num % m == 0) && (m != num)) {
                System.out.printf("<%d> isn't prime number because divide on <%d>%n", num, m);
                break;
            } else if (m == num) {
                prime = true;
                System.out.printf("<%d> is prime number%n", num);
            }
        }
        return prime;
    }
}
