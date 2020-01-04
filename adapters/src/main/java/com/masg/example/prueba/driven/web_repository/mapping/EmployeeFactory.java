package com.masg.example.prueba.driven.web_repository.mapping;

import com.masg.example.prueba.driven.web_repository.dto.EmployeeDTO;
import com.masg.example.prueba.model.Employee;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class EmployeeFactory {

    private final EmployeeMapper employeeMapper;

    private enum EmployeeContractType {
        HourlySalaryEmployee,
        MonthlySalaryEmployee;
    }

    public Employee getEmployeeFromDTO(EmployeeDTO dto) {
        switch (EmployeeContractType.valueOf(dto.getContractTypeName())) {
            case HourlySalaryEmployee:
                return employeeMapper.dtoToHourlyEmployee(dto).calculateAnnualSalary();

            case MonthlySalaryEmployee:
                return employeeMapper.dtoToMonthlyEmployee(dto).calculateAnnualSalary();

            default:
                return null;
        }
    }
}
