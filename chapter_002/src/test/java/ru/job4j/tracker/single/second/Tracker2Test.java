package ru.job4j.tracker.single.second;

import org.junit.Test;

import static org.junit.Assert.*;

public class Tracker2Test {

    @Test
    public void getInstance() {
        Tracker2 callInst = Tracker2.INSTANCE;
        assertSame(callInst, Tracker2.INSTANCE);
    }
}
