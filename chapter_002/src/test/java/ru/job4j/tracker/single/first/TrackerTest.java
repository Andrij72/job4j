package ru.job4j.tracker.single.first;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TrackerTest {
    private static final int TRACKER_NUMER = Tracker.getInstance().hashCode();

    @Test
    public void whenTwoCallTrackerAndHaveTheSameHashcode() {
        assertThat(Tracker.getInstance().hashCode(), is(TRACKER_NUMER));
    }
}
