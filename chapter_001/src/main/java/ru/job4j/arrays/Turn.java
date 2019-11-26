package ru.job4j.arrays;

public class Turn {
    public int[] back(int[] array) {
        int endIndex = array.length - 1;

        for (int index = 0; index < endIndex; index++) {
            int tmp = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = tmp;
            endIndex--;
        }
        return array;
    }
}
