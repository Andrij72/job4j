package ru.job4j.oop.profession;

public class Surgeon {
    private String experience;
    private String catagory;
    private String scientificTitle;

    public Surgeon(String experience, String catagory, String scientificTitle) {
        this.experience = experience;
        this.catagory = catagory;
        this.scientificTitle = scientificTitle;
    }

    public void operate(Pacient pacient) {
    }
}
