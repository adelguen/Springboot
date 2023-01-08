package com.onp.Import.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onp.Import.Entity.Employee;
import com.onp.Import.Entity.Page;
import com.onp.Import.Entity.PagingRequest;
import com.onp.Import.Service.EmployeeService;



@RestController
@RequestMapping("employees")
public class EmployeeRestController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public Page<Employee> list(@RequestBody PagingRequest pagingRequest) {
        return employeeService.getEmployees(pagingRequest);
    }
}