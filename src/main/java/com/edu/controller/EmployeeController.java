package com.edu.controller;

import com.edu.model.Employee;
import com.edu.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    public void createEmployee(@RequestBody Employee employee) {
        employeeService.createEmployee(employee);
    }

    @PutMapping("/{id}")
    public void updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        employee.setId(id);
        employeeService.updateEmployee(employee);
    }

    @GetMapping("/age/under-30")
    public List<Employee> getEmployeesByAge() {
        return employeeService.getEmployeesByAge();
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }

    @GetMapping("/byAge")
    public String getEmployeesByAge(@RequestParam int age) {
        return employeeService.getEmployeesByAgeFunction(age);
    }

    /*@GetMapping("/employee")
    public EmployeeDetails getEmployee(@RequestParam String firstName, @RequestParam String lastName) {
        System.out.println(firstName + " " + lastName);
        return employeeService.getEmployeeDetails(firstName, lastName);
}*/
}


