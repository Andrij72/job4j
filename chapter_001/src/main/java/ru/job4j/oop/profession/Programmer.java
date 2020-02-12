package ru.job4j.oop.profession;

public class Programmer extends Engineer {
    private String progLanguage;
    private int expirience;

    public Programmer(String cualification, String issuInstitution, Long data, String progLanguage, int expirience, String skill) {
        super(cualification, issuInstitution, data);
        this.progLanguage = progLanguage;
        this.expirience = expirience;
        this.skill = skill;
    }

    private String skill;

    public Programmer(String cqalification, String issuInstitution, Long data) {
        super(cqalification, issuInstitution, data);
    }

    public Programmer(String name, String surname, String education, String birthday, String cualification, String issuInstitution, Long data) {
        super(name, surname, education, birthday, cualification, issuInstitution, data);
    }

    void doProgram(Project project) {
    }
}
