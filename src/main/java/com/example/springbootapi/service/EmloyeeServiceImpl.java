package com.example.springbootapi.service;

import com.example.springbootapi.entity.Employee;
import com.example.springbootapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmloyeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    @Override
    public List<Employee> getAllEmployees(){
        return (List<Employee>) employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long emloyeeId) {
        return null;
    }

    @Override
    public void deleteById(Long emloyeeId) {

    }

    @Override
    public Employee updateEmployeeById(Long emloyeeId, Employee employee) {
        return null;
    }
}
