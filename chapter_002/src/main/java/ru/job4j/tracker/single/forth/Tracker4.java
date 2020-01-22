package ru.job4j.tracker.single.forth;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

public class Tracker4 {
    Tracker tr = new Tracker();

    private Tracker4() {
    }

    public static Tracker4 getInstance() {
        return Holder.INSTANCE;
    }

    public static final class Holder {
        private static final Tracker4 INSTANCE = new Tracker4();
    }

    public Item putItem(Item item) {
        tr.add(item);
        return item;
    }

    public Item[] getByName(String name) {
        return tr.findByName(name);
    }

    public Item getById(String id) {
        return tr.findById(id);
    }

    public Item[] getAll() {
        return tr.findAll();
    }

}
