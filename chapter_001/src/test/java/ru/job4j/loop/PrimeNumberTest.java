package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PrimeNumberTest {
    @Test
    public void when5() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(5);
        assertThat(count, is(3));
    }

    @Test
    public void when11() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(11);
        assertThat(count, is(5));
    }

    @Test
    public void when2() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(2);
        assertThat(count, is(1));
    }


    @Test
    public void when37() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(37);
        assertThat(count, is(12));
    }

    @Test
    public void when100() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(100);
        assertThat(count, is(25));
    }
}
