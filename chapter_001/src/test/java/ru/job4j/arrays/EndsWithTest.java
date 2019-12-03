package ru.job4j.arrays;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class EndsWithTest {
    @Test
    public void whenEndWithPostThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'R', 'r'};
        char[] post = {'R', 'r'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotEndWithPostThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'Z', '0'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }
}
