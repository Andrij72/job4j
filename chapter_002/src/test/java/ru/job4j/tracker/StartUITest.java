package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void initTest() {
        StubInput input = new StubInput(
                new String[]{"0"}
        );
        UserAction action = new CreateAction();
        new StartUI().init(input, new Tracker(), Arrays.asList(new CreateAction()));
        assertThat(action.isCall(), is(true));
    }

   /* @Test
    public void whenShowMenu() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        StubInput input = new StubInput(
                new String[]{"0"}
        );
        List<UserAction> actions = Arrays.asList(new CreateAction());
        new StartUI().init(input, new Tracker(), actions);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Menu.")
                .add("0. Test action")
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }*/
}
