package com.jpm.moduleassesment;

public class InvalidEmployeeName extends Exception{
    public InvalidEmployeeName() {
    }

    public InvalidEmployeeName(String message) {
        super(message);
    }
}
