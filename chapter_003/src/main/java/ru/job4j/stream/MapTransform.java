package ru.job4j.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapTransform<Students> {

    private static List<Student> students = Arrays.asList(new Student("Garry Ford", 30),
            new Student("John Lee", 20), new Student("John Lee", 20),
            new Student("Stiv Makkain", 40));

    public static Map<String, Student> ConvertListToMap(List<Student> students) {
        return students.stream().
                collect(Collectors.toMap(Student::getName, Function.identity(),(existing, replacement) -> existing));
    }

    public static Map<String, Student> listToMapWithDupKeyError(List<Student> students) {
        return students.stream().collect(Collectors.toMap(Student::getName, Function.identity()));
    }

    public static void main(String[] args) {
        Set<String> set = new HashSet<>(students.size());
        System.out.println(students.stream().filter(p -> set.add(p.getName())).collect(Collectors.toMap(student -> student.getName(), student -> student)));

    }
}
