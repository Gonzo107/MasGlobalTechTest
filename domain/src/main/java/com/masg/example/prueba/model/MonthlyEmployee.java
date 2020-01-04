package com.masg.example.prueba.model;

import lombok.experimental.SuperBuilder;

@SuperBuilder(toBuilder = true)
public class MonthlyEmployee extends Employee {

    public MonthlyEmployee calculateAnnualSalary() {
        float annualSalary = this.getMonthlySalary() * 12;
        return this.toBuilder().annualSalary(annualSalary).build();
    }
}
