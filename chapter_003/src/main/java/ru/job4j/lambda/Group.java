package ru.job4j.lambda;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Group {

        public static Map<String, Set<String>> sections (List<Student> students) {
            return students.stream().flatMap(u -> u.getUnits().stream().map(key -> new Holder(key, u.getName())))               // собираем объект Holder с unit и name
                    .collect( // collect map
                            Collectors.groupingBy(t -> t.getKey(), // define a grouping
                                    Collector.of(
                                            HashSet::new, // accumulator
                                            (set, el) -> set.add(el.getValue()),// как добавлять данные.
                                            (left, right) -> {
                                                left.addAll(right);
                                                return left;
                                            } // aggregating
                                    )
                            )
                    );
        }
}
