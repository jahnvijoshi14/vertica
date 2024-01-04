package com.vertica.vertica_connector.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vertica.vertica_connector.entity.Employee;
import com.vertica.vertica_connector.repository.EmployeeRepository;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getEmployeeById() {
        return employeeRepository.findAll();
    }

    public int save(Employee employee) {
        employee.setId(employeeRepository.getId()+1);
        return employeeRepository.save(employee);
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
}