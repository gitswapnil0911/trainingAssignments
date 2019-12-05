package com.example.demo.controllers;

import com.example.demo.entity.CibilScore;
import com.example.demo.service.CibilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(value = "*")
public class CibilController {

    @Autowired
    private CibilService service;

    @GetMapping(value = "/cibilScore")
    public List<CibilScore> getCibilScore(){

        return this.service.getAll();
    }

    @GetMapping(value = "/cibilScore/{panNumber}")
    public CibilScore findCibilScore(@PathVariable("panNumber") String panCardNumber){

        return this.service.findCibilScoreByPanCardNumber(panCardNumber);
    }

    @PostMapping(value = "/cibilScore", produces = "application/JSON", consumes = "application/JSON")
    public CibilScore addCibilScore(@RequestBody CibilScore cibilScore){

        return this.service.addCibilScore(cibilScore);
    }

}
