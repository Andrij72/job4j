package ru.job4j.oop.profession;

public class Doctor extends Profession {
    private String nameInstitute;
    private String specialisation;
    private int category;

    public Doctor(String nameInstitute, String specialisation, int category) {
        this.nameInstitute = nameInstitute;
        this.specialisation = specialisation;
        this.category = category;
    }

    public Doctor(String name, String surname, String education, String birthday, String nameInstitute, String specialisation, int category) {
        super(name, surname, education, birthday);
        this.nameInstitute = nameInstitute;
        this.specialisation = specialisation;
        this.category = category;
    }

    public void treat(Pacient pacient) {
    }
}
