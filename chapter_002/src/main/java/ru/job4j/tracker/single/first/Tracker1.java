package ru.job4j.tracker.single.first;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

import java.util.Arrays;

public class Tracker1 {
    private static Tracker1 instance;
    private Tracker track = new Tracker();

    private Tracker1() {
    }

    public Item create(Item item) {
        track.add(item);
        return item;
    }

    public Item[] getAll() {
        return track.findAll();
    }

   public void remove(String key){
        track.delete(key);
   }

    public static Tracker1 getInstance() {
        if (instance == null) {
            instance = new Tracker1();
        }
        return instance;
    }


    public static void main(String[] args) {
        System.out.println(Tracker1.getInstance());
        System.out.println(Tracker1.getInstance());
        Tracker1 tr = new Tracker1();
        tr.create(new Item("Andrew"));
        System.out.println(Arrays.toString(tr.getAll()));
    }

}
