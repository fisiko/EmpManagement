package com.example.empmanagement.repo;

import com.example.empmanagement.model.Address;
import com.example.empmanagement.model.Department;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AddressRepo extends CrudRepository<Address,Long> {
    List<Address> findAll();
}
