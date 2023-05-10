package com.example.empmanagement.service;

import com.example.empmanagement.model.Address;
import com.example.empmanagement.model.Employee;
import com.example.empmanagement.repo.AddressRepo;
import com.example.empmanagement.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {
    @Autowired
    private EmployeeRepo repo;

    public EmpService(EmployeeRepo repo){
        this.repo = repo;
    }
    public EmpService(){

    }

    public List<Employee> getAll() {
        return this.repo.findAll();
    }


    public Employee getEmployee(Long id) {

        return this.repo.findById(id).get();

    }


    public Employee createEmployee ( Employee emp){

        return this.repo.save(emp);

    }

    public Employee deleteEmployee (long id){
        Employee removed = this.getEmployee(id);
        this.repo.deleteById(id);
        return removed;

    }

}
