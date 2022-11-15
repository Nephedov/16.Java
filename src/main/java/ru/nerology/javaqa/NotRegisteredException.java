package ru.nerology.javaqa;

public class NotRegisteredException extends RuntimeException {
    public NotRegisteredException(String text) {
        super(text);
    }
}
