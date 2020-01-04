# Mas global Technical entrance test

## Description
REST API built based on an hexagonal architecture following DDD principles.
The API exposes the existing employees and calculates it's salaries based con their contract type.

For hourly employees their annual salary will be  120 * hourlySalary * 12
For monthly employees their annual salary will be 12 * monthlySalary

### Specs:
- Spring boot 2.2.2
- Spring webflux
- Reactor core 3.3.1

Spring boot is chosen because it gives a clear and concise way to create REST API without much effort. It's dependency injection system allows us to isolate our domain and data layers and connect them at runtime.
It has built in support for a reactive stack such as Reactor core  with it's webflux API.


### Usage

#### Get all employees
All the employees are exposed in  GET localhost:8080/employees

#### Get employee by id
The individual employees are exposed in  GET localhost:8080/employees/{id}





