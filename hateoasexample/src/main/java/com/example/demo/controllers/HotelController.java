package com.example.demo.controllers;

import com.example.demo.entity.Hotel;
import com.example.demo.repo.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RestController
public class HotelController {

    @Autowired
    private HotelRepository repo;

    @GetMapping(value = "/hotel/{id}")
    public Hotel findById(@PathVariable("id") int id){

        return this.repo.findById(id).get();
    }

    @GetMapping(value = "/hotel",produces = "application/hal+json")
    public Resources<Hotel> findAll(){

        List<Hotel> hotelList = this.repo.findAll();

        List<Link> links = new ArrayList<>();

        for (Hotel eachHotel: hotelList)
              {

                  Link selfLink = linkTo(methodOn(HotelController.class).findById(eachHotel.getId())).withSelfRel();

                  links.add(selfLink);
        }

        Resources<Hotel> resource = new Resources<Hotel>(hotelList,links);
        return resource;
    }


}
