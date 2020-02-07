package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UserAscByName implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getName().compareTo(o2.getName());
    }

    public static void main(String[] args) {
        List<User> lst = Arrays.asList(new User("Ivan", 21),
                new User("Petr", 33),
                new User("Nik", 43)
        );
        Collections.sort(lst, new UserAscByName());
        System.out.println(lst);
    }
}
