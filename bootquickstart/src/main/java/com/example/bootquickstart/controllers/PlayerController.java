package com.example.bootquickstart.controllers;

import com.example.bootquickstart.entity.Player;
import com.example.bootquickstart.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    private PlayerService service;

    @GetMapping(value = "/player")
    public List<Player >getPlayer(){

        return this.service.getAll();
    }

    @PostMapping(value = "/player", produces = "application/JSON", consumes = "application/JSON")
    public Player addPlayer(@RequestBody Player player){

        return this.service.addPlayer(player);
    }

    @GetMapping(value = "/player/{name}")
    public Player getPlayerByName(@PathVariable("name") String name){

        return this.service.findPlayerByName(name);
    }

}
