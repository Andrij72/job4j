package ru.job4j.stream;

public class Student {
    int score;
    String name;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{" + name + "[" + score + "]" + "}";
    }
}
