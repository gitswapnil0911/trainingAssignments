package com.example.demo.services;

import com.example.demo.entity.Catalog;
import com.example.demo.repo.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogService {

    @Autowired
    private MyRepository repo;

    public List<Catalog> getAll(){

        return this.repo.findAll();
    }

    public Catalog addCatalog(Catalog catalog){

        return this.repo.save(catalog);
    }

}
