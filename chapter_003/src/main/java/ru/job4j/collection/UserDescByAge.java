package ru.job4j.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UserDescByAge implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return Integer.compare(o2.getAge(), o1.getAge());
    }

    public static void main(String[] args) {
        List<User> lst = List.of(new User("a", 3),
                new User("aa", 1),
                new User("aaa", 11)
        );
        Collections.sort(lst, new UserDescByAge());
        System.out.println(lst);
    }
}
