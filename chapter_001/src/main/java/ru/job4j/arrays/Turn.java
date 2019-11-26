package ru.job4j.arrays;

public class Turn {
    public int[] back(int[] array) {
        int endIndex = array.length;
        for (int index = 0; index < endIndex/2; index++) {
            int tmp = array[index];
            array[index] = array[endIndex - index - 1];
            array[endIndex  - index - 1] = tmp;
        }
        return array;
    }
}
