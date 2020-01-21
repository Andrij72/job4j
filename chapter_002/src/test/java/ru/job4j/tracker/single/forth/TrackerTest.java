package ru.job4j.tracker.single.forth;

import org.junit.Test;
import ru.job4j.tracker.single.first.Tracker;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TrackerTest {
    private static final int HASH_NUMBER = Tracker.getInstance().hashCode();

    @Test
    public void getInstance() {
        assertThat(Tracker.getInstance().hashCode(), is(HASH_NUMBER));
    }
}