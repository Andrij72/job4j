package ru.job4j.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapTransform<Students> {

    private static List<Student> students = Arrays.asList(new Student("Garry Ford", 30),
                new Student("John Lee", 20),  new Student("John Lee", 20),  new Student("Stiv Makkain", 20));

    public static void main(String[] args) {
        Set<String> set = new HashSet<>(students.size());
        System.out.println(students.stream().filter(p -> set.add(p.getName())).collect(Collectors.toMap(student->student.getName(), student -> student)));
    }
}
