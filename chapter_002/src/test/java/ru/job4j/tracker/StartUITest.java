package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void createItem() {
       String[] answers = {"I'm stajor as yet"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item result = tracker.findAll()[0];
         Item expected = new Item("I'm stajor as yet");
       assertThat(result.getName(), is(expected.getName()) );
    }
}
