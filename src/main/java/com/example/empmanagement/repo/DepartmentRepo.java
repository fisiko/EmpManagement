package com.example.empmanagement.repo;

import com.example.empmanagement.model.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DepartmentRepo extends CrudRepository<Department,Long> {
    List<Department> findAll();
}