package com.example.demo.controller;

import com.example.demo.entity.CibilScore;
import com.example.demo.entity.LoanCustomer;
import com.example.demo.service.MyClient;
import com.example.demo.service.SecuredClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    private MyClient loadBalancedClient;

    @Autowired
    private SecuredClient secondClient;

    @GetMapping(value = "/loancustomer")
    public Iterable<LoanCustomer> getAllCustomers(){

        return this.loadBalancedClient.findAllCustomers();
    }

    @GetMapping(value = "/getcibil")
    public Iterable<CibilScore> getAllScores(){

        return this.secondClient.findAllCibilScore();
    }

    @GetMapping(value = "/getcibil/{panNumber}")
    public CibilScore findCibilScore(@PathVariable("panNumber") String panCardNumber){

        return this.secondClient.findCibilScore(panCardNumber);
    }



}
