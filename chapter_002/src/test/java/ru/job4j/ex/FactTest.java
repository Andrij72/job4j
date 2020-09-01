package ru.job4j.ex;

import org.junit.Test;
import ru.job4j.Fact;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenNIsNegative() {
        new Fact().calc(-1);
    }
}