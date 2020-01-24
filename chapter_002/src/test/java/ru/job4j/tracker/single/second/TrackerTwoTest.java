package ru.job4j.tracker.single.second;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrackerTwoTest {

    @Test
    public void getInstance() {
        TrackerTwo callInst = TrackerTwo.INSTANCE;
        assertSame(callInst, TrackerTwo.INSTANCE);
    }
}
