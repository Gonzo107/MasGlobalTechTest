package com.masg.example.prueba.services;

import com.masg.example.prueba.model.Employee;
import com.masg.example.prueba.port.EmployeeRepository;
import com.masg.example.prueba.utils.factories.EmployeeTestFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class EmployeesServiceImplTest {

    @Mock
    EmployeeRepository employeeRepository;

    @InjectMocks
    EmployeesServiceImpl employeesService;

    private Flux<Employee> employeeFlux;


    @Test
    void getAll() {

        Employee hourlyEmployee = EmployeeTestFactory.getTestHourlyEmployee();

        Flux<Employee> employees = Flux.just(hourlyEmployee, hourlyEmployee);
        when(employeeRepository.retrieveAll()).thenReturn(employees);


        StepVerifier.create(employeesService.getAll())
                .expectNext(hourlyEmployee)
                .expectNext(hourlyEmployee)
                .verifyComplete();

    }

    @Test
    void getById() {

        Employee hourlyEmployee = EmployeeTestFactory.getTestHourlyEmployee();

        Mono<Employee> employee = Mono.just(hourlyEmployee);
        when(employeeRepository.retrieveById(hourlyEmployee.getId())).thenReturn(employee);


        StepVerifier.create(employeesService.getById(hourlyEmployee.getId()))
                .expectNext(hourlyEmployee)
                .verifyComplete();
    }
}