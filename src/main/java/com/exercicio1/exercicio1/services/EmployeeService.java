package com.exercicio1.exercicio1.services;

import java.util.ArrayList;
import java.util.List;

import com.exercicio1.exercicio1.dto.EmployeeDTO;
import com.exercicio1.exercicio1.entities.Employee;
import com.exercicio1.exercicio1.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository repo;

    public List<EmployeeDTO> getEmployees(){

        List<Employee> list = repo.getEmployee();
        List<EmployeeDTO> listDTO = new ArrayList<>();
        for(Employee e : list){
            listDTO.add(new EmployeeDTO(e.getAddress(), e.getSalary()));
        }

        return listDTO;
    }
}
