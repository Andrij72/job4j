package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {
    @Test
    public void whenIs5() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(5);
        assertThat(rsl, is(true));
    }

    @Test
    public void whenIs49() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(19);
        assertThat(rsl, is(true));
    }

    @Test
    public void whenIs4() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(4);
        assertThat(rsl, is(false));
    }
}
