package com.javatechie.tx.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyControllerAdvice {

    @ExceptionHandler(InsufficientAmountException.class)
    public ResponseEntity<String> insufficientFunds(InsufficientAmountException insufficientAmountException) {
        return new ResponseEntity<>("Insufficient funds", HttpStatus.BAD_REQUEST);
    }
}
