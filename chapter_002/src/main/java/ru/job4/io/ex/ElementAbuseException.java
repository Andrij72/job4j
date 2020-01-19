package ru.job4.io.ex;

public class ElementAbuseException extends UserNotFoundException {
    public ElementAbuseException(String massage) {
        super(massage);
    }
}
