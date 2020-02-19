package ru.job4j.tracker;

import org.junit.Ignore;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class StartUITest {
    @Ignore
    @Test
    public void initTest() {
        StubInput input = new StubInput(
                new String[]{"0"}
        );
        UserAction action = new CreateAction();
        List<UserAction> actions = Arrays.asList(action);
            new StartUI().init(input, new Tracker(), actions);
            assertThat(action.name(), is("=== Create a new Item ===="));
    }

    @Ignore
   @Test
    public void whenShowMenu() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        StubInput input = new StubInput(
                new String[]{"0"}
        );
        List<UserAction> actions = Arrays.asList(new CreateAction(), new DeleteAction());
        new StartUI().init(input, new Tracker(), actions);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Menu.")
                .add("0. Test action")
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }
}
