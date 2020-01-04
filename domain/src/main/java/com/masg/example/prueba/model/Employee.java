package com.masg.example.prueba.model;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder(toBuilder = true)
public abstract class Employee {

    private final int id;
    private final String name;
    private final String contractTypeName;
    private final int roleId;
    private final String roleName;
    private final String roleDescription;
    private final float hourlySalary;
    private final float monthlySalary;
    private final float annualSalary;

    abstract Employee calculateAnnualSalary();

}
