package com.employee.portal;

import com.employee.portal.entity.Employee;
import com.employee.portal.service.EmployeeSvcImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeSvcImplTest {

    @InjectMocks
    EmployeeSvcImpl employeeSvcImpl;

    @Test
    public void findAllEmployeeTest_list_isEmpty(){
        Assert.assertTrue(employeeSvcImpl.findAllEmployee().isEmpty());
    }

    @Test
    public void findAllEmployeeTest_list_isNotEmpty(){
        Assert.assertFalse(employeeSvcImpl.findAllEmployee().isEmpty());
    }

    @Test
    public void createEmployee_200(){
        Employee employee=new Employee();
        employee.setFirstName("abc");
        employee.setGender("Male");
        Assert.assertNotNull(employeeSvcImpl.createEmployee(employee));
    }

}
