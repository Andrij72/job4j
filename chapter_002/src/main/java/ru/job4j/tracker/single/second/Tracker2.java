package ru.job4j.tracker.single.second;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

public enum Tracker2 {
    INSTANCE;
    private Tracker track = new Tracker();

    public Item create(Item message) {
        track.add(message);
        return message;
    }

boolean editItem(String key, Item itm){
       return track.replace(key, itm);
}
    public Item[] findAllItems() {
        return track.findAll();
    }

    public void remove(String key){
        track.delete(key);
    }

    public static void main(String[] args) {
        System.out.println(Tracker2.INSTANCE.hashCode());
        System.out.println(Tracker2.INSTANCE.hashCode());
        System.out.println(Tracker2.INSTANCE.hashCode());
    }
}
