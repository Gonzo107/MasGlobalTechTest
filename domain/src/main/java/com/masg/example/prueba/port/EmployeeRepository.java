package com.masg.example.prueba.port;

import com.masg.example.prueba.model.Employee;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmployeeRepository {

    Flux<Employee> retrieveAll();

    Mono<Employee> retrieveById(int id);
}
