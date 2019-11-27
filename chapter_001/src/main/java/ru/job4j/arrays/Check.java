package ru.job4j.arrays;

public class Check {

    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int i = 1; i < data.length; i++) {
            if (data[0] == data[i]) {
                result = true;
                continue;
            } else {
                result=false;
                break;
            }
        }
        return result;
    }
}
