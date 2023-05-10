package com.example.empmanagement.controller;

import com.example.empmanagement.model.Department;
import com.example.empmanagement.repo.DepartmentRepo;
import com.example.empmanagement.service.DepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/department")
public class DepController {

    @Autowired
    DepService service;

    @Autowired
    DepartmentRepo mRepo;

    @GetMapping("/read")
    public List<Department> read() {
        return service.getAll();
    }

    @GetMapping("/read/{id}")
    public Department readOne(@PathVariable long id ) {
        return service.getDepartment(id);
    }

    @PostMapping("/add")
    public Department add(@RequestBody Department newDep){
        return service.createDepartment(newDep);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id ) {
        service.deleteDepartment(id);
    }

}
