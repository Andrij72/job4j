package ru.job4j.arrays;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int i = 1; i < data.length; i++) {
            result = (data[0] == data[i])?true:false;
        }
        return result;
    }
}
