package com.example.demo.service;

import com.example.demo.entity.CibilScore;
import com.example.demo.repo.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CibilService {

    @Autowired
    private MyRepository repo;

    public List<CibilScore> getAll(){

        return this.repo.findAll();
    }

    public CibilScore addCibilScore(CibilScore cibilScore){

        return this.repo.save(cibilScore);
    }

    public CibilScore findCibilScoreByPanCardNumber(String panCardNumber){

        return this.repo.findCibilScoreByPanCardNumber(panCardNumber);

    }

}
