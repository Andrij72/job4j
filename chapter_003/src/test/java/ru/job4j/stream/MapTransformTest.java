package ru.job4j.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class MapTransformTest {
    private List<Student> studentList;
    private MapTransform mapTransform = new MapTransform();

    @Before
    public void init() {
        studentList = new ArrayList<>();
        studentList.add(new Student("Andrew Kulynych", 50));
        studentList.add(new Student("Andrew Kulynych", 40));
        studentList.add(new Student("Ivan Logkin", 30));
        studentList.add(new Student("Larry Smitt", 20));
    }

    @Test(expected = IllegalStateException.class)
    public void whenMapHasDuplicateKey_without_merge_function_then_runtime_exception() {
        MapTransform.listToMapWithDupKeyError(studentList);
    }

    @Test
    public void whenDuplicateKeyInMapHasResolvedMergeFunction() {
        Map<String, Student> studentMap = MapTransform.transformListToMap(studentList);
        assertEquals(3, studentMap.size());
        studentMap.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));
        assertEquals(50, studentMap.getOrDefault("Andrew Kulynych", new Student("",0)).getScore());
    }
}
