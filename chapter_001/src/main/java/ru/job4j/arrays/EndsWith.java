package ru.job4j.arrays;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int j = word.length - 1;
        for (int i = post.length - 1; i >= 0; i--) {
            if (post[i] != word[j]) {
                result = false;
                break;
            }
            j--;
        }
        return result;
    }
}
