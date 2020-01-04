package com.masg.example.prueba.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

public class EmployeeError extends DomainError {

    @Getter
    @RequiredArgsConstructor
    public enum Types {
        EXECUTION_ERROR,
        EMPLOYEE_DOES_NOT_EXIST;

        public EmployeeError build() {
            return new EmployeeError(this);
        }

        public EmployeeError build(String message) {
            return new EmployeeError(this, message);
        }
    }

    private final Types type;

    public EmployeeError(Types types) {
        super(types.name());
        this.type = types;
    }

    public EmployeeError(Types types, String message) {
        super(message, types.name());
        this.type = types;
    }

    public Types getType() {return this.type;}

}