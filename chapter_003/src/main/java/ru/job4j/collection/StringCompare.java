package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        char[] charArray1 = left.toCharArray();
        char[] charArray2 = right.toCharArray();
        int len1 = charArray1.length;
        int len2 = charArray2.length;
        int lim = Math.min(len1, len2);
        for (int k = 0; k < lim; k++) {
            char c1 = charArray1[k];
            char c2 = charArray2[k];
            if (c1 != c2) {
                Character.compare(c1, c2);
                return c1 - c2;
            }
        }
        return len1 - len2;
    }
}
