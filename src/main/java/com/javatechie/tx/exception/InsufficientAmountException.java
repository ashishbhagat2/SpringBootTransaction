package com.javatechie.tx.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class InsufficientAmountException extends RuntimeException {
    public InsufficientAmountException() {
    }
}
