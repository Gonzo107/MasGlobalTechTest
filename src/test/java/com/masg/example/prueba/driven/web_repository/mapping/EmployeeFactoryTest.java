package com.masg.example.prueba.driven.web_repository.mapping;

import com.masg.example.prueba.driven.web_repository.dto.EmployeeDTO;
import com.masg.example.prueba.model.Employee;
import com.masg.example.prueba.model.HourlyEmployee;
import com.masg.example.prueba.model.MonthlyEmployee;
import com.masg.example.prueba.utils.factories.EmployeeTestFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {

    private EmployeeMapper employeeMapper = new EmployeeMapper();

    EmployeeFactory employeeFactory = new EmployeeFactory(employeeMapper);

    @Test
    void getHourlyEmployeeFromDTO() {

        EmployeeDTO hourlyDTO = EmployeeTestFactory.getEmployeeDTOHourly();

        Employee hourlyEmployee = employeeFactory.getEmployeeFromDTO(hourlyDTO);

        assertTrue(hourlyEmployee instanceof HourlyEmployee);

    }

    @Test
    void getMonthlyEmployeeFromDTO() {

        EmployeeDTO monthlyDTO = EmployeeTestFactory.getEmployeeDTOMonthly();

        Employee monthlyEmployee = employeeFactory.getEmployeeFromDTO(monthlyDTO);

        assertTrue(monthlyEmployee instanceof MonthlyEmployee);

    }

    @Test
    void calculateCorrectHourlyAnnualSalary() {

        float expectedAnnualSalary = 11520000;

        EmployeeDTO hourlyDTO = EmployeeTestFactory.getEmployeeDTOHourly();

        Employee hourlyEmployee = employeeFactory.getEmployeeFromDTO(hourlyDTO);

        assertEquals(hourlyEmployee.getAnnualSalary(), expectedAnnualSalary);

    }

    @Test
    void getCorrectMonthlyEmployeeFromDTO() {

        float expectedAnnualSalary = 48000000;

        EmployeeDTO monthlyDTO = EmployeeTestFactory.getEmployeeDTOMonthly();

        Employee monthlyEmployee = employeeFactory.getEmployeeFromDTO(monthlyDTO);

        assertEquals(monthlyEmployee.getAnnualSalary(), expectedAnnualSalary);

    }


}