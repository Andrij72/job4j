package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsRotateDemo {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c", "d", "e");
        System.out.println(list);

        Collections.rotate(list, 2);
        System.out.println(list);

        Collections.rotate(list, -1);
        System.out.println(list);


        List<String> listFill = List.of("красный", "синий", "зеленый");
        Collections.fill(listFill, "черный");
        System.out.println(listFill);
        //Try shuffle collection
        List<String> listShfl = List.of("красный", "синий", "зеленый", "черный");
        System.out.println("Перед reversing: " + listShfl);
        Collections.reverse(listShfl);
        System.out.println("После reversing: " + listShfl);
        Collections.shuffle(listShfl);
        System.out.println("После shuffling: " + listShfl);
    }
}
