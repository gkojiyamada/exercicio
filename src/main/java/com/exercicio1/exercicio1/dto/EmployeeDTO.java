package com.exercicio1.exercicio1.dto;

public class EmployeeDTO {
    
    private String address;
    private Double salary;

    public EmployeeDTO(String address, Double salary){
        setAddress(address);
        setSalary(salary);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
