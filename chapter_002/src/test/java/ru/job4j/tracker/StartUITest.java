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

    @Test
    public void replaceItem() {
       Tracker tracker = new Tracker();
       Item item = new Item("My new work");
       tracker.add(item);
       String [] answers = {item.getId(), "Replaced item"};
        Input input = new StubInput(answers);
        StartUI.replaceItem(input, tracker);
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
        String [] answersPft = {perfect.getId()};
        String [] answersOld ={old.getId()};
        Input inputOld = new StubInput(answersOld);
        StartUI.deleteItem(inputOld, tracker);
        String rsl = tracker.findAll()[0].getName();
        assertThat(rsl, is(perfect.getName()));
    }
}
