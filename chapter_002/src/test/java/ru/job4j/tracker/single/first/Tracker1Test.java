package ru.job4j.tracker.single.first;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class Tracker1Test {
    private static final Tracker1 TRACKER_1_NUMER = Tracker1.getInstance();

    @Test
    public void whenTwoCallTrackerAndHaveTheSameObject() {
        assertSame(Tracker1.getInstance(), TRACKER_1_NUMER);
    }
}

