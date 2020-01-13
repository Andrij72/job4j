package ru.job4j.tracker;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.UserAction;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
            String name = input.askStr("Enter name: ");
            Item[] items = tracker.findByName(name);
            int count = 0;
            for (Item item : items) {
                count++;
            }
            System.out.println(" Found " + count + " items  <<" + name + ">> .");
        return true;
    }
}
