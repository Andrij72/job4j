package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class TestStream {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a1", "b2", "c3", "a1");
        Map list = strings.stream().collect(Collectors.groupingBy((p) -> p.substring(0, 0)));
        list.forEach((k, v) -> System.out.println(k + " Value: " + v));
        System.out.println("2-------------");

        List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
                new Product(14, "orange"), new Product(13, "lemon"),
                new Product(23, "bread"), new Product(13, "sugar"));

        String listToString = productList.stream().map(Product::getName)
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println(listToString);

        double averagePrice = productList.stream()
                .collect(Collectors.averagingInt(Product::getPrice));
        System.out.println(averagePrice);
// intStream
        System.out.println("3-------------");

        IntStream intStream = IntStream.range(1, 3);
        LongStream longStream = LongStream.rangeClosed(1, 3);
        System.out.println("4-------------");
// Person list
        List<Person> persons =
                Arrays.asList(
                        new Person("Max", 18),
                        new Person("Peter", 23),
                        new Person("Pamela", 23),
                        new Person("David", 12),
                        new Person("Gorge", 12));
        List<Person> filtered =
                persons
                        .stream()
                        .filter(p -> p.name.startsWith("P"))
                        .collect(Collectors.toList());

        System.out.println(filtered);
        System.out.println("5-------------");
        // Peoples group by age
        Map<Integer, List<Person>> personsByAge = persons
                .stream()
                .collect(Collectors.groupingBy(p -> p.age));

        personsByAge.
                forEach((age, p) -> System.out.format("age %s: %s\n", age, p));
        System.out.println("6-------------");
// transform flow elements to display
        Map<Integer, String> map = persons
                .stream()
                .collect(Collectors.toMap(
                        p -> p.age,
                        p -> p.name,
                        (name1, name2) -> "[" + name1 + ";" + name2 + "]"));
        System.out.println(map);
        System.out.println("7-------------");
        //++++++++++++++

        Collector<Person, StringJoiner, String> personNameCollector =
                Collector.of(
                        () -> new StringJoiner(" | "),          // supplier
                        (j, p) -> j.add(p.name.toUpperCase()),  // accumulator
                        (j1, j2) -> j1.merge(j2),               // combiner
                        StringJoiner::toString);                // finisher

        String names = persons
                .stream()
                .collect(personNameCollector);
        System.out.println(names);
    }
}
