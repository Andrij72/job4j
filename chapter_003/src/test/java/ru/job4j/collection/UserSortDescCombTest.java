package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

public class UserSortDescCombTest {
    @Test
    public void compareDescAgeWithName() {
        Comparator<User> cmpNameAge = new UserDescByName();
        int rsl = cmpNameAge.compare(new User("Ivan", 32),
                new User("Petr", 33)
        );
        assertThat(rsl, greaterThan(0));
    }
}
