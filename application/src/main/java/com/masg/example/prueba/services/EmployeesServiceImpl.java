package com.masg.example.prueba.services;

import com.masg.example.prueba.model.Employee;
import com.masg.example.prueba.port.EmployeeRepository;
import com.masg.example.prueba.service.EmployeesService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class EmployeesServiceImpl implements EmployeesService {

    private final EmployeeRepository employeeRepository;

    /**
     * Gets all the existing employees with a space and time complexity of O(n)
     *
     *
     * @return A Flux that emits all the existing employees

     */
    @Override
    public Flux<Employee> getAll() {
        return employeeRepository.retrieveAll();
    }

    /**
     * Gets the employee with the given id within the existing employees O(n)
     *
     * @param id The employee id value
     * @return A Mono that emits the employee with the given id

     */
    @Override
    public Mono<Employee> getById(int id) {
        return employeeRepository.retrieveById(id);
    }
}
