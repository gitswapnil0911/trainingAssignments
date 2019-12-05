package com.example.demo.services;

import com.example.demo.entity.LoanApplication;
import com.example.demo.repo.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoanService {

    @Autowired
    private MyRepository repo;

    public List<LoanApplication> getAll(){

        return this.repo.findAll();
    }

    public LoanApplication findByLoanType(String loanType){

        return this.repo.findByLoanType(loanType);

    }

    public LoanApplication findByLoanStatus(String loanStatus){

        return this.repo.findByLoanStatus(loanStatus);

    }

    public Optional<LoanApplication> findById(long id){

        return this.repo.findById(id);

    }
    /*public CibilScore findCibilScoreByPanCardNumber(String panCardNumber){

        return this.repo.findCibilScoreByPanCardNumber(panCardNumber);

    }*/

}
