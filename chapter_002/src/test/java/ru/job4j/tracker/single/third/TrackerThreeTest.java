package ru.job4j.tracker.single.third;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class TrackerThreeTest {
    @Test
    public void getInstance() {
       TrackerThree firstCall = TrackerThree.getInstance();
        assertSame(firstCall, TrackerThree.getInstance());
    }
}
