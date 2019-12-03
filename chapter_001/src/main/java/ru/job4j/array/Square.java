package ru.job4j.array;

import static java.lang.Math.pow;

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int index = 0; index < bound; index++) {
            rst[index] = (int) pow(index + 1, 2);
        }
        return rst;
    }
}
