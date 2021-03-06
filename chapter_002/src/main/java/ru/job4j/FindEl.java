package ru.job4j;

import ru.job4j.ex.ElementNotFoundException;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index != value.length; index++) {
            if (value[index].equals(key)) {
                rsl = index;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("The element isn't found!");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] value = {"Google", "Amazon", "Alibaba", "Tesla"};
        try {
            System.out.println(indexOf(value, "Ali"));
        } catch (ElementNotFoundException enf) {
            enf.printStackTrace();
        }
    }
}
