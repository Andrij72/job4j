package ru.job4j.collection;

import java.util.Comparator;

public class Value  implements Comparable<Value> {
    private String zv1;
    private String zv2;
    private String zv3;

    public Value(String zv1, String zv2, String zv3) {
        this.zv1 = zv1;
        this.zv2 = zv2;
        this.zv3 = zv3;
    }

    public String getZv1() {
        return zv1;
    }

    public void setZv1(String zv1) {
        this.zv1 = zv1;
    }

    public String getZv2() {
        return zv2;
    }

    public void setZv2(String zv2) {
        this.zv2 = zv2;
    }

    public String getZv3() {
        return zv3;
    }

    public void setZv3(String zv3) {
        this.zv3 = zv3;
    }

    @Override
    public int compareTo(Value v) {
        return zv1.compareTo(v.getZv1());
    }
}
