package ru.job4j.tracker.single.forth;

import org.junit.Test;
import ru.job4j.tracker.single.first.Tracker1;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Tracker4Test {
    private static final Tracker4 HASH_NUMBER = Tracker4.getInstance();

    @Test
    public void getInstance() {
        assertSame(Tracker4.getInstance(), HASH_NUMBER);
    }
}
