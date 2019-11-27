package ru.job4j.arrays;

import java.util.Arrays;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = false;
        for (int i = 0; i < pref.length; i++) {
            result = (pref[i] == word[i]) ? true : false;
        }
        return result;
    }
}
