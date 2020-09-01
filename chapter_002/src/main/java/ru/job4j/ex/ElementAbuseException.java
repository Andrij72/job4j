package ru.job4j.ex;

public class ElementAbuseException extends UserNotFoundException {
    public ElementAbuseException(String massage) {
        super(massage);
    }
}
