package com.example.springbootapi.service;

import com.example.springbootapi.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    public Employee saveEmployee(Employee employee);
    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(Long emloyeeId);
    public void deleteById(Long emloyeeId);
    public Employee updateEmployeeById(Long emloyeeId, Employee employee);
}
