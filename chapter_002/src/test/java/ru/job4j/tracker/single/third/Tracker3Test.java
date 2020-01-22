package ru.job4j.tracker.single.third;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class Tracker3Test {
    @Test
    public void getInstance() {
       Tracker3 firstCall = Tracker3.getInstance();
        assertSame(firstCall, Tracker3.getInstance());
    }
}
