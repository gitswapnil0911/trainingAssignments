package com.jpm.tdd.app.exception;

public class EmptyMyStackException extends Exception {
    public EmptyMyStackException(){}
    public EmptyMyStackException(String message) {
    super(message);
    }
}
