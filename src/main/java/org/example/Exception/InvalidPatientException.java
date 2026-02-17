package org.example.Exception;

public class InvalidPatientException extends RuntimeException {
    public InvalidPatientException(String message) {
        super(message);
    }
}
