package com.employee.portal.service;

import com.employee.portal.entity.Employee;
import java.util.List;

public interface EmployeeSvc {

    public List<Employee> findAllEmployee();
    public Employee createEmployee(Employee employee);
}
