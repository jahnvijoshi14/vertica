package com.vertica.vertica_connector.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vertica.vertica_connector.entity.Employee;
import com.vertica.vertica_connector.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService employeeService;
  
   
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Employee>> getEmployeeById() {
        List<Employee> employees = employeeService.findAll();
        return new ResponseEntity<>(employees,HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Integer> save(@RequestBody Employee employees) {
        Integer employee = employeeService.save(employees);
        return new ResponseEntity<>(employee,HttpStatus.OK);
    }
 }