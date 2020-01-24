package ru.job4j.tracker.single.forth;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TrackerForTest {
    private static final TrackerFor HASH_NUMBER = TrackerFor.getInstance();

    @Test
    public void getInstance() {
        assertSame(TrackerFor.getInstance(), HASH_NUMBER);
    }
}
