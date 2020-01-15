package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindByNameActionTest {

    @Test
    public void whenFindByNameExecute() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"test item"});
        Item item = new Item("test item");
        tracker.add(item);
        PrintStream def = new PrintStream(System.out);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expect = new StringJoiner("**", "", "")
                .add("Found 1 item ")
                .add(item.getName())
                .add(System.lineSeparator())
                .toString();
        new FindByNameAction().execute(input, tracker);
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }
}