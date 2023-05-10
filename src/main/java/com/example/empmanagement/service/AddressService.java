package com.example.empmanagement.service;

import com.example.empmanagement.model.Address;
import com.example.empmanagement.repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressRepo repo;

    public AddressService(AddressRepo repo){
        this.repo = repo;
    }
    public AddressService(){

    }

    public List<Address> getAll() {
        return this.repo.findAll();
    }


    public Address getAddress(Long id) {

        return this.repo.findById(id).get();

    }


    public Address createAddress ( Address addr){

        return this.repo.save(addr);

    }

    public Address deleteAddress (long id){
        Address removed = this.getAddress(id);
        this.repo.deleteById(id);
        return removed;

    }


}
