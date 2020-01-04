package com.masg.example.prueba.utils.factories;

import com.masg.example.prueba.driven.web_repository.dto.EmployeeDTO;
import com.masg.example.prueba.model.Employee;
import com.masg.example.prueba.model.HourlyEmployee;
import com.masg.example.prueba.model.MonthlyEmployee;

public class EmployeeTestFactory {

    private static final int TEST_ID = 1;
    private static final String TEST_NAME = "TEST";
    private static final String TEST_CONTRACT_TYPE_HOURLY = "HourlySalaryEmployee";
    private static final String TEST_CONTRACT_TYPE_MONTHLY = "MonthlySalaryEmployee";
    private static final int TEST_ROLEID = 2;
    private static final String TEST_ROLENAME = "ROLE";
    private static final String TEST_ROLEDESC = "DESC";
    private static final float TEST_HOURLYSALARY = 8000;
    private static final float TEST_MONTHLYSALARY = 4000000;

    public static HourlyEmployee getTestHourlyEmployee() {
        return HourlyEmployee
                .builder()
                .id(TEST_ID)
                .name(TEST_NAME)
                .contractTypeName(TEST_CONTRACT_TYPE_HOURLY)
                .roleId(TEST_ROLEID)
                .roleName(TEST_ROLENAME)
                .roleDescription(TEST_ROLEDESC)
                .hourlySalary(TEST_HOURLYSALARY)
                .monthlySalary(TEST_MONTHLYSALARY)
                .build();
    }

    public static EmployeeDTO getEmployeeDTOHourly(){
        EmployeeDTO employeeDTO = new EmployeeDTO();

        employeeDTO.setId(TEST_ID);
        employeeDTO.setName(TEST_NAME);
        employeeDTO.setContractTypeName(TEST_CONTRACT_TYPE_HOURLY);
        employeeDTO.setRoleId(TEST_ROLEID);
        employeeDTO.setRoleName(TEST_ROLENAME);
        employeeDTO.setRoleDescription(TEST_ROLEDESC);
        employeeDTO.setHourlySalary(TEST_HOURLYSALARY);
        employeeDTO.setMonthlySalary(TEST_MONTHLYSALARY);
        return employeeDTO;
    }

    public static EmployeeDTO getEmployeeDTOMonthly(){
        EmployeeDTO employeeDTO = new EmployeeDTO();

        employeeDTO.setId(TEST_ID);
        employeeDTO.setName(TEST_NAME);
        employeeDTO.setContractTypeName(TEST_CONTRACT_TYPE_MONTHLY);
        employeeDTO.setRoleId(TEST_ROLEID);
        employeeDTO.setRoleName(TEST_ROLENAME);
        employeeDTO.setRoleDescription(TEST_ROLEDESC);
        employeeDTO.setHourlySalary(TEST_HOURLYSALARY);
        employeeDTO.setMonthlySalary(TEST_MONTHLYSALARY);
        return employeeDTO;
    }

}
