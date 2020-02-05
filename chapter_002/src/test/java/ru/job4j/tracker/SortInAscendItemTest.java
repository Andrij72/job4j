package ru.job4j.tracker;

import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortInAscendItemTest {

    @Test
    public void compareInAscendingOrder() {
        List<Item> items = Arrays.asList(
                new Item("3 Pull request task"),
                new Item("1st task"),
                new Item("2nd task")
        );
        Collections.sort(items, new SortInAscendItem());
        assertThat(items.get(0).getName(), is("1st task"));
        assertThat(items.get(2).getName(), is("3 Pull request task"));
    }
}
