package ru.job4j.tracker.single.second;

import ru.job4j.tracker.Item;

import java.util.Arrays;
import java.util.Random;

public enum Tracker {
    INSTANCE;
    private final Item[] items = new Item[100];
    private int position = 0;

    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position] = item;
        position++;
        return item;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(Math.abs(System.currentTimeMillis() + rm.nextLong()));
    }

    public Item[] findByName(String key) {
        Item[] arr = new Item[position];
        int i = 0;
        for (int index = 0; index < position; index++) {
            if (items[index].getName().equals(key)) {
                arr[i++] = items[index];
            }
        }
        return Arrays.copyOf(arr, i);
    }

    public Item findById(String id) {
        Item rs = null;
        int indexOf = getIndexOf(id);
        if (indexOf != -1) {
            rs = items[indexOf];
        }
        return rs;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }

    public boolean delete(String id) {
        boolean rslt = false;
        int index = getIndexOf(id);
        if (index != -1) {
            items[index] = null;
            System.arraycopy(items, index + 1, items, index, position - index);
            items[position] = null;
            position--;
            rslt = true;
        }
        return rslt;
    }

    public boolean replace(String id, Item item) {
        boolean rs = false;
        int indexOf = getIndexOf(id);
        if (indexOf != -1) {
            item.setId(id);
            items[indexOf] = item;
            rs = true;
        }
        return rs;
    }

    public int getIndexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(Tracker.INSTANCE.hashCode());
        System.out.println(Tracker.INSTANCE.hashCode());
        System.out.println(Tracker.INSTANCE.hashCode());
    }
}
