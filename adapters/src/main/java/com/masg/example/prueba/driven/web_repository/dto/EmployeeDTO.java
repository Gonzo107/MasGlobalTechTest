package com.masg.example.prueba.driven.web_repository.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmployeeDTO {
     int id;
     String name;
     String contractTypeName;
     int roleId;
     String roleName;
     String roleDescription;
     float hourlySalary;
     float monthlySalary;
}
