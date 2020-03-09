package ru.job4j.lambda;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collector;

import static org.junit.Assert.*;

public class GroupTest {
    Student stud1 = new Student("John", Arrays.asList("Math", "Chemistry", "English"));
    Student stud2 = new Student("Peter", Arrays.asList("Math", "History"));
    Student stud3 = new Student("Antony", Arrays.asList("Music", "History", "English", "Math"));
    final List<Student> st = List.of(stud1, stud2, stud3);

    @Test
    public void whenPutListStudentsThenCollectStudentBySection() {
        Map<String, Set<String>> resultMap = Group.sections(st);
        String names = resultMap.values().stream().collect(Collector.of(
                () -> new StringJoiner(" | "),
                (j, p) -> j.add(p.toString()),
                (j1, j2) -> j1.merge(j2),
                StringJoiner::toString));
        assertEquals("[John, Antony] | [John] | [Antony] | [Peter, Antony] | [John, Peter, Antony]", names);
    }
}
