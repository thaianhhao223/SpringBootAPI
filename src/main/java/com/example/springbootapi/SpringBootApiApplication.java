package com.example.springbootapi;

import com.example.springbootapi.entity.Employee;
import com.example.springbootapi.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApiApplication.class, args);
    }
    private void insertFourEmployees(EmployeeRepository repository) {
        repository.save(new Employee("Dalia", "Abo Sheasha","abc@g.com"));
        repository.save(new Employee("Trisha", "Gee","abc@g.com"));
        repository.save(new Employee("Helen", "Scott","abc@g.com"));
        repository.save(new Employee("Mala", "Gupta","abc@g.com"));
    }
    @Bean
    public CommandLineRunner run(EmployeeRepository repository) {
        return (args) -> {
            insertFourEmployees(repository);
            System.out.println(repository.findAll());
        };
    }

}
