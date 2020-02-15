package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class FindAllAction implements UserAction {
    @Override
    public String name() {
        return "=== Show all items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
      List<Item> items =  tracker.findAll();
        if (items.size() != 0) {
            for (Item item : items) {
                System.out.printf("Your keep item:  {%s|%s}%n", item.getName(), item.getId());
            }
        }
        return true;
    }

    @Override
    public Object isCall() {
        return null;
    }
}
