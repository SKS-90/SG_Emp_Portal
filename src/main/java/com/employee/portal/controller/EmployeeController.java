package com.employee.portal.controller;

import com.employee.portal.entity.Employee;
import com.employee.portal.service.EmployeeSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {

    @Autowired
    private EmployeeSvc employeeSvc;

    /*
    * getAllEmployeeDetails method will get
    * all register employee.
    * Method type GET
    * */

    @GetMapping(value="/getall")
    public List<Employee> getAllEmployeeDetails(){
        return employeeSvc.findAllEmployee();
    }

    /*
    * employeeRegister create a new record for employee.
    * Method type POST
    * */
    @PostMapping(value="/register")
    public Employee employeeRegister(@RequestBody Employee employee){
        return employeeSvc.createEmployee(employee);
    }
}
