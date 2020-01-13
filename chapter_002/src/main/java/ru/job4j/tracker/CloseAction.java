package ru.job4j.tracker;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.UserAction;

public class CloseAction implements UserAction {
    @Override
    public String name() {
        return "=== Close program ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Program is closed !");
        return false;
    }
}
