package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;

public class UserDescByAgeTest {
    @Test
    public void compareDescAge() {
        int rsl = new UserDescByAge().compare(
                new User("Ivan", 31),
                new User("Andrew", 22)
        );
        assertThat(rsl, lessThan(0));
    }
}
