package com.deploy.praktikum1.controller;

import jakarta.validation.ConstraintViolationException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class ErrorController {

    @ExceptionHandler(Exception.class)
    public Map<String, String> errorHandler(Exception e) {
        return Map.of(
                "error", "Invalid input data"
        );
    }

}
