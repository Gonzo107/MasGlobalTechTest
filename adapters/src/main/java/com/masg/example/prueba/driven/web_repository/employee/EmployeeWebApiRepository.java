package com.masg.example.prueba.driven.web_repository.employee;

import com.masg.example.prueba.driven.web_repository.dto.EmployeeDTO;
import com.masg.example.prueba.driven.web_repository.mapping.EmployeeFactory;
import com.masg.example.prueba.exception.EmployeeError;
import com.masg.example.prueba.model.Employee;
import com.masg.example.prueba.port.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class EmployeeWebApiRepository implements EmployeeRepository {

    private final WebClient employeesWebService;
    private final EmployeeFactory employeeFactory;

    @Override
    public Flux<Employee> retrieveAll() {
        return employeesWebService.get()
                .exchange()
                .onErrorMap(error -> EmployeeError.Types.EXECUTION_ERROR.build())
                .flatMapMany(response -> response.bodyToFlux(EmployeeDTO.class))
                .map(employeeFactory::getEmployeeFromDTO);
    }

    @Override
    public Mono<Employee> retrieveById(int id) {

        return this.retrieveAll()
                .filter(employee -> employee.getId() == id)
                .singleOrEmpty()
                .switchIfEmpty(Mono.error(EmployeeError.Types.EMPLOYEE_DOES_NOT_EXIST.build()));
    }
}
