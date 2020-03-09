package ru.job4j.lambda;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student {
    private String name;
    private List<String> units;

    public Student(String name, List<String> units) {
        this.name = name;
        this.units = units;
    }

    public String getName() {
        return name;
    }

    public List<String> getUnits() {
        return units;
    }

    @Override
    public String toString() {
        return "{"
                + name + units +
                '}';
    }

}

