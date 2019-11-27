package ru.job4j.arrays;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {false, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenDataIsMonoByFalseThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {false,false,false,false};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }
}
