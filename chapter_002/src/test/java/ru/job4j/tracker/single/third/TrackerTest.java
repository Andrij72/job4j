package ru.job4j.tracker.single.third;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrackerTest {

    @Test
    public void getInstance() {
        int firstCall = Tracker.getInstance().hashCode();
        assertEquals(firstCall, Tracker.getInstance().hashCode());
    }
}