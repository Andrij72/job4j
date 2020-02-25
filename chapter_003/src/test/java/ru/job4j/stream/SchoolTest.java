package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class SchoolTest {

    public Student student1 = new Student("Andrew Kulynych", 80);
    public Student student2 = new Student("Bill Geytz", 60);
    public Student student3 = new Student("Geff Bezoss", 40);
    public List<Student> list = Arrays.asList(student1, student2, student3);

    @Test
    public void whenCollectClass10A() {
        List<Student> resList = School.collect(list, student -> student.getScore() < 100 && student.score > 70);
        assertTrue(resList.contains(student1));
    }

    @Test
    public void whenCollectClass10B() {
        List<Student> resList = School.collect(list, student -> student.score < 70 && student.score > 50);
        assertTrue(resList.contains(student2));
    }

    @Test
    public void whenCollectClass10V() {
        List<Student> resList = School.collect(list, student -> student.score < 50 && student.score > 0);
        assertTrue(resList.contains(student3));
    }
}
