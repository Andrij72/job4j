package ru.job4.io.ex;

public class FactRec {
    public static int calc(int n) {
        int res = 1;
        if (n != 1 && n > 0) {
            res = calc(n - 1) * n;
        }
        return res;
    }

    public static void main(String[] args) {
        int rsl = calc(3);
        System.out.println(rsl);
    }
}
