package com.edu.service;

import com.edu.model.Employee;
import com.edu.model.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    public List<Employee> getAllEmployees() {
        return employeeMapper.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return employeeMapper.findById(id);
    }

    public void createEmployee(Employee employee) {
        employeeMapper.insert(employee);
    }

    public void updateEmployee(Employee employee) {
        employeeMapper.update(employee);
    }
    public List<Employee> getEmployeesByAge() {
        return employeeMapper.getEmployeesByAge();
    }

    public String getEmployeesByAgeFunction(int age) {
        return employeeMapper.getEmployeesByAgeFunction(age);
    }
    public void deleteEmployee(Long id) {
        employeeMapper.delete(id);
    }
}