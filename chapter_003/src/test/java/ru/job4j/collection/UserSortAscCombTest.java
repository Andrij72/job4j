package ru.job4j.collection;

import org.junit.Test;

import java.util.Collections;
import java.util.Comparator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

public class UserSortAscCombTest {
    @Test
    public void compareAscAgeWithName() {
        Comparator<User> cmpNameAge = new UserAscByName().thenComparing(new UserAscByAge());
        int rsl = cmpNameAge.compare(new User("Petr", 35),
                new User("Ivan", 31)
        );
        assertThat(rsl, greaterThan(0));
    }
}
