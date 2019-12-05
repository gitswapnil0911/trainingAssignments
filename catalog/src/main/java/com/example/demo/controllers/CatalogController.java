package com.example.demo.controllers;

import com.example.demo.entity.Catalog;
import com.example.demo.services.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "*")
public class CatalogController {

    @Autowired
    private CatalogService service;

    @GetMapping(value = "/catalog")
    public List<Catalog> getCatalog(){

        return this.service.getAll();
    }

    @PutMapping(value = "/catalog", produces = "application/JSON", consumes = "application/JSON")
    public Catalog addCatalog(@RequestBody Catalog catalog){

        return this.service.addCatalog(catalog);

    }

}
