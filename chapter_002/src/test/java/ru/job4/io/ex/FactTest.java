package ru.job4.io.ex;

import org.junit.Test;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenNIsNegative() {
        new Fact().calc(-1);
    }
}