package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class UserDescByNameTest {

    @Test
    public void compareDscName() {
        int rsl = new UserDescByName().compare(new User("Ivan", 33), new User("Petr", 23));
        assertThat(rsl, greaterThan(0));
    }
}