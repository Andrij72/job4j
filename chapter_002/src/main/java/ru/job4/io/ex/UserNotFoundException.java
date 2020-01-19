package ru.job4.io.ex;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String massage) {
        super(massage);
    }
}
