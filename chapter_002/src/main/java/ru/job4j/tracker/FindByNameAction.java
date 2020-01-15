package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] itm = tracker.findByName(name);
        System.out.printf("Found %d item **%s**%n", itm.length, name);
        return true;
    }
}
