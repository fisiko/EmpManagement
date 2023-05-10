package com.example.empmanagement.controller;

import com.example.empmanagement.model.Address;
import com.example.empmanagement.repo.AddressRepo;
import com.example.empmanagement.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/address")
public class AddressController {


        @Autowired
        AddressRepo mRepo;


    @Autowired
    AddressService service;

    public AddressController(AddressService service){
        this.service = service;
    }



        @GetMapping("/read")
        public List<Address> read() {
            return service.getAll();
        }

        @GetMapping("/read/{id}")
        public Address readOne(@PathVariable long id ) {
            return service.getAddress(id);
        }

        @PostMapping("/add")
        public Address add(@RequestBody Address newAddr){
            return this.service.createAddress(newAddr);
        }

        @DeleteMapping("/delete/{id}")
        public void delete(@PathVariable long id ) {
            service.deleteAddress(id);
        }

    }
