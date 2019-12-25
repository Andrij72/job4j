package ru.job4j.tracker;

public class Animal {
   private String name;
    public Animal(String name) {
        super();
        this.name = name;
        System.out.println(this.getClass());
    }
}
