package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.*;

public class UserAscByAgeTest {
    @Test
    public void compareAscAge() {
        int rsl = new UserAscByAge().compare(
                new User("Ivan", 32),
                new User("Andrew", 31)
        );
        assertThat(rsl, greaterThan(0));
    }
}
