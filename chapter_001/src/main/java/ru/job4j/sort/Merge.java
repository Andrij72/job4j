package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int firstIndex = 0;
        int secondIndex = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (firstIndex >= left.length) {
                rsl[i] = right[secondIndex];
                secondIndex += 1;
            } else if (secondIndex >= right.length) {
                rsl[i] = left[firstIndex];
                firstIndex += 1;
            } else if (left[firstIndex] < right[secondIndex]) {
                rsl[i] = left[firstIndex];
                firstIndex += 1;
            } else {
                rsl[i] = right[secondIndex];
                secondIndex += 1;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[]{1, 3, 5},
                new int[]{2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
