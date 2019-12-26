package ru.job4j.oop.profession;

import java.time.LocalDate;

public class Diagnose {
    private String pacientName;
    private LocalDate data;
    private Long registrData;

    public Diagnose heal(Pacient pacient) {
        return new Diagnose();
    }
}
