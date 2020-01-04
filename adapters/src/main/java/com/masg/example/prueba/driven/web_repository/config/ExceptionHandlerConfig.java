package com.masg.example.prueba.driven.web_repository.config;

import com.masg.example.prueba.exception.EmployeeError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import reactor.core.publisher.Mono;

@RestControllerAdvice
public class ExceptionHandlerConfig {


    @ExceptionHandler(EmployeeError.class)
    public Mono<ResponseEntity<String>> handleBusinessException(EmployeeError ex) {
        switch (ex.getType()) {
            case EMPLOYEE_DOES_NOT_EXIST:
                return Mono.just(ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getCode()));
            case EXECUTION_ERROR:
            default:
                return Mono.just(ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getCode()));
        }
    }


}