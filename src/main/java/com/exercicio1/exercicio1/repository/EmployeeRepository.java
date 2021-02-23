package com.exercicio1.exercicio1.repository;

import java.util.ArrayList;
import java.util.List;

import com.exercicio1.exercicio1.entities.Employee;

import org.springframework.stereotype.Component;

@Component
public class EmployeeRepository {
    
    public List<Employee> getEmployee(){

        Employee e1 = new Employee();
        e1.setName("Guilherme");
        e1.setSalary(1000.00);
        e1.setAddress("Rua X, 123");
        e1.setEmail("Guilherme@hotmail.com");

        Employee e2 = new Employee();
        e2.setName("Alex");
        e2.setSalary(1500.00);
        e2.setAddress("Rua Y, 1423");
        e2.setEmail("Alex@hotmail.com");

        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);

        return list;
    }
}
