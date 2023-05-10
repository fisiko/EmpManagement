package com.example.empmanagement.service;

import com.example.empmanagement.model.Address;
import com.example.empmanagement.model.Department;
import com.example.empmanagement.repo.AddressRepo;
import com.example.empmanagement.repo.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class DepService {

    @Autowired
    private DepartmentRepo repo;

    public DepService(DepartmentRepo repo){
        this.repo = repo;
    }
    public DepService(){

    }

    public List<Department> getAll() {
        return this.repo.findAll();
    }


    public Department getDepartment(Long id) {

        return this.repo.findById(id).get();

    }


    public Department createDepartment ( Department dep){

        return this.repo.save(dep);

    }

    public Department deleteDepartment (long id){
        Department removed = this.getDepartment(id);
        this.repo.deleteById(id);
        return removed;

    }


}
