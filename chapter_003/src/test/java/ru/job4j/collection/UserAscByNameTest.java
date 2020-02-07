package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.*;

public class UserAscByNameTest {

    @Test
    public void compare() {
        int rsl = new UserAscByName().compare(new User("Petr", 33), new User("Ivan", 23));
        assertThat(rsl, greaterThan(0));
    }
}
