package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void initTest() {
        StubInput input = new StubInput(
                new String[]{"0"}
        );
        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), new UserAction[]{action});
        assertThat(action.isCall(), is(true));
    }

    @Test
    public void createItem() {
        String[] answers = {"I'm stajor as yet"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction()
        };
        new StartUI().init(input, tracker, actions);
        Item[] result = tracker.findAll();
        Item expected = new Item("I'm stajor as yet");
        assertThat(result[0].getName(), is(expected.getName()));
    }

    @Test
    public void replaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("My new work");
        tracker.add(item);
        String[] answers = {item.getId(), "Replaced item"};
        Input input = new StubInput(answers);
        UserAction[] actions = {
                new ReplaceAction()
        };
        new StartUI().init(input, tracker, actions);
        String result = tracker.findAll()[0].getName();
        assertThat(result, is(answers[1]));
    }

    @Test
    public void deleteItem() {
        Tracker tracker = new Tracker();
        Item perfect = new Item("My perfect new work");
        Item old = new Item("My old work");
        tracker.add(old);
        tracker.add(perfect);
        String[] answersOld = {old.getId()};
        Input inputOld = new StubInput(answersOld);
        UserAction[] actions = {
                new CreateAction()
        };
        new StartUI().init(inputOld, tracker, actions);

        String rsl = tracker.findAll()[0].getName();
        assertThat(rsl, is(perfect.getName()));
    }
}
