package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

public class TrackerTest {

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("item1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
        System.out.println("ID of<<item1>> is: " + result.getId());
    }

    @Test
    public void whenfindMy_item() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("My_item");
        Item item2 = new Item("Your_item");
        Item item3 = new Item("Your_item");
        Item item4 = new Item("My_item");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        Item[] result = tracker.findByName("My_item");
        Item[] etalon = {item1, item4};
        System.out.println("Before: " + Arrays.toString(etalon));
        System.out.println("Result: " + Arrays.toString(result));
        assertThat(Arrays.equals(result, etalon), is(true));
    }

    @Test
    public void findById() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("My_item");
        Item item2 = new Item("Your_item");
        Item item3 = new Item("I'm here");
        Item item4 = new Item("My_item");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        item3.setId("3462405963986223938");
        Item result = tracker.findById("3462405963986223938");
        assertThat(result, is(item3));
        System.out.println("Find  item is: " + result.getName());
    }

    @Test
    public void findAll() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("My_item");
        Item item2 = new Item("My_item");
        Item item3 = new Item("Your_item");
        Item item4 = new Item("Your_item");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        Item[] result = tracker.findAll();
        Item[] etalon = {item1, item2, item3, item4};
        System.out.println("Before: " + Arrays.toString(etalon));
        System.out.println("Result: " + Arrays.toString(result));
        assertThat(Arrays.equals(result, etalon), is(true));
    }

    @Test
    public void delete() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("My_item");
        Item item2 = new Item("That_item");
        Item item3 = new Item("Your_item");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        Item[] before = tracker.findAll();
        String id = item2.getId();
        System.out.println("Before: " + Arrays.toString(before));
        tracker.delete(id);
        Item[] after = tracker.findAll();
       assertThat(Arrays.equals(before, after), is(true));
      System.out.println("Result: " + Arrays.toString(after));
    }

        @Test
        public void whenDelete () {
            Tracker tracker = new Tracker();
            Item bug = new Item("Bug");
            tracker.add(bug);
            String id = bug.getId();
            tracker.delete(id);
            assertThat(tracker.findById(id), is(nullValue()));
        }

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

}
