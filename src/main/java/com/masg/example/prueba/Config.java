package com.masg.example.prueba;

import com.masg.example.prueba.driven.web_repository.employee.EmployeeWebApiRepository;
import com.masg.example.prueba.driven.web_repository.mapping.EmployeeFactory;
import com.masg.example.prueba.driven.web_repository.mapping.EmployeeMapper;
import com.masg.example.prueba.port.EmployeeRepository;
import com.masg.example.prueba.service.EmployeesService;
import com.masg.example.prueba.services.EmployeesServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class Config {

    @Bean
    EmployeeMapper getEmployeeMapper() {
        return new EmployeeMapper();
    }

    @Bean
    EmployeeFactory getEmployeeFactory(EmployeeMapper employeeMapper) {
        return new EmployeeFactory(employeeMapper);
    }

    @Bean
    EmployeeWebApiRepository geEmployeeWebApiRepository(WebClient webClient, EmployeeFactory employeeFactory) {
        return new EmployeeWebApiRepository(webClient, employeeFactory);
    }

    @Bean
    EmployeesService getEmployeesService(EmployeeRepository employeeRepository) {
        return new EmployeesServiceImpl(employeeRepository);
    }

}
