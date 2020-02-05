package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortInDescendItemTest {

    @Test
    public void compareInDescend() {
        List<Item> items = Arrays.asList(
                new Item("1st task"),
                new Item("3 Pull request task"),
                new Item("2nd task")
        );
        items.sort(new SortInDescendItem());
        assertThat(items.get(0).getName(), is("3 Pull request task"));
        assertThat(items.get(2).getName(), is("1st task"));
    }
}
