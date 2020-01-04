package com.masg.example.prueba.service;

import com.masg.example.prueba.model.Employee;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmployeesService {

    Flux<Employee> getAll();

    Mono<Employee> getById(int id);

}
