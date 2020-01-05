package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Object obj = new Object();
        Student student = new Student();
        Freshman freshman = new Freshman();
        Student st = freshman;
        Object obj1 = st;
    }
}
