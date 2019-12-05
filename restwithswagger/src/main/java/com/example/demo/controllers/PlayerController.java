package com.example.demo.controllers;

import com.example.demo.entity.Player;
import com.example.demo.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(value = "*",methods = {RequestMethod.GET,RequestMethod.POST})
public class PlayerController {

    @Autowired
    private PlayerService service;

    @GetMapping(value = "/player")
    public List<Player >getPlayer(){

        return this.service.getAll();
    }

    @PostMapping(value = "/player", produces = "application/JSON", consumes = "application/JSON")
    public Player addPlayer(@Valid @RequestBody Player player){

        return this.service.addPlayer(player);
    }

    @GetMapping(value = "/player/{name}")
    public Player getPlayerByName(@PathVariable("name") String name){

        return this.service.findPlayerByName(name);
    }

}
