package ru.job4j.arrays;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            String cell = array[index];
            int end = array.length - 1;
            if (cell == null) {
                while (index != end) {
                    String temp = array[index];
                    if (array[end] != null) {
                        array[index] = array[end];
                        array[end] = temp;
                    }
                    end--;
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
