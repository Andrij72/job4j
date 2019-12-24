package ru.job4j.tracker;

public class Tiger extends Predator {
    public Tiger() {
        super();
        System.out.println(" daughter class of Predator");
        System.out.println(this.getClass());
    }
}
