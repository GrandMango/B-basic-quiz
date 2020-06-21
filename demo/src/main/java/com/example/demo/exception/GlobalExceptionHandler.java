package com.example.demo.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

@ControllerAdvice
public class GlobalExceptionHandler {

//    @ExceptionHandler(UserNotFoundException.class)
//    @ResponseBody
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    public  ErrorResult handle( UserNotFoundException ex) {
//        return new ErrorResult(HttpStatus.BAD_REQUEST.value(), ex.getMessage());
//    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResult> handle( MethodArgumentNotValidException ex) {
        String message = ex.getBindingResult().getFieldError().getDefaultMessage();
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'hh:mm:ss:SSSZ");

        ErrorResult errorResult = new ErrorResult(HttpStatus.BAD_REQUEST.value(), message,
                "Bad Request", ZonedDateTime.now().format(pattern));


        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResult);
    }

    @ExceptionHandler( ResourceNotFoundException.class )
    public ResponseEntity<ErrorResult> handle( ResourceNotFoundException ex) {
        String message = ex.getMessage();
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'hh:mm:ss:SSSZ");

        ErrorResult errorResult = new ErrorResult(HttpStatus.NOT_FOUND.value(), message,
                "Bad Request", ZonedDateTime.now().format(pattern));

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResult);
    }
}
