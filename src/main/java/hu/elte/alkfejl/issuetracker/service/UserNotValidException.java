package hu.elte.alkfejl.issuetracker.service;


public class UserNotValidException extends Exception {
    public UserNotValidException(String message) { super(message); }
}
