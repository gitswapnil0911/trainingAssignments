package com.example.demo.controllers;

import com.example.demo.entity.LoanApplication;
import com.example.demo.services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(value = "*")
public class LoanController {

    @Autowired
    private LoanService service;

    @GetMapping(value = "/loanApplication")
    public List<LoanApplication> getLoans(){

        return this.service.getAll();
    }

    @GetMapping(value = "/loanApplication/{id}")
    public Optional<LoanApplication> findCibilScore(@PathVariable("id") Long id){

        return this.service.findById(id);
    }

    @GetMapping(value = "/loanApplication/status/{status}")
    public LoanApplication findLoanByStatus(@PathVariable("status") String status){

        return this.service.findByLoanStatus(status);
    }

    @GetMapping(value = "/loanApplication/type/{type}")
    public LoanApplication findLoanByType(@PathVariable("type") String type){

        return this.service.findByLoanType(type);
    }

}
