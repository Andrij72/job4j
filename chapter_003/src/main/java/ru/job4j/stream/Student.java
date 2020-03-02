package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student implements Comparable<Student> {
    int score;
    String name;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (score != student.score) return false;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        int result = score;
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "{" + name + "[" + score + "]" + "}";
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.getScore(), o.getScore());
    }

    public List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .flatMap(Stream::ofNullable).sorted().takeWhile(st -> st.score > bound).collect(Collectors.toList());
    }
}
