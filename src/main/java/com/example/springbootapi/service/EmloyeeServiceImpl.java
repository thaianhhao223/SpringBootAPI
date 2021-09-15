package com.example.springbootapi.service;

import com.example.springbootapi.entity.Employee;
import com.example.springbootapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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
    public Employee updateEmployeeById(Long emloyeeId, Employee employeeNew) {
        Employee employeeDB = employeeRepository.findById(emloyeeId).get();
        if(Objects.nonNull(employeeNew.getFirstName())&&
                !"".equalsIgnoreCase(employeeNew.getFirstName())){

        }
        if(Objects.nonNull(employeeNew.getLastName())&&
                !"".equalsIgnoreCase(employeeNew.getLastName())){

        }
        if(Objects.nonNull(employeeNew.getEmail())&&
                !"".equalsIgnoreCase(employeeNew.getEmail())){

        }
        return employeeRepository.save(employeeDB);
    }
}
