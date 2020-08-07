package com.employee.portal.controller;

import com.employee.portal.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="employee")
public class EmployeeController {

    @GetMapping(value="/getempdetails")
    public Employee getEmployeeDetails(@RequestParam String empId){
        Employee employee=new Employee();
        return employee;
    }
}
