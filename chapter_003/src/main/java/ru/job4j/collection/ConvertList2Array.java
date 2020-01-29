package ru.job4j.collection;

import java.util.List;

    public class ConvertList2Array {
        public static int[][] twoArray(List<Integer> list, int rows) {
            int cells = rows;
            while (cells * rows < list.size()) {
                cells++;
            }
            int[][] array = new int[rows][cells];
            int index = 0;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cells; j++) {
                    if (index >= list.size()) {
                        array[i][j] = 0;
                    } else {
                        array[i][j] = list.get(index++);
                    }
                }
            }
            return array;
        }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        int[][] rsl = twoArray(list, 3);
        for (int[] row : rsl) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
