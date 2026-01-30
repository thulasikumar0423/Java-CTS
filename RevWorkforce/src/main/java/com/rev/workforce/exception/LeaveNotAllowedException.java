package com.rev.workforce.exception;

public class LeaveNotAllowedException extends RuntimeException {

    public LeaveNotAllowedException(String message) {
        super(message);
    }
}
