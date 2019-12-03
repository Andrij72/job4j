package ru.job4j.arrays;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 2, 3, 4},
                {1, 1, 2, 3, 4},
                {2, 2, 4, 6, 8},
                {3, 3, 6, 9, 12},
                {4, 4, 8, 12, 16},
        };

        for (int[] j : matrix) {
            System.out.println(Arrays.toString(j));
        }
        System.out.println("##Sample out matrix##");

        System.out.println(Arrays.deepToString(matrix) + '\n');


        int[][] nums = new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {

                System.out.printf("%d ", nums[i][j]);
            }
            System.out.println();
        }

        System.out.println("##Sample out matrix##");
        System.out.println("##Sample out matrix##");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }

    }
}
