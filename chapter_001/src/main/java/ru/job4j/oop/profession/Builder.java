package ru.job4j.oop.profession;

public class Builder extends Engineer {
    private String specialisation;
    private int experienceTime;
    private int category;

    public Builder(String cualification, String issuInstitution, Long data, String specialisation, int experienceTime, int category) {
        super(cualification, issuInstitution, data);
        this.specialisation = specialisation;
        this.experienceTime = experienceTime;
        this.category = category;
    }

    public void draw(Building school) {
    }

    void calculate() {
    }
}
