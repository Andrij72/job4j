package ru.job4j.pojo;

public class Book {
    String name;
    int pagenumbers;

    public Book(String name, int pagenumbers) {
        this.name = name;
        this.pagenumbers = pagenumbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPagenumbers() {
        return pagenumbers;
    }

    public void setPagenumbers(int pagenumbers) {
        this.pagenumbers = pagenumbers;
    }
}
