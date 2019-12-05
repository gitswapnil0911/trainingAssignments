package com.example.demo.services;

import com.example.demo.entity.LoanCustomer;
import com.example.demo.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo repo;

    public Iterable<LoanCustomer> getAll(){

        return this.repo.findAll();
    }

    public Iterable<LoanCustomer> sortBy(String propName){

        Sort sortBy = Sort.by(propName);

        return this.repo.findAll(sortBy);
    }

    public Page<LoanCustomer> paginate(int pageNo, int size, String prop){

        Pageable pageRequest = PageRequest.of(pageNo,size,Sort.by(prop));

        Page<LoanCustomer> page = repo.findAll(pageRequest);

        List<LoanCustomer> customerList = new ArrayList<>();
/*
        if(page.hasContent()){
            customerList = page.getContent();
        }*/
        return page;
    }

    public LoanCustomer add(LoanCustomer cust){
        return this.repo.save(cust);
    }

}

