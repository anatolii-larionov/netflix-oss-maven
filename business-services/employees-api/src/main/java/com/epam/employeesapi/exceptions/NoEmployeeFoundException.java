package com.epam.employeesapi.exceptions;

public class NoEmployeeFoundException extends RuntimeException {

    public NoEmployeeFoundException() {
    }

    public NoEmployeeFoundException(String message) {
        super(message);
    }
}
