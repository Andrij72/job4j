package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindAllActionTest {

    @Test
    public void whenFindAllExecute() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        Tracker tracker = new Tracker();
        Item item = new Item("test item");
        tracker.add(item);
        FindAllAction action = new FindAllAction();
        action.execute(new StubInput(new String[]{"1"}), tracker);
        String expect = new StringBuilder()
                .append("Your keep item:  {")
                .append(item.getName() + "|" + item.getId())
                .append("}" + System.lineSeparator())
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }
}