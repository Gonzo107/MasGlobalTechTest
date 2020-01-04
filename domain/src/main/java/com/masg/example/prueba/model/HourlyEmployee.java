package com.masg.example.prueba.model;

import lombok.experimental.SuperBuilder;

@SuperBuilder(toBuilder = true)
public class HourlyEmployee extends Employee {


    public HourlyEmployee calculateAnnualSalary() {
        float annualSalary = this.getHourlySalary() * 12 * 120;
        return this.toBuilder().annualSalary(annualSalary).build();
    }
}
