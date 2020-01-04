package com.masg.example.prueba.driver;


import com.masg.example.prueba.model.Employee;
import com.masg.example.prueba.service.EmployeesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "/employees")
@RequiredArgsConstructor
public class EmployeesController {

    private final EmployeesService employeesService;

    @GetMapping
    public Flux<Employee> getAll() {

        return employeesService.getAll();
    }

    @GetMapping("/{id}")
    public Mono<Employee> getAll(@PathVariable int id) {
        return employeesService.getById(id);
    }

}
