package ru.job4j.stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MatrixTransform {
    public static void main(String[] args) {
        Integer[][] matrix = {{1, 2, 3}, {11, 22, 33}, {111, 222, 333}};
        System.out.print(Arrays.stream(matrix).flatMap(e -> Arrays.stream(e)).collect(Collectors.toList()));
    }
}
