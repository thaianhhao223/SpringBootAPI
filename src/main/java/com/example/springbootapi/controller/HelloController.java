package com.example.springbootapi.controller;

import com.example.springbootapi.entity.Employee;
import com.example.springbootapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    //@RequestMapping(value = "/",method = RequestMethod.GET)
    @GetMapping("/")
    public String helloWorld(){
        return "Hello Nguyen Trong Tien";
    }
}
