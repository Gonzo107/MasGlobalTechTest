package com.masg.example.prueba.exception;

import lombok.Getter;

@Getter
public class DomainError extends RuntimeException {

    private final String code;

    DomainError(String message) {
        super(message);
        this.code=message;
    }

    DomainError(String message, String code) {
        super(message);
        this.code = code;
    }

}
