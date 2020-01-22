package ru.job4j.tracker.single.third;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

public class Tracker3 {
    public static Tracker3 INSTANCE = new Tracker3();
    Tracker tracker = new Tracker();

    public static Tracker3 getInstance() {
        return INSTANCE;
    }

    public Item put(Item message) {
        tracker.add(message);
        return message;
    }

    boolean edit(String key, Item itm) {
        return tracker.replace(key, itm);
    }

    public Item[] findAllItems() {
        return tracker.findAll();
    }

    public void removeById(String key) {
        tracker.delete(key);
    }

    public Item[] getByName(String key) {
        return tracker.findByName(key);
    }

    public Item getById(String key) {
        return tracker.findById(key);
    }

}
