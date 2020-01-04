package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    private final Item[] items = new Item[100];
    private int position = 0;

    /**
     * Метод реализующий добавление заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     *
     * @return Уникальный ключ.
     */
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
        Item rsl = null;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = items[index];
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {      
        return Arrays.copyOf(items, position);
    }
}
