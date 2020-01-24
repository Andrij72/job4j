package ru.job4j.tracker.single.first;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class TrackerOneTest {
    private static final TrackerOne TRACKER = TrackerOne.getInstance();

    @Test
    public void whenTwoCallTrackerAndHaveTheSameObject() {
        assertSame(TrackerOne.getInstance(), TRACKER);
    }
}

