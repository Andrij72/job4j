package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int res = 0;
        char[] charArray1 = left.toCharArray();
        char[] charArray2 = right.toCharArray();
        if (charArray1.length == charArray2.length) {
            for (int i = 0; i < charArray1.length; i++) {
                res = Character.compare(charArray1[i], charArray2[i]);
                if (res != 0) {
                    break;
                }
            }
        } else if (charArray1.length < charArray2.length) {
            for (int i = 0; i < charArray1.length; i++) {
                res = Character.compare(charArray1[i], charArray2[i]);
                if (res != 0) {
                    break;
                }
                res = -1;
            }
        } else {
            for (int i = 0; i < charArray2.length; i++) {
                res = Character.compare(charArray1[i], charArray2[i]);
                if (res != 0) {
                    break;
                }
                res = 1;
            }
        }
        return res;
    }
}
