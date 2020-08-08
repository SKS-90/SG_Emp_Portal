package com.employee.portal.service;

import com.employee.portal.entity.Employee;
import com.employee.portal.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeSvcImpl implements EmployeeSvc {

    @Autowired
    private EmployeeRepository employeeRepository;

    /*
     * findAllEmployee method will fetch all record.
     * Parameter non
     * */
    @Override
    public List<Employee> findAllEmployee() {
        List<Employee> empList= (List<Employee>) employeeRepository.findAll();
        return empList;
    }

    /*
     * createEmployee method save new employee
     * those are registering first time.
     * parameter Object
     * */
    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
