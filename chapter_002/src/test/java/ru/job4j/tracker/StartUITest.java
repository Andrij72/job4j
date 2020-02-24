package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.Consumer;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream stdout = System.out;

    @Before
    public void loadOutput() {
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
    }

    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {

    }


    @Test
    public void initTest() {
                StubInput input = new StubInput(
                new String[] {"0"}
        );
        StubAction action = new StubAction();
        new StartUI(input, new Tracker(), System.out::println).init(input, new Tracker(), Arrays.asList(new UserAction[]{action}));
        assertThat(action.isCall(), is(true));
    }

    @Test
    public void whenShowMenu() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        StubInput input = new StubInput(
                new String[]{"0"}
        );
        List<UserAction> actions = Arrays.asList(new CreateAction(), new DeleteAction());
        UserAction action = new StubAction();
        new StartUI(input, new Tracker(), System.out::println).init(input, new Tracker(),Arrays.asList(new UserAction[]{action}));
            String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                    .add("Menu.")
                    .add("0. Stub action")
                    .toString();
            assertThat(new String(out.toByteArray()), is(expect));
            System.setOut(def);
    }
}
