package com.masg.example.prueba.driven.web_repository.mapping;


import com.masg.example.prueba.driven.web_repository.dto.EmployeeDTO;
import com.masg.example.prueba.model.HourlyEmployee;
import com.masg.example.prueba.model.MonthlyEmployee;
import org.mapstruct.Mapper;

@Mapper
public class EmployeeMapper {

    HourlyEmployee dtoToHourlyEmployee(EmployeeDTO employeeDTO) {

        return HourlyEmployee
                .builder()
                .id(employeeDTO.getId())
                .name(employeeDTO.getName())
                .contractTypeName(employeeDTO.getContractTypeName())
                .roleId(employeeDTO.getRoleId())
                .roleName(employeeDTO.getRoleName())
                .roleDescription(employeeDTO.getRoleDescription())
                .hourlySalary(employeeDTO.getHourlySalary())
                .monthlySalary(employeeDTO.getMonthlySalary())
                .build();
    }

    ;

    MonthlyEmployee dtoToMonthlyEmployee(EmployeeDTO employeeDTO) {
        return MonthlyEmployee
                .builder()
                .id(employeeDTO.getId())
                .name(employeeDTO.getName())
                .contractTypeName(employeeDTO.getContractTypeName())
                .roleId(employeeDTO.getRoleId())
                .roleName(employeeDTO.getRoleName())
                .roleDescription(employeeDTO.getRoleDescription())
                .hourlySalary(employeeDTO.getHourlySalary())
                .monthlySalary(employeeDTO.getMonthlySalary())
                .build();
    }
}