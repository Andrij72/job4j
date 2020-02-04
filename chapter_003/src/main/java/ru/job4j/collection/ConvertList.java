package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> lst = new ArrayList<>();
        for (int[] elt : list) {
            for (int cell : elt) {
                lst.add(cell);
            }
        }
        return lst;
    }
}
