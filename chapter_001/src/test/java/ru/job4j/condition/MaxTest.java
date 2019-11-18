package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class MaxTest {

    @Test
    public void whenMaxLeftToRightThenLeft() {
        int result = Max.max(4, 3);
        Assert.assertThat(result, is(4));
    }

    @Test
    public void whenMaxLeftToRightThenRight() {
        int result = Max.max(2, 3);
        Assert.assertThat(result, is(3));
    }

    @Test
    public void whenLeftEquelRight() {
        int result = Max.max(2, 2);
        Assert.assertThat(result, is(-1));
    }
}
