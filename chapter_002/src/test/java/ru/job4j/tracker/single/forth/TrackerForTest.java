package ru.job4j.tracker.single.forth;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TrackerForTest {
    private static final TrackerFor INSTANCE = TrackerFor.getInstance();

    @Test
    public void getInstance() {
        assertSame(TrackerFor.getInstance(), INSTANCE);
    }
}
