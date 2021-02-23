package com.exercicio1.exercicio1.controllers;

import java.util.List;

import com.exercicio1.exercicio1.dto.EmployeeDTO;
import com.exercicio1.exercicio1.services.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping
    public ResponseEntity<List<EmployeeDTO>> getEmployee(){

        List<EmployeeDTO> list = service.getEmployees();
        return ResponseEntity.ok().body(list);
    }
    
}
