package ru.job4j.oop.profession;

public class Engineer extends Profession {
    private String cualification;
    private String issuInstitution;
    private Long data;

    public Engineer(String cualification, String issuInstitution, Long data) {
        this.cualification = cualification;
        this.issuInstitution = issuInstitution;
        this.data = data;
    }

    public Engineer(String name, String surname, String education, String birthday, String cualification, String issuInstitution, Long data) {
        super(name, surname, education, birthday);
        this.cualification = cualification;
        this.issuInstitution = issuInstitution;
        this.data = data;
    }

    public String getCualification() {
        return cualification;
    }

    public String getIssuInstitution() {
        return issuInstitution;
    }

    public Long getData() {
        return data;
    }
}
