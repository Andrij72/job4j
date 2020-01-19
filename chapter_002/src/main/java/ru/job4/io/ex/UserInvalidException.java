package ru.job4.io.ex;

public class UserInvalidException extends UserNotFoundException {
    public UserInvalidException(String massage) {
        super(massage);
    }
}
