package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class MaxTest {
    @Test
    public void whenMax4To3tThen4() {
        int result = Max.max(4, 3);
        Assert.assertThat(result, is(4));
    }

    @Test
    public void whenMax2To3Then3() {
        int result = Max.max(2, 3);
        Assert.assertThat(result, is(3));
    }

    @Test
    public void whenMax2To2Then2() {
        int result = Max.max(2, 2);
        Assert.assertThat(result, is(2));
    }

    @Test
    public void whenMax3To1To2Then3() {
        int result = Max.max(3, 1, 2);
        Assert.assertThat(result, is(3));
    }

    @Test
    public void whenMax4To1To3To2Then4() {
        int result = Max.max(4, 1, 2, 3);
        Assert.assertThat(result, is(4));
    }

    @Test
    public void whenMax3To3To2Then3() {
        int result = Max.max(3, 3, 2);
        Assert.assertThat(result, is(3));
    }

    @Test
    public void whenMax1To1To3To4Then4() {
        int result = Max.max(1, 1, 3, 4);
        Assert.assertThat(result, is(4));
    }

        @Test
        public void whenMax2To2To2Then2() {
            int result = Max.max(2, 2, 2);
            Assert.assertThat(result, is(2));
        }
    }
