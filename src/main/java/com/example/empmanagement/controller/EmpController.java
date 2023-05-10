package com.example.empmanagement.controller;

import com.example.empmanagement.model.Employee;
import com.example.empmanagement.repo.EmployeeRepo;
import com.example.empmanagement.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/employee")
public class EmpController {

        @Autowired
        EmployeeRepo mRepo;

        @Autowired
    EmpService service;

        @GetMapping("/read")
        public List<Employee> read() {
            return service.getAll();
        }

        @GetMapping("/read/{id}")
        public Employee readOne(@PathVariable long id ) {
            return service.getEmployee(id);
        }

        @PostMapping("/add")
        public Employee add(@RequestBody Employee newEmp){
            return service.createEmployee(newEmp);
        }

        @DeleteMapping("/delete/{id}")
        public void delete(@PathVariable long id ) {
            service.deleteEmployee(id);
        }

    }
