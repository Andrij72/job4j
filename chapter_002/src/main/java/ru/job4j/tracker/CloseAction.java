package ru.job4j.tracker;

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
